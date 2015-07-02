package com.clouway.inputoutput.task4;

import java.io.IOException;

/**
 * Created by clouway on 15-7-2.
 */
public class TransferObjectDemo {
    public static void main(String[] args) throws IOException {
        TransferObject transfer = new TransferObject();
        String inputFile="src/com/clouway/inputoutput/textfiles/Stream";
        String outputFile="src/com/clouway/inputoutput/textfiles/OutputStream";
       // transfer.move(inputFile,outputFile);
        transfer.transferChar(inputFile,outputFile,7);

    }
}
