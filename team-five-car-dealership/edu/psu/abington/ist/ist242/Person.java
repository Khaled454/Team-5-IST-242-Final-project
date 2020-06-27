package edu.psu.abington.ist.ist242;
/*
Project: Car Dealership Application
Course: IST 242
Author: Team 5
Date Developed: 6/15/2020
Last Date Changed: 6/27/2020
Rev: development build 3
*/

public class Person {
    public String firstName;
    public String lastName;
    public String emailAddress;
    public String phoneNumber;
    static role role;

    public enum role {
        MANAGER, CUSTOMER, SalesAdvisor
    }

    public Person() {

    }

    public Person(String firstName, String lastName, String emailAddress, String phoneNumber, role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.role = role;
    }

    public role getRole() {
        return role;
    }

    public void setRole(role role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
/**
 * Set role for individual sales advisors to gain access to manage inventory
 *
 * @param role      Manager or Sales Advisor roles
 * @return          boolean
 * @author          Aidan Daly
 * @version         1.0
 * @since           2020-06-25
 */
    public boolean hasRole(String role) {
        boolean hasRole;
        if (role.equals(this.role)) {
            hasRole = true;
        } else {
            hasRole = false;
        }
        return hasRole;
    }
}