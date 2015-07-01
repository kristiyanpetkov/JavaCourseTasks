package com.clouway.inputoutput.task1;

/**
 * Created by clouway on 15-6-24.
 */

import java.util.Scanner;

public class ConsoleRead {
    Scanner input = new Scanner(System.in);

    public String readString() {
        String str = input.nextLine();
        return str;
    }

    public int readInt(){
        int integer = input.nextInt();
        return integer;
    }

    public char readChar(){
        char character = input.next().charAt(0);
        return character;
    }

    public float readFloat(){
        float fl= input.nextFloat();
       return fl;
    }


}
