package com.clouway.intro;

/**
 * Created by clouway on 15-5-5.
 */


import com.clouway.intro.task1task2.Euclid;
import com.clouway.intro.task3.Array;
import com.clouway.intro.task4.QuickSort;
import com.clouway.intro.task5.ReverseArray;
import com.clouway.intro.task6.RandomlyShuffleString;
import com.clouway.intro.task6.RandomlyShuffleString2;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {


        //Calculate Greatest common divisor & Least common multiply
        Euclid result = new Euclid();
        System.out.println("Greatest common divisor: " + result.gcd(9, 3));
        System.out.println("Least common multiple: " + result.lcm(24, 64));

        //Get minimal element of the array, calculate the sum of the array, print all the elements of the array
        Array test = new Array();

        System.out.println("Min Element is: " + test.getMinimalElement(new int[]{20, -3, 6, 7, 8, -15, 2, 6}));
        System.out.print("Print: ");
        test.printArray(new int[]{2, 5, 12, 16, 17, 12, 5, 6, 7});
        System.out.println(" ");

        System.out.println("Sum of all Elements is: " + test.getSum(new int[]{1,2,3,4,5,6}));

        System.out.print("All elements in the array are: ");
        test.printArray(new int[]{5, 6, 7, 2, 12, 25, 35});
        System.out.println(" ");

        // Quicksort method
        int[] input = {24, -2, 45, 20, 56, 75, 2, -56, 99, 53, 12};
        int[] input2 = {24, -2, 45, 20, 56, 75, 2, -56, 99, 53, 12};
        System.out.println("All unsorted elements of the array are: " + Arrays.toString(input));
        QuickSort sorter = new QuickSort();
        sorter.quickSort(input);
        System.out.print("Sorted array after using QuickSort2 method: ");
        for (int i : input) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();

        //Reverse Array
        ReverseArray object = new ReverseArray();
        System.out.print("Reversed array: ");
        object.anArray(input2);


        //Random ShuffleString
        RandomlyShuffleString obj = new RandomlyShuffleString();
        obj.rndString(55, 'a', 'z', '0', '9');

        //Random ShuffleString2
        RandomlyShuffleString2 rsa = new RandomlyShuffleString2();
        System.out.printf("Random Shuffle Array2: ");
        System.out.print(rsa.generateRandomString(30));


    }
}
