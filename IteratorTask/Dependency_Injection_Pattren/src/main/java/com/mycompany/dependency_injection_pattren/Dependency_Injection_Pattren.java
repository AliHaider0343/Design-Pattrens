/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dependency_injection_pattren;

import java.util.ArrayList;

/**
 *
 * @author Ali Haider
 */
interface services
{
    public double GetCalculation();
    public void compute();
}

class Monthly_salary_Calculate implements services
{
    double deduction=0.38;
    double salary=0.0;
    double attendence_percentage=0;
    ArrayList<Integer> attendence;
    
    Monthly_salary_Calculate(double salary,ArrayList<Integer> attendence)
    {
        
        this.salary=salary;
        this.attendence=attendence;
          
    }

    @Override
    public void compute() {
        this.attendence_percentage=this.deduct_absents(this.attendence);
        if(this.attendence_percentage<90)
        this.deduction+=2;     
        this.salary=this.salary-(this.deduction*this.salary);
    }
     @Override
    public double GetCalculation() {
        return this.salary;
    } 
    public double deduct_absents(ArrayList<Integer> attendence)
    {
        int count=0;
        for(int i=0;i<attendence.size();i++)
        {
            if(attendence.get(i)==1)
                count++;
        }
        
        return (count/attendence.size())*100;
        
    }
 
}


class hourly_salary_Calculate implements services
{
    double professional_tax=0.31;
    double consultancy_tax=0.07;
    double salary=0.0;
    int hours;
    double rate;
    
    hourly_salary_Calculate(double rate,int hours)
    {
        this.hours=hours;
        this.rate=rate;
        
    }
    
     @Override
    public void compute() {
                double base_sal=this.rate*this.hours;
                this.salary=base_sal-((base_sal)*consultancy_tax)-((base_sal)*professional_tax);
    }
    
    @Override
    public double GetCalculation() {
        return this.salary;
    }

   
    
}

class bounus_Calculate implements services
{

    Monthly_salary_Calculate object=null;
    double bonus=0.0;
    
    bounus_Calculate(Monthly_salary_Calculate object)
    {
        if(object instanceof Monthly_salary_Calculate)
        this.object=object;
        
    }
    
    @Override
    public void compute() {
        
        if(object!=null)
        {
        if(object.attendence_percentage>50)
        {
            this.bonus=0.15*object.salary;
            object.salary=object.salary+this.bonus;
        }
            
        }
        
    }
    
    
    @Override
    public double GetCalculation() {
        return object.salary;
    }

    
}
        
        
public class Dependency_Injection_Pattren {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
