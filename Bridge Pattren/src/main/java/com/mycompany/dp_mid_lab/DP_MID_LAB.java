/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dp_mid_lab;

/**
 *
 * @author Ali Haider
 */



/*Using Bridge Pattren 


Abstraction Hirarchy

Abstract Class                  Passports
Refined Abstraction Classes     Business Passport
                                Diplomatic Passport
                                Official Passport
                                Emergency Travel Document
                          


Implelmentation Hirarchy
    
Abstract Implementation Class   Visa
Refined Implementation Classes  Student Visa
                                Immigration Visa
                                Tourist Visa
                                Business Visa

Handle/Bridhge                  Object of Visa in Passport

*/
public class DP_MID_LAB {

    public static void main(String[] args) {
         
       //Passports Constrctors
        /* passports( name,  nationality, age,  gender,Visa object)
           Business_Passport( name,  nationality, age,  gender , ispayable,  vip_treatment,Visa object)
           Diplomatic_Passport ( name,  nationality, age,  gender, Service_Officers_identity,Visa object)
           Official_Passport(  name,  nationality, age,  gender, isChargeable,  directorate,Visa object)
           Emergency_Travel_Document( name,  nationality, age,  gender, emergenecy_status,  referene,Visa object)
        */
        
        
        
        // Visas COnstrcutors
        /* Visa( country,  visa_catrgory,  validity,  isNOCrequired,  entry_type,  visaless_entry,  onArrival_visa,  isApproved)
           Business_visa( country,  visa_catrgory,  entry_type,  company_name,  duration,  business_proof_checked,  isApproved)
           Student_visa( country,  visa_catrgory,  entry_type,  universty_name,  degree_years,  bank_statment,  isApproved)
           Immigration_visa( country,  visa_catrgory,  entry_type,  immigration_clearance,  documents_verification,  consent,  isApproved)
           Tourist_visa( country,  visa_catrgory,  entry_type,  travling_agency_name,  accomodation_place,  no_of_days,  isApproved)
        */
                
        
        
        passports mypassport= new Business_Passport("Ali Haider","Pakistani",22,true,true,false,(new Tourist_visa("Saudi Arabia","Umrrah","Mutile Entries","Musafir Travellers","Al Kiswa Hotel",10,true)));
        System.out.println(mypassport.Get_Passport_and_Visa()+"\n\n\n");
        
        passports mypassport2= new Diplomatic_Passport("Ali Haider","Pakistani",22,true,"ID 099982 Ali haider",(new Business_visa("Canada","Work","Single Entry","ABC Company",10,false,false)));
        System.out.println(mypassport2.Get_Passport_and_Visa()+"\n\n\n");
        
     }
}
