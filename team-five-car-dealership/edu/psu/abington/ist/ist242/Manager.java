package edu.psu.abington.ist.ist242;
/*
Project: Car Dealership Application
Course: IST 242
Author: Team 5
Date Developed: 6/15/2020
Last Date Changed:6/27/2020
Rev: development build 3
*/
import java.util.Scanner;
import java.util.ArrayList;

public class Manager extends Person{
//Vairables
private static int managerID;

    //Constructors
    public Manager(int managerID, String firstName, String lastName, String emailAddress, String phoneNumber, role role) {
        super (firstName, lastName, emailAddress, phoneNumber, role);
        this.managerID= managerID;
        
    }
//Setters and Getters
    public static int getManagerID() {
        return managerID;
    }
    public void setManagerID(int managerID) {
        this.managerID = managerID;
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

    @Override
    public boolean hasRole(String role) {
        return super.hasRole(role);
    }

    @Override
    public role getRole() {
        return role;
    }

    @Override
    public void setRole(role role) {
        this.role = role;
    }
    
    /**
 * ShowManager information
 *
 * @param mList   To pass the manager list to the manager Arraylistn
 * @author          Khaled AlDhanhani
 * @version         1.0
 * @since           2020-06-25
 */
    public static void showManagerInfo(ArrayList<Manager> mList){
        for (Manager MD: mList){
            System.out.println("First Name:" + MD.getFirstName());
            System.out.println("Last Name:" + MD.getLastName());
            System.out.println("Email Address:" + MD.getPhoneNumber());
            System.out.println("Phone number: "+MD.getPhoneNumber()+"\n");
        }
    }
}
