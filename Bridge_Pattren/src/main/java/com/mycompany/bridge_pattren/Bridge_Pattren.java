/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bridge_pattren;

import java.util.ArrayList;

/**
 *
 * @author Ali Haider
 */
class vehicle
{
    
protected concrete_wrapper object;
public int wheel_count=0;

vehicle(concrete_wrapper object,int wheelcount)
{
    this.wheel_count=wheelcount;
    this.object=object;
}
public void useforTravel(ArrayList<String> PassengerList){
     
 }
}

class cabin_vehcile extends vehicle
{
    int passenger_count=0;
    cabin_vehcile(concrete_wrapper object,int wheelcount)
    {
     super(object,wheelcount);   
    }
    public void drive()
    {
        System.out.println("Car Type  : Sepdicfically Cabin Vehicle ");
    }
    
}
class car extends cabin_vehcile
{
    String make;
    car(concrete_wrapper object,String make,int wheelcount)
    {
        super(object,wheelcount);
        this.make=make;
    }
    @Override
     public void drive()
    {
        System.out.println("You have Car Type   :   specifically "+make+" having wheel Count "+this.wheel_count+"\n");
    }
}

class open_ride_vechile extends vehicle
{
    boolean pillionRideable;
    open_ride_vechile(concrete_wrapper object,boolean pillionRideable,int wheel_count)
    {
        super(object,wheel_count);
        this.pillionRideable=pillionRideable;
    }
     public void ride()
    {
        System.out.println("You are Riding open Vehicle");
    }
}


interface concrete_wrapper{}

class bike implements concrete_wrapper
{
    String make;
    bike(String make)
    {
        this.make=make;  
    }
    public void ride()
    {
     System.out.println("You are Riding "+make+" Bike.");   
    }

}

class taxi implements concrete_wrapper
{

int capacity;
taxi(int capacity)
{
 this.capacity=capacity;   
}
public void book()
{
         System.out.println("You booked a taxi ");   
}
}

class cargoTruck implements concrete_wrapper
{
float capacity;
cargoTruck(float capacity)
{
 this.capacity=capacity;   
}

public void book()
{
         System.out.println("You booked a TRuck ");   
}
}

class jeep implements concrete_wrapper
{
    String make;
    jeep(String make)
    {
        this.make=make;
    }
    public void drive()
    {
        System.out.println("You are Driving "+make+" Jeep.");
    }
     public void drive4w()
    {
        System.out.println("You are Driving 4 wheeler "+make+" jeep");
    }
}
    

public class Bridge_Pattren {

    public static void main(String[] args) {  
        
        //Craeting Taxi COncrete Object
        
        new car(new taxi(4),"Taxi",4).drive();
        

    }
}
