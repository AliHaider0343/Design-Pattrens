/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;

/**
 *
 * @author Ali Haider
 */
public class Age_Iterator {
    ArrayList<Employee> employees;
    int index=0;
    static boolean check=true;
    public Age_Iterator(Organization organization)
   {
       this.employees=organization.Employees;
       first();
       
   }
   public void first()
   {
       index=0;
       while(employees.get(index).Age<36)
       {
           index++;
       }
       
   }
   
   public void next()
   {
            if(!isDone())
            {
            while(employees.get(index).Age < 36)
                {
           if(!isDone())
            ++index;
                }
            
            }
             
        
        
   }
    
   public boolean isDone()
   {
   if(index > employees.size()-1)
   return true;
   else
   return false;
   }
   
   public Employee currentItem()
   {
       
       return employees.get(index);
   }
   
   
     public boolean hasNext() {
      
         if(index < employees.size()){
            return true;
         }
         return false;
      }
     
}
