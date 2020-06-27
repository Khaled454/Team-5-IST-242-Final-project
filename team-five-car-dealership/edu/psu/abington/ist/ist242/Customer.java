package edu.psu.abington.ist.ist242;
/*
Project: Car Dealership Application
Course: IST 242
Author: Team 5
Date Developed: 6/15/2020
Last Date Changed:6/27/2020
Rev: development build 3
*/

import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends Person{
    private boolean testDriveApproval;
    private String phoneNumber;
    private String driversLicenseNum;
    private String address;
    private int customerID;
    private static int idCount = 0;

    public Customer(role role, int customerID){
        this.role = role;
        this.customerID = customerID;
    }
    public Customer(boolean testDriveApproval, int customerID, String driversLicenseNum, String firstName, String lastName, String emailAddress, String phoneNumber, String address, role role) {
        super(firstName,lastName,emailAddress,phoneNumber,role);
        this.customerID=customerID;
        this.address = address;
        this.testDriveApproval = testDriveApproval;
        this.driversLicenseNum = driversLicenseNum;
        this.role=role;
    }

    public void setTestDriveApproval(boolean testDriveApproval) {
        this.testDriveApproval = testDriveApproval;
    }

    public String getDriversLicenseNum() {
        return driversLicenseNum;
    }

    public void setDriversLicenseNum(String driversLicenseNum) {
        this.driversLicenseNum = driversLicenseNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCustomerID() {
        return customerID;
    }

   
/**
 * Get individual customer information to add to ArrayList of customers
 *
 * @param cList   To pass the customer's list to the customer's ArrayList
 * @author          Brianna Price
 * @version         1.0
 * @since           2020-06-17
 */
    public static void printCustomer(ArrayList<Customer> cList) { 
        for(Customer cust : cList) {
            System.out.println("First Name:" + cust.getFirstName());
            System.out.println("Last Name:" + cust.getLastName());
            System.out.println("Email Address:" + cust.getEmailAddress());
            System.out.println("Phone number: "+cust.getPhoneNumber());
            System.out.println("Address: " +cust.getAddress());
            System.out.println("Driver's License Number: " +cust.getDriversLicenseNum()+"\n");
        }
    }
/**
 * To add customers to the Customer's ArrayList
 *
 * @param custList  Store the customers to the customer's Arraylist
 * @author          Aidan Daly
 * @version         1.0
 * @since           2020-06-26
 */
    public static void addCustomer(ArrayList<Customer> custList){
        /*Customer lastCust = custList.get(custList.size());  
        int lastCustomerID = lastCust.getCustomerID();*/
        idCount++;
        Customer newCust = new Customer(Person.role.CUSTOMER, idCount); 
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter a first name:");
        while (true) { 
            try {
                String c = scnr.nextLine();
                if ((c.matches("[a-zA-Z]+"))) {   // ": ^[a-zA-Z0-9]+$"
                    newCust.setFirstName(c);
                    break;
                } else
                    throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a first name");
            }
        }   
        System.out.println("Please enter a last name:");
        while (true) { 
            try {
                String c = scnr.nextLine();
                if ((c.matches("[a-zA-Z]+"))) {
                    newCust.setLastName(c);
                    break;
                } else
                    throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a last name");
            }
        }
        System.out.println("Please enter an address: ");  
           String c = scnr.nextLine();
                    newCust.setAddress(c); 
        System.out.println("Please enter a phone number:");
        while (true) {
            try {
                String a = scnr.nextLine();
                Integer.parseInt(a);
                newCust.setPhoneNumber(a);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input please enter a phone number");
            }
        }
        System.out.println("Please enter an email address:");
           String f = scnr.nextLine();
                    newCust.setEmailAddress(f);
        System.out.println("Please enter a drivers license number:");
                    String r = scnr.nextLine();
                    newCust.setDriversLicenseNum(r);

        custList.add(newCust);
    }
}
