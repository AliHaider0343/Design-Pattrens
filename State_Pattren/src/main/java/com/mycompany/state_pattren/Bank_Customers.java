/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.state_pattren;

import java.util.ArrayList;

/**
 *
 * @author Ali Haider
 */


public class Bank_Customers {
    ArrayList<Account_holder> customers_List= new ArrayList<Account_holder>();
    
    
    public void add(Account_holder newAccount)
    {
        customers_List.add(newAccount);
    }
    
    public void remove(Account_holder newAccount)
    {
        customers_List.removeIf(p->p.CNIC==newAccount.CNIC);
    }
    
    void Notify()
    {
        for(int i=0;i<customers_List.size();i++)
        {
            customers_List.get(i).Notify();
        }
    }
}



