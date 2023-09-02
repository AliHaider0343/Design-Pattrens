/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.state_pattren;

/**
 *
 * @author Ali Haider
 */
public class Account_holder {
    String CNIC;
    Account_holder(String CNIC)
    {
        this.CNIC=CNIC;
    }
    public void Notify()
    {
     System.out.println("The user has been notified with CNIC   :  "+CNIC);
    }
    
}
