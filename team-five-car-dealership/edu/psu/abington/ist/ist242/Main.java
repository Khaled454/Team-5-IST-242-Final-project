
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
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final char ABOUT_US = 'A';
        final char CONTACT_SD = 'D';
        final char ADD_CUST = 'B';
        final char EXIT_CODE = 'E';
        final char SEE_CARS = 'C';
        final char SEE_PARTS = 'P';
        final char MANAGE_INV = 'M';
        final char SEARCH = 'S';
        char userAction;
        final String PROMPT_ACTION = "C - View Car Inventory\nP - View Parts Inventory\nM - Manage Inventory\nS - Search Inventory\nD - Contact SalesAdvisor\nB - Add Customer\nA - About Us\nE - Exit\n \nEnter Menu Option: ";;
      
        Scanner scnr = new Scanner(System.in);

        ArrayList<Cars> carList = new ArrayList<>();
        ArrayList<Parts> partList = new ArrayList<>();
        ArrayList<Customer> custList = new ArrayList<>();
        ArrayList<SalesAdvisor> salesList = new ArrayList<>();

        Manager Manager1 = new Manager(123, "Heidi","Smith","Heidi@gmail.com","18132138926", Person.role.MANAGER);
        SalesAdvisor salesAdvisor1 = new SalesAdvisor(123,"Steve","James","SteveJ12@gmail.com","18132138927", Person.role.SalesAdvisor);

        salesList.add(salesAdvisor1);

        Cars car1 = new Cars(0, "Toyota", "Camry", "2007", "Black", "2000000");
        Cars car2 = new Cars(1, "Toyota", "Camry", "2008", "Grey", "3245");
        Cars car3 = new Cars(2, "Toyota", "Camry", "2009", "White", "2333");
        Cars car4 = new Cars(3, "Toyota", "Tacoma", "2017", "Sand", "15478");

        Cars car5 = new Cars(4, "Chevrolet", "Cruze", "2011", "Gray", "67000");
        Cars car6 = new Cars(5, "Chevrolet", "Cruze", "2012", "Gray", "67000");
        Cars car7 = new Cars(6, "Chevrolet", "Cruze", "2013", "Gray", "67000");

        Cars car8 = new Cars(7, "Ford", "F150", "2016", "Black", "20000");
        Cars car9 = new Cars(8, "Ford", "F150", "2017", "White", "12057");
        Cars car10 = new Cars(9, "Ford", "F150", "2019", "Black", "10239");

        Cars car11 = new Cars(10, "Honda", "Civic", "2008", "Green", "112005");
        Cars car12 = new Cars(11, "Honda", "Civic", "2009", "Blue", "104888");
        Cars car13 = new Cars(12, "Honda", "Civic", "2014", "Red", "78394");

        Cars car14 = new Cars(13, "Kia", "Forte", "2012", "Bronze", "119000");
        Cars car15 = new Cars(14, "Kia", "Forte", "2012", "Bronze", "130000");
        Cars car16 = new Cars(15, "Kia", "Forte", "2013", "Bronze", "110000");

        Parts part1 = new Parts(0, "Shocks", "56655", "Suspension", 150);
        Parts part2 = new Parts(1, "Brake pad", "56656", "Brakes", 75);
        Parts part3 = new Parts(2, "Brake rotors", "56657", "Brakes", 200);
        Parts part4 = new Parts(3, "Wheels", "56658", "Tires", 55);
        Parts part5 = new Parts(4, "Light bulb", "56659", "Lights", 5);
        Parts part6 = new Parts(5, "Axle", "56660", "Suspension", 75);
        Parts part7 = new Parts(6, "Tire rod", "56661", "Suspension", 50);
        Parts part8 = new Parts(7, "Axle Shaft", "56662", "Suspension", 100);
        Parts part9 = new Parts(8, "Upper Arm control", "56663", "Suspension", 125);
        Parts part10 = new Parts(9, "Lower Arm control", "56664", "Suspension", 110);
        Parts part11 = new Parts(10, "Air filter", "56665", "Engine", 75);
        Parts part12 = new Parts(11, "Air Intake", "56666", "Engine", 100);
        Parts part13 = new Parts(12, "Mufflers", "56667", "Exhaust", 75);
        Parts part14 = new Parts(13, "Headers", "56668", "Exhaust", 140);

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        carList.add(car11);
        carList.add(car12);
        carList.add(car13);
        carList.add(car14);
        carList.add(car15);
        carList.add(car16);

        partList.add(part1);
        partList.add(part2);
        partList.add(part3);
        partList.add(part4);
        partList.add(part5);
        partList.add(part6);
        partList.add(part7);
        partList.add(part8);
        partList.add(part9);
        partList.add(part10);
        partList.add(part11);
        partList.add(part12);
        partList.add(part13);
        partList.add(part14);

        System.out.println("\n DEALERSHIP MAIN MENU");
        System.out.println("-----------------------");

        do {
            
            userAction = getAction(PROMPT_ACTION);
            switch (userAction) {
                case SEE_CARS:
                    Cars.listCars(carList);
                    System.out.println();
                    break;
                case SEE_PARTS:
                    Parts.listParts(partList);
                    System.out.println();
                    break;
                case SEARCH:
                    String inv_type = searchType();
                    switch (inv_type) {
                        case "car":
                            System.out.println("\n- Chevrolet - Ford - Honda - Kia - Toyota - \nSearch Car Make:  ");
                            String input_ = scnr.next();
                            Cars.printCarByMakeModelYearAndMiles(carList, input_);
                            System.out.println();
                            break;
                        case "part":
                            System.out.println("\n- Brakes - Engine - Exhaust - Lights - Suspension - Tires\n Search Part Type: ");
                            String input = scnr.next();
                            Parts.printPartsByCategory(partList, input);
                            System.out.println();
                            break;
                    }
                    break;
                case MANAGE_INV:
                    System.out.println("Type the manager ID '123'");
                    int _input = scnr.nextInt();
                    if(Manager.getManagerID() == _input){
                        inv_type = getType();
                        switch (inv_type) {
                            case "car":
                                String manage_what = getManageInventory();
                                switch (manage_what) {
                                    case "add":
                                        Cars.addCars(carList);
                                        break;
                                    case "remove":
                                    System.out.println("Please enter a Car ID to remove.");
                                    int c = scnr.nextInt();
                                    Cars.removeCars(carList,c);
                                    break;
                                        
                                }
                                break;
                            case "part":
                                manage_what = getManageInventory();
                                switch (manage_what) {
                                    case "add":
                                        Parts.addParts(partList);
                                        break;
                                    case "remove":
                                        System.out.println("Please enter a part ID to remove.");
                                        int p = scnr.nextInt();
                                        Parts.removeParts(partList,p);
                                        break;
                                }
                                break;
                        }   
                    }
                    break;
                case ADD_CUST:
                    System.out.print("Type the Sales Advisor ID '123': ");
                    _input = scnr.nextInt();
                    if(SalesAdvisor.getSdID() == _input){
                        Customer.addCustomer(custList);
                    }
                    break;
                case CONTACT_SD:
                SalesAdvisor.contactSalesAdvisor(salesList);
                System.out.println();
                break;
                
                case ABOUT_US:
                    Aboutus.printAboutus();
                    System.out.println();
                    break;
            }                 
        } while(userAction != EXIT_CODE);
    }
