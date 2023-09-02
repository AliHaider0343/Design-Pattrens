/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.observer_pattren;

import java.util.ArrayList;

/**
 *
 * @author Ali Haider
 */

interface observer
{
    void update();
}

class bankmanager implements observer
{
Observeable subject;

bankmanager(Observeable subject)
{
 this.subject= subject;   
}
    @Override
    public void update() {
        System.out.println("Bank Manager got Notified. with information Balance : "+this.subject.get_balance());
    }
    
}
class accountholder implements observer
{
Observeable subject;
accountholder(Observeable subject)
{
 this.subject= subject;   
}
    @Override
    public void update() {
                System.out.println("Account Holder got Notified. with information Balance : "+this.subject.get_balance());
    }
    
}



interface Observeable
{
    void add(observer ob);
    void remove(observer ob);
    void Notify();
    public int get_balance();
}
class bank_account implements Observeable 
{
    ArrayList<observer> list;
    int balance;
    bank_account(int balance)
    {
     this.balance=balance;
     this.list= new ArrayList<observer>();
    }

    @Override
    public void add(observer ob) {
        this.list.add(ob);
    }

    @Override
    public void remove(observer ob) {
        this.list.remove(ob);
        }

    @Override
    public void Notify() {
        for(observer ob:list)
        {
         ob.update();
        }
    }
    
    public int get_balance()
    {
     return this.balance;   
    }
    
    public void set_balance(int amount)
    {
      this.balance+=amount;   
    }
    
}
public class Observer_Pattren {

    public static void main(String[] args) {

        bank_account account = new bank_account(100);
        account.add(new bankmanager(account));
        account.add(new accountholder(account));
        account.Notify();
        account.set_balance(900);
        account.Notify();

        
    }
}
