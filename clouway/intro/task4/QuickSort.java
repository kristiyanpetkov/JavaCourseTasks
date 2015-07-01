package com.clouway.intro.task4;

/**
 * Created by clouway on 15-5-5.
 */
public class QuickSort {

    /**
     * Declare an array and set values for the lower index and the higher index.
     *
     * @param array
     */
    public void quickSort(int[] array) {


        int length = array.length;
        quickSort(array, 0, length - 1);
    }

    /**
     * In each iteration, we will search a number from the left side which is greater than the pivot value,
     * and also we will search a number from the right side which is less than the pivot value.
     *
     * @param array
     * @param lowerIndex  - lower index
     * @param higherIndex - higher index
     */

    private void quickSort(int[] array, int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;
        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
        while (i <= j) {

            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(array, i, j);

                i++;
                j--;
            }
        }

        if (lowerIndex < j)
            quickSort(array, lowerIndex, j);
        if (i < higherIndex)
            quickSort(array, i, higherIndex);
    }

    /**
     * If the search in the previous method is done, then we exchange both numbers.
     *
     * @param array
     * @param i - lower element
     * @param j - higher leement
     */

    private void exchangeNumbers(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}

