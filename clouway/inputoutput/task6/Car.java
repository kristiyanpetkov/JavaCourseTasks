package com.clouway.inputoutput.task6;

import java.io.Serializable;

/**
 * Created by clouway on 15-7-1.
 */
public class Car implements Serializable{
    private String make;
    private String model;
    private int buildYear;
    private int horsePower;

    public Car(String make, String model, int buildYear, int horsePower) {
        this.make = make;
        this.model = model;
        this.buildYear = buildYear;
        this.horsePower = horsePower;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }



}
