/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.factory_method;

import java.util.Scanner;

/**
 *
 * @author fa19-bse-096 Ali Haider
 */
abstract class Gas_Bill {

    double cubic_meter_price = 0.0;
    int consumed_gas = 0;

    public abstract double calculate_bill_amount();

}

class Domestic_Bill extends Gas_Bill {

    Domestic_Bill(int consumed_units) {
        this.cubic_meter_price = 20.00;
        this.consumed_gas = consumed_units;
    }

    @Override
    public double calculate_bill_amount() {
        return cubic_meter_price * consumed_gas;
    }

}

class Commerical_Bill extends Gas_Bill {

    Commerical_Bill(int consumed_units) {
        this.cubic_meter_price = 35.00;
        this.consumed_gas = consumed_units;

    }

    @Override
    public double calculate_bill_amount() {
        return cubic_meter_price * consumed_gas;
    }

}

interface Factory {

    public Gas_Bill getBill(int Bill_Type, int units);

    public void Display_bill(Gas_Bill object);
}

class Bill_factory implements Factory {

    @Override
    public Gas_Bill getBill(int Bill_Type, int units) {
        if (Bill_Type == 2) {
            return new Commerical_Bill(units);
        } else if (Bill_Type == 1) {
            return new Domestic_Bill(units);
        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Display_bill(Gas_Bill object) {
        System.out.println(" ______________________________________________");
        System.out.println("|   SUI Gas Billing                            ");
        System.out.println("|   Bill Type           :  " + object.getClass().getSimpleName());
        System.out.println("|   Gas Consumed(CM)    :  " + object.consumed_gas + " cubic Meters");
        System.out.println("|   Bill Amount         :  Rs. " + object.calculate_bill_amount());
        System.out.println(" ______________________________________________");//To change body of generated methods, choose Tools | Templates.
    }

}

public class Factory_Method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Factory object = new Bill_factory();
        int choice = 0;
        int units = 0;

        do {
            units = 0;

            System.out.println("\n\n1. Domestic Bill\n2. Commerical Bill\n3. Exit\nSelect your Bill Type   :  ");
            choice = sc.nextInt();

            System.out.println("Enter Consumed Gas in Cubic Meters   :    ");
            units = sc.nextInt();

            if (choice == 1 || choice == 2) {
                object.Display_bill(object.getBill(choice, units));
            } else {
                System.out.println("Invalid choice !\n");
                continue;
            }
        } while (choice > 0 && choice < 4);

    }

}
