/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dp_mid_lab;

/**
 *
 * @author Ali Haider
 */

//Abstraction Hirarchy

abstract class passports {
    String name;
    String nationality;
    boolean gender;
    int age=0;
    protected Visa object; //Handle or Bridge to Connect Abstraction (Passports) with Implementations (Visa)
    
    public passports(String name, String nationality,int age, boolean gender,Visa object) {
        this.name = name;
        this.nationality = nationality;
        this.gender = gender;
        this.object=object;
        this.age=age;
    }

    @Override
    public String toString() {
        return 
        "\nHolder Name                            :  "+this.name +"\n"+
        "Nationality                            :  "+this.nationality +"\n"+
        "Age                                    :  "+this.age  +" years\n"+
        "Gender                                 :  "+(this.gender?"Male":"Female")+"\n";
                
    }
    
    public String Get_Passport_and_Visa()
    {
        return this.toString()+this.object.toString();
    }
    
}

class Business_Passport extends passports
{
    boolean ispayable;
    boolean vip_treatment;

    public Business_Passport(String name, String nationality,int age, boolean gender ,boolean ispayable, boolean vip_treatment,Visa object) {
        super(name, nationality, age,gender, object);
        this.ispayable = ispayable;
        this.vip_treatment = vip_treatment;
    }
    
    @Override
    public String toString() {
        return 
        "____________________________________________________________\n"+
        "Business Passport Details\n"+
        super.toString()+        
        "Is Traveller have to Pay fare          :  "+(this.ispayable?"Yes":"No") +"\n"+
        "VIP Treatment at Airport               :  "+(this.vip_treatment?"Yes":"No")+"\n";

    }
    
    @Override
    public String Get_Passport_and_Visa()
    {
        return this.toString()+this.object.toString();
    }
}
class Diplomatic_Passport extends passports
{
    String Service_Officers_identity;

    public Diplomatic_Passport (String name, String nationality,int age, boolean gender,String Service_Officers_identity,Visa object) {
        super(name, nationality, age,gender, object);
        this.Service_Officers_identity = Service_Officers_identity;
    }
   @Override
    public String toString() {
        return 
        "____________________________________________________________\n"+
        "Diplomatic Passport Details\n"+
        super.toString()+        
        "Service_Officers_identity              :  "+(this.Service_Officers_identity) +"\n";
     
    }
     @Override
    public String Get_Passport_and_Visa()
    {
        return this.toString()+this.object.toString();
    }
}
class Official_Passport extends passports
{
    boolean isChargeable;
    String directorate;

    public Official_Passport( String name, String nationality,int age, boolean gender,boolean isChargeable, String directorate,Visa object) {
        super(name, nationality, age, gender, object);
        this.isChargeable = isChargeable;
        this.directorate = directorate;
    }
      @Override
    public String toString() {
        return 
        "____________________________________________________________\n"+
        "Offical Passport Details\n"+
        super.toString()+        
        "Is Traveller have to Pay fare          :  "+(this.isChargeable?"Yes":"No") +"\n"+
        "Diretcorate Office Name                :  "+(this.directorate)+"\n";
          
    }
     @Override
    public String Get_Passport_and_Visa()
    {
        return this.toString()+this.object.toString();
    }
    
}

class Emergency_Travel_Document extends passports
{
    String emergenecy_status;
    String referene;

    public Emergency_Travel_Document(String name, String nationality,int age, boolean gender,String emergenecy_status, String referene,Visa object) {
        super(name, nationality, age, gender, object);
        this.emergenecy_status = emergenecy_status;
        this.referene = referene;
    }
     @Override
    public String toString() {
        return 
        "____________________________________________________________\n"+
        "Emergency Travel Passport Details\n"+
        super.toString()+        
        "Emergency Status                       :  "+(this.emergenecy_status) +"\n"+
        "Hospital Refernce Document             :  "+(this.referene)+"\n";
 
                
    }
     @Override
    public String Get_Passport_and_Visa()
    {
        return this.toString()+this.object.toString();
    }
}



