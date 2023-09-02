/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dp_mid_lab;

/**
 *
 * @author Ali Haider
 */
//implementation hirarchy
abstract class Visa {

    String country;
    String visa_catrgory;
    int validity;
    String policy_statments;
    boolean isNOCrequired;
    String entry_type;//multiple single etc
    boolean visaless_entry;
    boolean onArrival_visa;
    boolean isApproved;

    public Visa(String country, String visa_catrgory, int validity, boolean isNOCrequired, String entry_type, boolean visaless_entry, boolean onArrival_visa, boolean isApproved) {
        this.country = country;
        this.visa_catrgory = visa_catrgory;
        this.validity = validity;
        this.policy_statments = "General Visa Statements";
        this.isNOCrequired = isNOCrequired;
        this.entry_type = entry_type;
        this.visaless_entry = visaless_entry;
        this.onArrival_visa = onArrival_visa;
        this.isApproved = isApproved;
    }

    @Override
    public String toString() {

        return "\nVisa Applied for (Country)             :  " + this.country + "\n"
                + "Visa Category                          :  " + this.visa_catrgory + "\n"
                + "Validity                               :  " + this.validity + " years\n"
                + "Policy Statement                       :  " + this.policy_statments + "\n"
                + "Is NOC Required to Leave               :  " + (this.isNOCrequired ? "Yes" : "No") + "\n"
                + "Entry Type                             :  " + this.entry_type + "\n"
                + "Is Visa Valid for Visaless Entry       :  " + (this.visaless_entry ? "Yes" : "No") + "\n"
                + "Is Traveller Valid for onArrival Visa  :  " + (this.onArrival_visa ? "Yes" : "No") + "\n";

    }

}

class Business_visa extends Visa {

    String business_statment;
    String company_name;
    int duration;
    boolean business_proof_checked;

    public Business_visa(String country, String visa_catrgory, String entry_type, String company_name, int duration, boolean business_proof_checked, boolean isApproved) {

        super(country, visa_catrgory, 2, true, entry_type, false, false, isApproved);
        this.business_statment = "Business Visa Policy Statments";
        this.company_name = company_name;
        this.duration = duration;
        this.business_proof_checked = business_proof_checked;
    }

    @Override
    public String toString() {

        return "____________________________________________________________\n"
                + "Business Visa Details\n"
                + super.toString()
                + "Business Bank Statment                 :  " + (this.business_statment) + "\n"
                + "Company Name                           :  " + this.company_name + "\n"
                + "Stay Duration                          :  " + (this.duration) + " years\n"
                + "Business Proof                         :  " + (this.business_proof_checked ? "Verified" : "Non Verifed") + "\n\n"
                + "Approval Status                        :  " + (this.isApproved ? "Approved" : "Declined") + "\n"
                + "____________________________________________________________\n";
    }

}

class Student_visa extends Visa {

    String universty_name;
    int degree_years;
    String bank_statment;

    public Student_visa(String country, String visa_catrgory, String entry_type, String universty_name, int degree_years, String bank_statment, boolean isApproved) {

        super(country, visa_catrgory, 5, false, entry_type, false, true, isApproved);
        this.universty_name = universty_name;
        this.degree_years = degree_years;
        this.bank_statment = bank_statment;
    }

    @Override
    public String toString() {
        return "____________________________________________________________\n"
                + "Student Visa Details\n"
                + super.toString()
                + "University Name                        :  " + (this.universty_name) + "\n"
                + "Degree Years                           :  " + this.degree_years + " years\n"
                + "Bank Statment                          :  " + (this.bank_statment) + "\n\n"
                + "Approval Status                        :  " + (this.isApproved ? "Approved" : "Declined") + "\n"
                + "____________________________________________________________\n";

    }
}

class Immigration_visa extends Visa {

    boolean immigration_clearance;
    boolean documents_verification;
    String consent;

    public Immigration_visa(String country, String visa_catrgory, String entry_type, boolean immigration_clearance, boolean documents_verification, String consent, boolean isApproved) {

        super(country, visa_catrgory, 10, true, entry_type, true, true, isApproved);
        this.immigration_clearance = immigration_clearance;
        this.documents_verification = documents_verification;
        this.consent = consent;
    }

    @Override
    public String toString() {
        return "____________________________________________________________\n"
                + "Immigration Visa Details\n"
                + super.toString()
                + "Immigration Clearnce                   :  " + (this.immigration_clearance ? "Cleared" : "non Cleared") + "\n"
                + "Documents Verfication                  :  " + (this.documents_verification ? "Verfied" : "unVerfied") + "\n"
                + "Consent                                :  " + (this.consent) + "\n\n"
                + "Approval Status                        :  " + (this.isApproved ? "Approved" : "Declined") + "\n"
                + "____________________________________________________________\n";

    }

}

class Tourist_visa extends Visa {

    String travling_agency_name;
    String accomodation_place;
    int no_of_days;

    public Tourist_visa(String country, String visa_catrgory, String entry_type, String travling_agency_name, String accomodation_place, int no_of_days, boolean isApproved) {
        super(country, visa_catrgory, 1, false, entry_type, false, true, isApproved);
        this.travling_agency_name = travling_agency_name;
        this.accomodation_place = accomodation_place;
        this.no_of_days = no_of_days;
    }

    @Override
    public String toString() {
        return "____________________________________________________________\n"
                + "Tourist Visa Details\n"
                + super.toString()
                + "Trvelling Agency                       :  " + (this.travling_agency_name) + "\n"
                + "Documents Verfication                  :  " + (this.accomodation_place) + "\n"
                + "Trip Plan Duraction                    :  " + (this.no_of_days) + "days\n\n"
                + "Approval Status                        :  " + (this.isApproved ? "Approved" : "Declined") + "\n"
                + "____________________________________________________________\n";
    }
}
