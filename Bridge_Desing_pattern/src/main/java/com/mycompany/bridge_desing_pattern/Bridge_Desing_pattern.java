/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.bridge_desing_pattern;

import java.util.ArrayList;

/**
 *
 * @author Ali Haider
 */
class vehicle {

    protected concrete_wrapper object;
    public int wheel_count = 0;

    vehicle(concrete_wrapper object, int wheelcount) {
        this.wheel_count = wheelcount;
        this.object = object;
    }

    public void useforTravel(ArrayList<String> PassengerList) {

    }
}

class cabin_vehcile extends vehicle {

    int passenger_count = 0;

    cabin_vehcile(concrete_wrapper object, int wheelcount) {
        super(object, wheelcount);
    }

    public void drive() {
        System.out.println("Car Type  : Sepdicfically Cabin Vehicle ");
    }

}

class car extends cabin_vehcile {

    String make;

    car(concrete_wrapper object, String make, int wheelcount) {
        super(object, wheelcount);
        this.make = make;
    }

    @Override
    public void drive() {
        System.out.println("You have Car Type            :   specifically " + make + " having wheel Count " + this.wheel_count);
    }
}

class jeep extends cabin_vehcile {

    String make;

    jeep(concrete_wrapper object, String make, int wheelcount) {
        super(object, wheelcount);
        this.make = make;

    }

    @Override
    public void drive() {
        System.out.println("You have Jeep Type           :   specifically " + make + " having wheel Count " + this.wheel_count);
    }

    public void drive4w() {
        System.out.println("You have Jeep Type           :   specifically " + make + " 4X4 having wheel Count " + this.wheel_count);
    }
}

class open_ride_vechile extends vehicle {

    boolean pillionRideable;
    String make;

    open_ride_vechile(String make, concrete_wrapper object, boolean pillionRideable, int wheel_count) {
        super(object, wheel_count);
        this.pillionRideable = pillionRideable;
        this.make = make;
    }

    public void ride() {
        System.out.println("You have Open Vehicle Type   :   specifically " + make + " having wheel Count " + this.wheel_count);
    }
}

interface concrete_wrapper {
}

class bike implements concrete_wrapper {

    public void ride() {
        System.out.println("You are Riding Bike.");
    }

}

class taxi implements concrete_wrapper {

    int capacity;

    taxi(int capacity) {
        this.capacity = capacity;
    }

    public void book() {
        System.out.println("You booked a taxi ");
    }
}

class cargoTruck implements concrete_wrapper {

    float capacity;

    cargoTruck(float capacity) {
        this.capacity = capacity;
    }

    public void book() {
        System.out.println("You booked a TRuck ");
    }
}
//concrete implementation of the FIne ABstction class Jeep

class wrangler implements concrete_wrapper {
}

public class Bridge_Desing_pattern {

    public static void main(String[] args) {

        //Craeting Taxi COncrete Object
        new car(new taxi(4), "Taxi", 4).drive();
        new jeep(new wrangler(), "Wrangler", 6).drive();
        new jeep(new wrangler(), "Wrangler ", 4).drive4w();
        new open_ride_vechile("Honda", new bike(), true, 2).ride();
    }
}
