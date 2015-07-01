package com.clouway.exceptions.consolereading;

import java.util.InputMismatchException;

/**
 * Created by clouway on 15-6-18.
 */
public class OutsideIntervalException extends IndexOutOfBoundsException {
    public OutsideIntervalException(String message){
    super (message);
    }
}
