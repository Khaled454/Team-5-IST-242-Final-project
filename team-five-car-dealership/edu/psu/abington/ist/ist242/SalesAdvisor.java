package edu.psu.abington.ist.ist242;
/*
Project: Car Dealership Application
Course: IST 242
Author: Team 5
Date Developed: 6/15/2020
Last Date Changed:6/27/2020
Rev: development build 3
*/

import java.util.ArrayList;

public class SalesAdvisor extends Person{

private static int sdID;

    //Constructors
    public SalesAdvisor(int sdID,String firstName, String lastName, String emailAddress, String phoneNumber,role role) {
        super(firstName, lastName, emailAddress, phoneNumber,role);
        this.sdID = sdID;
    }
//Setters and Getters
public static int getSdID() {
    return sdID;
}

    public void setSdID(int sdID) {
        this.sdID = sdID;
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public String getEmailAddress() {
        return super.getEmailAddress();
    }

    @Override
    public void setEmailAddress(String emailAddress) {
        super.setEmailAddress(emailAddress);
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }
/**
 * Print entire parts inventory to command line
 *
 * @param sList     Array List used to populate part elements and display
 * @author         Khaled ALDhanhani
 * @version         1.0
 * @since           2020-06-26
 */
public static void contactSalesAdvisor(ArrayList<SalesAdvisor> sList) {
    for (SalesAdvisor s : sList) {
        System.out.println("Sales Advisor: " + s.getFirstName() + " " + s.getLastName());
        System.out.println("Email Address: " + s.getEmailAddress());
        System.out.println("Phone Number: " + s.getPhoneNumber());
    }
}
}
