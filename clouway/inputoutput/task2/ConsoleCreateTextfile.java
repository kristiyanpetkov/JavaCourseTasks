package com.clouway.inputoutput.task2;

import java.io.*;
import java.util.Scanner;

/**
 * Created by clouway on 15-6-25.
 */
public class ConsoleCreateTextfile {

        public void reverseText()throws IOException {
            File f1 = new File("src/com/clouway/inputoutput/textfiles/CreateTextfile");
            PrintWriter out = new PrintWriter(new FileWriter("src/com/clouway/inputoutput/textfiles/CreateTextfile"));
            String lineFromInput = "";
            System.out.println("Please enter the text that you want to input in your text file. If you want to exit write down \".\" on a new line and press enter.");

            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                while (!lineFromInput.equalsIgnoreCase(".")) {
                    lineFromInput = in.readLine();
                    if (!lineFromInput.equalsIgnoreCase(".")) {
                        out.println(lineFromInput);
                    }
                }
                out.close();
            } catch (IOException ex) {
                System.out.println("Error during reading/writing");
            }
        }
}
