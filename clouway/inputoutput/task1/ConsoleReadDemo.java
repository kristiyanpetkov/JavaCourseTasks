package com.clouway.inputoutput.task1;

/**
 * Created by clouway on 15-6-24.
 */
public class ConsoleReadDemo {
    public static void main(String[] args){
        ConsoleRead console = new ConsoleRead();
        System.out.println("Please enter a random string: ");
        System.out.println(console.readString());
        System.out.println(" ");

        System.out.println("Please enter a random int: ");
        System.out.println(console.readInt());
        System.out.println(" ");

        System.out.println("Please enter a random char: ");
        System.out.println(console.readChar());
        System.out.println(" ");

        System.out.println("Please enter a random float: ");
        System.out.println(console.readFloat());
        System.out.println(" ");
    }
}
