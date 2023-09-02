/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.state_pattren;

/**
 *
 * @author Ali Haider
 */
public class Active implements Account_States{
        public void withdraw(int amount,Bank_Account contextObject)
        {
contextObject.balance=contextObject.balance-amount;
System.out.println("Amoutnn withdrawn Balnce ="+contextObject.balance );

if(contextObject.balance<100)
{
 contextObject.states_manager= new inActive();   
}
        }
    
}
