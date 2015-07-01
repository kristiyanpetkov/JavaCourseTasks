package com.clouway.intro.task5; /**
 * Created by clouway on 15-5-5.
 */

import java.util.Arrays;

public class ReverseArray {
    public void anArray(int[] array){

        for(int i=0; i<array.length/2; i++){
            int temp=array[array.length-i-1];
            array[array.length-i-1]=array[i];
            array[i]=temp;

        }
        System.out.println(Arrays.toString(array));
    }
}


