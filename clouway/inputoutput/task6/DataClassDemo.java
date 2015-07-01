package com.clouway.inputoutput.task6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by clouway on 15-7-1.
 */
public class DataClassDemo {
    public static void main(String[] args)throws IOException{
        DataClass firstObject = new DataClass();
        Car audi = new Car("Audi","A6",2000,180);
        Car bmw = new Car ("BMW","X6",2008,500);
        FileOutputStream out = new FileOutputStream("src/com/clouway/inputoutput/textfiles/audi.ser");
        firstObject.saveObject(out, audi);

        FileOutputStream outSecond = new FileOutputStream("src/com/clouway/inputoutput/textfiles/bmw.ser");
        firstObject.saveObject(outSecond,bmw);

        FileInputStream inFirst = new FileInputStream("src/com/clouway/inputoutput/textfiles/audi.ser");
        firstObject.getObject(inFirst);
        System.out.println();

        FileInputStream inSecond = new FileInputStream("src/com/clouway/inputoutput/textfiles/bmw.ser");
        firstObject.getObject(inSecond);
    }
}