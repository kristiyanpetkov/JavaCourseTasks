package com.clouway.inputoutput.task4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by clouway on 15-7-2.
 */
public class TransferObject {
    public boolean move() throws IOException {

        Path path = Paths.get("src/com/clouway/inputoutput/textfiles/Stream");
        OutputStream out = new FileOutputStream("src/com/clouway/inputoutput/textfiles/OutputStream");
        try {
            Files.copy(path, out);
        } catch (NoSuchFileException nsfe) {
            System.err.println(nsfe);
            System.err.println("No such file!");
        }

        PrintWriter pw = new PrintWriter("src/com/clouway/inputoutput/textfiles/Stream");
        pw.close();

        return true;
    }
}
