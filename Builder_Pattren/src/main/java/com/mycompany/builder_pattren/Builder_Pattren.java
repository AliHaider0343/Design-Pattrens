/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.builder_pattren;

/**
 *
 * @author Ali Haider
 */
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /* use builder pattren 

Bank Accounts
1. Simple
        Deposit
        withdraw

2. Premium
        Deposit
        withdraw
        Convert Currency
        Global debit card

3. Gold
        Deposit
        withdraw
        Convert Currency
        Global debit card
        Schedule Payments
        Credit 

 */

//Playes the  role of Director
class Register_Account {

    Bank_account account;

    Register_Account(String type) {
        type = type.toLowerCase();
        switch (type) {
            case "simple account": {
                account = new simple_account();
            }
            break;
            case "premium account": {
                account = new premium_account();
            }
            break;
            case "gold account": {
                account = new gold_account();
            }
            break;
        }
    }

    public Bank_account getAccount() {
        System.out.println("\n.... Account Created Succesfully ! \n");
        return account;
    }

    public void printdata(Bank_account account) {
        account.display_info();

    }
}

//Builder Interface
interface Bank_account {

    ArrayList<Features_wrapper> features = new ArrayList<>();

    public void add_features();

    public Bank_account getAccount();

    public void display_info();

}

class simple_account implements Bank_account {

    simple_account() {
        add_features();
        getAccount();
    }

    @Override
    public void add_features() {
        features.add(new deposit());
        features.add(new withdraw());
    }

    @Override
    public simple_account getAccount() {
        return this;
    }

    @Override
    public void display_info() {

        System.out.println("\n\tAccount Information : ");
        System.out.println("Account Title : Simple Account");
        System.out.println("\nFeatures Included:");

        for (int i = 0; i < features.size(); i++) {
            System.out.println("\t" + (i + 1) + ". " + features.get(i).getClass().getSimpleName());
        }
        System.out.println("\n");
    }

}

class premium_account implements Bank_account {

    premium_account() {
        add_features();
        getAccount();
    }

    @Override
    public void add_features() {
        features.add(new deposit());
        features.add(new withdraw());
        features.add(new convert_currancy());
        features.add(new global_debitcard());
    }

    @Override
    public premium_account getAccount() {
        return this;

    }

    @Override
    public void display_info() {

        System.out.println("\n\tAccount Information : ");
        System.out.println("Account Title : Premium Account");
        System.out.println("\nFeatures Included:");

        for (int i = 0; i < features.size(); i++) {
            System.out.println("\t" + (i + 1) + ". " + features.get(i).getClass().getSimpleName());
        }
        System.out.println("\n");
    }

}

class gold_account implements Bank_account {

    gold_account() {
        add_features();
        getAccount();
    }

    @Override
    public void add_features() {
        features.add(new deposit());
        features.add(new withdraw());
        features.add(new convert_currancy());
        features.add(new global_debitcard());
        features.add(new schedule_payment());
        features.add(new credit_cards());
    }

    @Override
    public gold_account getAccount() {
        return this;
    }

    @Override
    public void display_info() {

        System.out.println("\n\tAccount Information : ");
        System.out.println("Account Title : Gold Account");
        System.out.println("\nFeatures Included:");

        for (int i = 0; i < features.size(); i++) {
            System.out.println("\t" + (i + 1) + ". " + features.get(i).getClass().getSimpleName());
        }
        System.out.println("\n");
    }

}

//Concrete Builder Classes
class Features_wrapper {
}

class deposit extends Features_wrapper {
}

class withdraw extends Features_wrapper {
}

class convert_currancy extends Features_wrapper {
}

class global_debitcard extends Features_wrapper {
}

class schedule_payment extends Features_wrapper {
}

class credit_cards extends Features_wrapper {
}

//Playes role of Client
public class Builder_Pattren {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice;
        Scanner sc = new Scanner(System.in);
        Register_Account account = null;
        System.out.println("\n\t\tBanking System Using Builder Design Pattren\n");
        String[] accounts = {"Simple Account", "Premium Account", "Gold Account"};
        do {
            System.out.println("Account Plans (select to Create Account)");
            System.out.println("0. " + accounts[0] + "\n1. " + accounts[1] + "\n2. " + accounts[2] + " ");
            System.out.println("Enter your Choice   :    ");
            choice = sc.nextInt();
            if (choice > -1 && choice < 3) {
                account = new Register_Account(accounts[choice]);
                account.printdata(account.getAccount());
            } else {
                System.out.println("\nInvalid  Choice Please Enter Again ! \n");
            }

        } while (choice < 0 || choice > 2);

        System.out.println("Good Bye...");

    }

}
