/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.state_pattren;

/**
 *
 * @author Ali Haider
 */
public class State_Pattren {

    public static void main(String[] args) {

Account_holder holder= new Account_holder("ABC");
Account_holder holder1= new Account_holder("DEF");
Account_holder holder2= new Account_holder("GHI");
holder.Notify();



System.out.println("Composite");
Bank_Customers list= new Bank_Customers();
list.add(holder2);
list.add(holder1);
list.add(holder);
list.Notify();


System.out.println("Removal");
list.remove(holder);
list.Notify();


System.out.println("_________________________________________________\n\n");

Bank_Account b1= new Bank_Account();
b1.balance=200;

b1.withdraw(50, b1);
b1.withdraw(50, b1);
b1.withdraw(50, b1);
b1.withdraw(50, b1);

    }
}


