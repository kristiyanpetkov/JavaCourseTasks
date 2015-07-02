package com.clouway.inputoutput.task4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
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

        FileOutputStream writer = new FileOutputStream("src/com/clouway/inputoutput/textfiles/Stream");
        writer.write((new String()).getBytes());
        writer.close();

        return true;
    }
}
