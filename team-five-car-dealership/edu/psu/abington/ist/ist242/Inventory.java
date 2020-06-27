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

public class Inventory {

    private ArrayList carList;
    private ArrayList partsList;
    private String make;
    private String model;
    private int year;
    private String color;

    public Inventory() {
        carList = new ArrayList<Cars>();
        partsList = new ArrayList<Parts>();
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

    public int getYear() {
        return year;
    }

    public void setYear(int _year) {
        this.year = _year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String _color) {
        this.color = _color;
    }

    public Cars getCars(int _car) {
        return (Cars) carList.get(_car);
    }

    public void setCars(Cars _car) {
        carList.add(_car);
    }


    public Parts getParts(int _part) {
        return (Parts) partsList.get(_part);
    }

    public void setParts(Parts _part) {
        partsList.add(_part);
    }
}
