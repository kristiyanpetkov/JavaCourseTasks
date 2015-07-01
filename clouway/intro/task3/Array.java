package com.clouway.intro.task3;

import java.util.Arrays;

/**
 * Created by clouway on 15-5-5.
 */
public class Array {
    /**
     * @param array
     * @return minimal element of the array
     */

    public int getMinimalElement(int[] array) {
        int minElement = array[0];
        for (int i = 1; i < array.length; i++) {

            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        return minElement;
    }

    /**
     * @param array
     * @return sum of all elements of the array
     */

    public int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public void printArray(int[] array) {
        for (int i=0; i<array.length; i++){

        }
        System.out.println(Arrays.toString(array));

    }

}




    /**
     * Print all elements of the array
     *
     * @param array
     */



