package com.clouway.exceptions.consolereading;

import java.util.InputMismatchException;

/**
 * Created by clouway on 15-6-17.
 */

public class ConsoleReadingException {

    public void getNumber(int number) throws OutsideIntervalException {
        try {
            if (number < 0 || number > 100) {
                throw new OutsideIntervalException("The entered number is outside the interval of [0..100]");
            } else {
                System.out.println(number + " is valid number inside the interval of [0..100]");
            }
        } catch (OutsideIntervalException ex) {
            System.out.println(ex);
        }finally {
            System.out.println("The end!");
        }
    }
}




