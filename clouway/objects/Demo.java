package com.clouway.objects;

import com.clouway.objects.task1.Sumator;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by clouway on 15-5-15.
 */

public class Demo {
    public static void main(String[] args) {

        Sumator object = new Sumator();

        System.out.println("Sum of the integer elements: " + object.sum(5, 8));
        System.out.println("Sum of the double elements: " + object.sum(5.5, 3));
        System.out.println("Sum of the String elements: " + object.sum("Great ", "Wall"));
        System.out.println("Sum of the BigInteger elements: " + object.sum(new BigInteger("33333333"), new BigInteger("66666666")));
        System.out.println("Sum of the " + object.sum(new BigDecimal("5555.3"), new BigDecimal("3333.5")));


        Opel astra = new Opel(220, "red", "23.09.1991", 1050, 5);
        Mercedes s320 = new Mercedes(280, "black", "27.08.2007");
        Vw golf = new Vw(200, "blue", "1.08.1995");


    }
}
