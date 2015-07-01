package com.clouway.objects.task1;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by clouway on 15-5-14.
 */
public class Sumator {

    public int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public double sum(double a, double b) {
        double sum = a + b;
        return sum;
    }

    public String sum(String a, String b) {
        String sum = a + b;
        return sum;

    }

    public BigInteger sum(BigInteger a, BigInteger b) {
        BigInteger sum = a.add(b);
        return sum;

    }

    public BigDecimal sum(BigDecimal a, BigDecimal b) {
        BigDecimal sum = a.add(b);
        return sum;


    }

}
