package com.clouway.objects;



/**
 * Created by clouway on 15-5-26.
 */
public class Opel extends Cars {

    int weight;
    int numberOfPassangers;


    public Opel(int maxSpeed, String color, String buildDate, int weight, int numberOfPassangers){
        super (maxSpeed, color, buildDate);
        this.weight=weight;
        this.numberOfPassangers=numberOfPassangers;
    }


}