/**
 * Prompt for user input to select from main menu.
 *
 * @param prompt    Display Character Menu Options
 * @return          User input String
 * @author          Brianna Price
 * @version         1.0
 * @since           2019-04-08
 */
    public static char getAction(String prompt) {
        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }
/**
 * Prompt user to enter type of inventory search
 *
 * @return          String type ('car' or 'part')
 * @author          Brianna Price
 * @version         1.0
 * @since           2020-06-23
 */
    public static String searchType() {
       Scanner scnr = new Scanner(System.in);
       System.out.println("Search Inventory by 'Car' or 'Part': ");
       String type = scnr.nextLine().toLowerCase();
       return type;
   }
   /**
 * Prompt user to enter type of inventory search
 *
 * @return          String type ('car' or 'part')
 * @author          Brianna Price
 * @version         1.0
 * @since           2020-06-23
 */
    public static String getType() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Manage Inventory by 'Car' or 'Part': ");
        String type = scnr.nextLine().toLowerCase();
        return type;
    }
/**
 * Prompt user to enter type of management function
 * 
 * @return          String type ('add' or 'part')
 * @author          Brianna Price
 * @version         1.0
 * @since           2020-06-23
 */
    public static String getManageInventory() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Manage Inventory by 'Add' or 'Remove': ");
        String manageWhat = scnr.nextLine().toLowerCase();
        return manageWhat;
    }

}