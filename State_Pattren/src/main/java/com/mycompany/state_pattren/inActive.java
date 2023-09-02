/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.state_pattren;

/**
 *
 * @author Ali Haider
 */
public class inActive implements Account_States {
     public void withdraw(int amount,Bank_Account contextObject)
        {
         System.out.println("user accounnt have insuufficent balance, INACTIVE STATE ");
         
        }
}
