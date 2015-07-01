package com.clouway.inputoutput.task6;

import java.io.*;

/**
 * Created by clouway on 15-7-1.
 */
public class DataClass {

    public void saveObject(OutputStream out, Object o) throws IOException {

        try {
            ObjectOutputStream output = new ObjectOutputStream(out);
            output.writeObject(o);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        if (out != null) {
            out.close();
        }
    }

    public void getObject(InputStream in) throws IOException {
        Car auto = null;
        try {

            ObjectInputStream objectIn = new ObjectInputStream(in);
            auto = (Car) objectIn.readObject();
            objectIn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!");
            e.printStackTrace();
            return;
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        }
        System.out.println("Deserialized class...");
        System.out.println("Make: " + auto.getMake());
        System.out.println("Model: " + auto.getModel());
        System.out.println("Build year: " + auto.getBuildYear());
        System.out.println("Horse Power: " + auto.getHorsePower());
    }
}