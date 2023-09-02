/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.state_pattren;

/**
 *
 * @author Ali Haider
 */
public class Bank_Account implements Account_States {
    String account_id;
    int balance=0;
    Account_States states_manager= new Active();
    
    @Override
    public void withdraw(int amount, Bank_Account contextObject) {
     states_manager.withdraw(amount, this);

    }
    
}
