package com.clouway.exceptions.sumator;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by clouway on 15-6-16.
 */
public class ExceptionSumator {


    public BigInteger sum(String a, String b) {
        BigInteger y = new BigInteger(a);
        BigInteger z = new BigInteger(b);
        try {
            y = y.add(z);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        return y;
    }
}

