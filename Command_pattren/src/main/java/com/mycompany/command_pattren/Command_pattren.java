/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.command_pattren;

/**
 *
 * @author Ali Haider
 */

/*
encapsulate an Request as an Object
offer client to parametriezed 
Invoker passes it to the Command and Object
Command object calls the approriate method of the reciver class
 */
//Scenrio Insurance Based and Normal(unsured) treated seperataly on the basis of payment but same on treatment


//second Level Decoupling to imlpment all the operations as an Object or commands
interface billing_command_interface {

    public void execute();
}

class Command_for_supplies implements billing_command_interface {

    Billing_interface reciever_handle;

    public Command_for_supplies(Billing_interface reciever_handle) {
        this.reciever_handle = reciever_handle;
    }

    @Override
    public void execute() {
        reciever_handle.Billing_for_supplies();
    }
}

class Command_for_Meds implements billing_command_interface {

    Billing_interface reciever_handle;

    public Command_for_Meds(Billing_interface reciever_handle) {
        this.reciever_handle = reciever_handle;
    }

    @Override
    public void execute() {
        reciever_handle.Billing_for_Meds();
    }
}

class Command_for_Equipments implements billing_command_interface {

    Billing_interface reciever_handle;

    public Command_for_Equipments(Billing_interface reciever_handle) {
        this.reciever_handle = reciever_handle;
    }

    @Override
    public void execute() {
        reciever_handle.Billing_for_Equipments();
    }
}


//Opeartion or reciver classes with same signature and different behavior
interface Billing_interface {

    public void Billing_for_supplies();

    public void Billing_for_Meds();

    public void Billing_for_Equipments();
}

class Insured_patient implements Billing_interface {

    @Override
    public void Billing_for_supplies() {
        System.out.println("Insured Patient :  Supplies billing");
    }

    @Override
    public void Billing_for_Meds() {
        System.out.println("Insured Patient :  Medicines billing");

    }

    @Override
    public void Billing_for_Equipments() {
        System.out.println("Insured Patient :  Equipments billing");

    }

}

class Uninsured_patient implements Billing_interface {

    @Override
    public void Billing_for_supplies() {
        System.out.println("UnInsured Patient :  Supplies billing");
    }

    @Override
    public void Billing_for_Meds() {
        System.out.println("UnInsured Patient :  Medicines billing");

    }

    @Override
    public void Billing_for_Equipments() {
        System.out.println("UnInsured Patient :  Equipments billing");

    }

}



//Third level Decoupling Invoker class to invoke class
class Invoke_Supplies
{
    billing_command_interface command;

    public Invoke_Supplies(billing_command_interface command) {
        this.command = command;
    }
    
    
 public void  execute()
 {
     this.command.execute();
 }
 
}
public class Command_pattren {

    public static void main(String[] args) {
        Billing_interface object = new Uninsured_patient();
        billing_command_interface command = new Command_for_Meds(object);
        Invoke_Supplies invoker= new Invoke_Supplies(command);
        invoker.execute();
    }

}
