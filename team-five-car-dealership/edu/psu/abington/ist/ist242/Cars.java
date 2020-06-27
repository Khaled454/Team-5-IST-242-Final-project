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
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cars {
//Variables
    private  int carID;
    private  String make;
    private  String model;
    private  String year;
    private String color;
    private String miles;

    //Constructors
    public Cars(int _carId) {
        this.carID = _carId;
    }

    public Cars(int _carID, String _make, String _model, String _year, String _color, String _miles) {
        this.carID = _carID;
        this.make = _make;
        this.model = _model;
        this.year = _year;
        this.color = _color;
        this.miles = _miles;
    }

    //Setters and Getters
    public int getCarID() {
        return carID;
    }
    public void setID(int _carID) {
        this.carID = _carID;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String _make) {
        this.make = _make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String _model) {
        this.model = _model;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String _year) {
        this.year = _year;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String _color) {
        this.color = _color;
    }
    public String getMiles() {
        return miles;
    }
    public void setMiles(String _miles) {
        this.miles = _miles;
    }

/**
 * Print entire cars inventory using array list to command line
 *
 * @param cList     array list to get car elements
 * @author          Khaled Aldhanhani
 * @version         1.0
 * @since           2020-06-23
 */

    public static void listCars(ArrayList<Cars> cList) {
        for (Cars car : cList) {
            System.out.println(car.getCarID()+" "+ car.getYear() + " " + car.getMake() + " " + car.getModel() + " (" + car.getColor()+") Miles " + car.getMiles());
            System.out.println();
        }
        System.out.println();
    }

/**
 * Print car elements by searching a specific make and printing make, model, year, and miles
 *
 * @param carList   array list to get car elements
 * @param input_    user input for car make to compare to elements in array list
 * @author          Brianna Price
 * @version         1.0
 * @since           2020-06-23
 */

    public static void printCarByMakeModelYearAndMiles(ArrayList<Cars> carList, String input_) {// This prints out all the car makes chosen
        System.out.println();
        System.out.println("Ready to Purchase: ");  // TO-DO: add color to method
        for(Cars c : carList) {
            if(input_.toUpperCase().equals(c.getMake().toUpperCase())){
                System.out.println(c.getYear() + " " + c.getMake() + " " + c.getModel() + " " + "(" + c.getMiles() + " miles)");
                System.out.println();
            }
        }
        System.out.println();     
    }

/**
 * Add individual cars and their elements to car inventory array list
 *
 * @param cList   array list to add car elements
 * @author          Brianna Price 
 * @author          Khaled ALdhanhani
 * @version         1.0
 * @since           2020-06-23
 */

    public static void addCars(ArrayList<Cars> cList) {
        Cars lastCar = cList.get(cList.size() - 1);  //Get the last car in the Array List
        int lastCarId = lastCar.getCarID();  //Get the last Count
        Cars newCar = new Cars(lastCarId+1);  //Create a new Car object
        Scanner scnr = new Scanner(System.in); 
        System.out.println("Please enter the make:");
        while (true) { // make 
            try {
                String c = scnr.nextLine();
                if ((c.matches("[a-zA-Z]+"))) {
                    newCar.setMake(c);
                    break;
                } else
                    throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a make");
            }
        }
        System.out.println("Please enter the model:");
        while (true) { //model
            try {
                String c = scnr.nextLine();
                if ((c.matches("[a-zA-Z]+"))) {
                    newCar.setModel(c);
                    break;
                } else
                    throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a model");
            }
        }
        System.out.println("Please enter the year:");
        while (true) { //year
            try {
                String a = scnr.nextLine();
                Integer.parseInt(a);
                newCar.setYear(a);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a year");
            }
        }
        System.out.println("Please enter the color:");
        while (true) { //color
            try {
                String c = scnr.nextLine();
                if ((c.matches("[a-zA-Z]+"))) {
                    newCar.setColor(c);
                    break;
                } else
                    throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a color");
            }
        }
        System.out.println("Please enter the miles:");
        while (true) { //miles
            try {
                String a = scnr.nextLine();
                Integer.parseInt(a);
                newCar.setMiles(a);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter miles");
            }
        }   
        cList.add(newCar);
    }
    
/**
 * Use car ID to remove individual cars and their elements from car inventory array list.
 * Function only available to manager.
 *
 * @param cList     array list to get car elements
 * @param _carID    user input to get car ID
 * @author          Brianna Price
 * @version         1.0
 * @since           2020-06-23
 */

    public static void removeCars(ArrayList<Cars> cList, int _carID) {
        for (Cars c : cList) {
            if (_carID == c.getCarID()) {
                cList.remove(c);
                break;
            }
        }
    }
}

