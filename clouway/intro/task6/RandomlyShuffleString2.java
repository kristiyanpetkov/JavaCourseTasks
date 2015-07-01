package com.clouway.intro.task6;

/**
 * Created by clouway on 15-5-14.
 */

import java.util.Random;
import java.util.Scanner;

public class RandomlyShuffleString2 {

    private String charList = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";


    public String generateRandomString( int length) {

        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = getRandomNumber();
            char ch = charList.charAt(number);
            randomString.append(ch);
        }
        return randomString.toString();
    }

    private int getRandomNumber() {
        int randomInt = 0;
        Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt(charList.length());
        if (randomInt - 1 == -1) {
            return randomInt;
        } else {
            return randomInt - 1;
        }
    }
}


