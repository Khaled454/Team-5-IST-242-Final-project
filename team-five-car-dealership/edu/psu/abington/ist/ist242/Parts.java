package edu.psu.abington.ist.ist242;
/*
Project: Car Dealership Application
Course: IST 242
Author: Team 5
Date Developed: 6/15/2020
Last Date Changed:6/26/2020
Rev: development build 1
*/

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Parts {
    //Variables
    private int partID;
    private String partName;
    private String partNumber;
    private String partType;
    private double partPrice;

    //Constructors
    public Parts(int _partID) {
        this.partID = _partID;
    }

    public Parts(int _PartID, String _partName, String _partNumber, String _partType, double _partPrice) {
        this.partID = _PartID;
        this.partName = _partName;
        this.partNumber = _partNumber;
        this.partType = _partType;
        this.partPrice = _partPrice;
    }
//Setters annd Getters
    public int getPartID() {
        return partID;
    }

    public void setPartID(int partID) {
        this.partID = partID;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String _partName) {
        this.partName = _partName;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String _partNumber) {
        this.partNumber = _partNumber;
    }

    public String getPartType() {
        return partType;
    }

    public void setPartType(String _partType) {
        this.partType = _partType;
    }

    public Double getPartPrice() {
        return partPrice;
    }

    public void setPartPrice(double _partPrice) {
        this.partPrice = _partPrice;
    }
/**
 * Print entire partsinventory using array list to command line
 *
 * @param pList     array list to get part elements
 * @author          Khaled Aldhanhani
 * @version         1.0
 * @since           2020-06-24
 */

    public static void listParts(ArrayList<Parts> pList) {
        for (Parts part : pList) {
            System.out.println("Part ID: " + part.getPartID());
            System.out.println("Part Name: " + part.getPartName());
            System.out.println("Part Number: " + part.getPartNumber());
            System.out.println("Part Type: " + part.getPartType());
            System.out.println("Part Price $: " + part.getPartPrice() + "\n");
        }
    }
/**
 * Print parts array list to command line by searching for part type
 *
 * @param partsList array list to get part type
 * @param input_    user input for part type to compare to items in array list
 * @author          Brianna Price
 * @version         2.0
 * @since           2020-06-25
 */
    public static void printPartsByCategory(ArrayList<Parts> partsList, String input_) {
        System.out.println();
        for (Parts p : partsList) {
            if (input_.toUpperCase().equals(p.getPartType().toUpperCase())) {
                System.out.println("Part ID: " + p.getPartID()  + " " + p.getPartName() + " (" + p.getPartNumber() + ") " + " Part Type: " + p.getPartType() + " $" + p.getPartPrice());
            }
        }
        System.out.println();
    }
/**
 * To add parts to the Parts ArrayList
 *
 * @param pList     Storing the added parts in the arraylist
 * @author          Khaled Aldhanhani
 * @author          Brianna Price
 * @version         1.0
 * @since           2020-06-25
 */
    public static void addParts(ArrayList<Parts> pList) {
        Parts lastPart = pList.get(pList.size() - 1);  
        int lastPartId = lastPart.getPartID();  
        Parts newPart = new Parts(lastPartId+1);  
        Scanner scnr = new Scanner(System.in);
            System.out.println("Please enter the Part Name:");
        while (true) { // Name
            try {
                String c = scnr.nextLine();
                if ((c.matches("[a-zA-Z]+"))) {
                    newPart.setPartName(c);
                    break;
                } else
                    throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter the Part Name");
            }
        }

            System.out.println("Please enter the Part Number:");
            while (true) { //Part Number
                try {
                    String a = scnr.nextLine();
                    Integer.parseInt(a);
                    newPart.setPartNumber(a);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a Part Number");
                }
            }
                System.out.println("Please enter the Part Type:");
                while (true) { //Part Type
                    try {
                        String c = scnr.nextLine();
                        if ((c.matches("[a-zA-Z]+"))) {
                            newPart.setPartType(c);
                            break;
                        } else
                            throw new InputMismatchException();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a Part Type");
                    }
                }
                while (true) {
                    System.out.println("Please enter the price: " + "For example 3.00 for $3.00");
                    try {
                        float b;
                        b = Float.parseFloat(scnr.nextLine());
                        newPart.setPartPrice(b);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input please enter a number or a float. Do not enter a $sign");
                    }
                }

                pList.add(newPart);
            }


/**
 * To remove parts from the arraylist by partID
 *
 * @param pList     Passing the Parts array list to look through it
 * @param _partID   Passing the partID to use for removal     
 * @author          Brianna Price
 * @version         1.0
 * @since           2020-06-17
 */
            public static void removeParts (ArrayList < Parts > pList,int _partID){
                for (Parts p : pList) {
                    if (_partID == p.getPartID()) {
                        pList.remove(p);
                        break;
                    }
                }
            }
        }
       

