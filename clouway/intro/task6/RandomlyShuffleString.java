package com.clouway.intro.task6;

/**
 * Created by clouway on 15-5-13.
 */
public class RandomlyShuffleString {

    /**
     * This is a prgoram which randomly generate an array with length set by user.
     *
     * @param length - length of the String
     * @param first  - declare first element of the String
     * @param last   - declare last element of the String
     */

    /** public void rndString(int length, char first, char last) {
        String s = "";

        for (int k = 0; k < length; k++) {
            int rn = (int) ((last - first) * Math.random()) + first;
            char c = (char) rn;
            s += new Character(c).toString();
        }
        System.out.println(s);
    }*/

    public void rndString(int length, char first, char last, char second, char third) {
        length=length;
        String s="";
        String m="";
        String random3="";
        if (!(length%2==0)){

        }
        for (int k=0; k<length;k++){
            int random=(int)((last-first)*Math.random())+first;
            char c = (char) random;
            s=s+new Character(c).toString();
            random3=m+s;


        }
        System.out.println("Random Shuffle Array: "+ random3);

    }



}


