/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.state_and_observer;

import java.util.ArrayList;

/**
 *
 * @author Ali Haider
 */
class context_bank_account {

    int balance;
    state current_state;
    ArrayList<observer> list;

    context_bank_account(int balance) {
        this.balance = balance;
        this.current_state = this.balance > 0 ? new ActiveState(this) : new InActiveState(this);
        this.list = new ArrayList<observer>();
    }

    public void add(observer ob) {
        this.list.add(ob);
    }

    public void remove(observer ob) {
        this.list.remove(ob);
    }

    public void Notify_observers() {
        for (observer ob : list) {
            ob.update();
        }
    }

    public void deposit(int amount) {
        this.current_state.deposit(amount);
    }

    public void withdraw(int amount) {
        this.current_state.withdraw(amount);
    }

    public void check_balance() {
        this.current_state.check_balance();
    }

    public void change_state(state other_state) {
        this.current_state = other_state;

    }

}

interface observer {

    void update();
}

class bankmanager implements observer {

    context_bank_account subject;

    bankmanager(context_bank_account subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("Bank Manager got Notified. with information Balance : " + this.subject.balance);
    }

}

class accountholder implements observer {

    context_bank_account subject;

    accountholder(context_bank_account subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("Account Holder got Notified. with information Balance : " + this.subject.balance);
    }

}

interface state {

    public void deposit(int amount);

    public void withdraw(int amount);

    public void check_balance();

}

class ActiveState implements state {

    context_bank_account Object;

    public ActiveState(context_bank_account Object) {
        this.Object = Object;
    }

    @Override
    public void deposit(int amount) {
        this.Object.balance += amount;
        System.out.println("State Active | Amount Deposited : " + amount);
        check_balance();
        this.Object.Notify_observers();

    }

    @Override
    public void withdraw(int amount) {
        if (amount > this.Object.balance) {
            System.out.println("Insufficient Balance (AMount is greater then Current Balance. ");
            this.check_balance();
        } else {
            this.Object.balance -= amount;
            System.out.println("State Active | Amount Withdraw : " + amount);
            check_balance();
            this.Object.Notify_observers();

            if (this.Object.balance <= 0) {
                this.Object.change_state(new InActiveState(this.Object));
            }
        }

    }

    @Override
    public void check_balance() {
        System.out.println("Current Balance : " + this.Object.balance);

    }

}

class InActiveState implements state {

    context_bank_account Object;

    public InActiveState(context_bank_account Object) {
        this.Object = Object;
    }

    @Override
    public void deposit(int amount) {
        System.out.println("State InActive | Amount Cannot be Deposited. ");

    }

    @Override
    public void withdraw(int amount) {
        System.out.println("State InActive | Amount Cannot be Withdraw. ");
    }

    @Override
    public void check_balance() {
        System.out.println("State InActive | Balance cannot be Checked. ");
    }

}

public class State_and_Observer {

    public static void main(String[] args) {
        context_bank_account account = new context_bank_account(100);
        account.add(new bankmanager(account));
        account.add(new accountholder(account));
        account.check_balance();
        account.deposit(50);
        account.check_balance();
        account.withdraw(200);
        account.withdraw(150);
        account.check_balance();
        account.withdraw(100);
        account.deposit(50);

    }
}
