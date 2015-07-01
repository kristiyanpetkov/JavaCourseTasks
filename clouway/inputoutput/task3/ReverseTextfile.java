package com.clouway.inputoutput.task3;

import java.io.*;

/**
 * Created by clouway on 15-6-25.
 */
public class ReverseTextfile {

        public void reverse() throws IOException {
            BufferedReader in = new BufferedReader(new FileReader("src/com/clouway/inputoutput/textfiles/ReverseText"));

            String text = "";
            String aLine;
            while ((aLine = in.readLine()) != null) {
                text = text + aLine;
            }
            File f1 = new File("src/com/clouway/inputoutput/textfiles/ReverseText");
            f1.delete();
            f1.createNewFile();
            PrintWriter out = new PrintWriter(new FileWriter("src/com/clouway/inputoutput/textfiles/ReverseText"));
            String reverse = new StringBuffer(text).reverse().toString();
            System.out.println(reverse);
            out.write(reverse);
            out.close();
        }


}

