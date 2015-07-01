package com.clouway.exceptions;

/**
 * Created by clouway on 15-6-17.
 */
import com.clouway.exceptions.consolereading.ConsoleReadingException;
import com.clouway.exceptions.consolereading.OutsideIntervalException;
import com.clouway.exceptions.sumator.ExceptionSumator;
import com.clouway.exceptions.task3.ListOfElements;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws OutsideIntervalException, InputMismatchException {
        ExceptionSumator object = new ExceptionSumator();
        System.out.println(object.sum("777745895698548595957", "86374747373"));
        System.out.println(" ");

        ConsoleReadingException object2 = new ConsoleReadingException();
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Please enter a number between 0 and 100: ");
        try {
            object2.getNumber(inputNumber.nextInt());
            System.out.println(" ");
        }catch (InputMismatchException mismatch){
            System.out.println(mismatch+"  WRONG INSERTION! PLEASE ENTER A VALID INTEGER!");
            System.out.println(" ");

        }

        ListOfElements object3 = new ListOfElements();
        object3.remove();
        object3.add(object2);
        object3.add(object);
        object3.add(object2);
        object3.add(object);
        object3.add(object2);
        object3.add(object);
        object3.add(object2);


        object3.printAllElements();
        System.out.println();
        System.out.println();
        object3.remove();
        object3.printAllElements();
    }
}
