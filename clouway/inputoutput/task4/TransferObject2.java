package com.clouway.inputoutput.task4;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

/**
 * Created by clouway on 15-6-29.
 */
public class TransferObject2 {
    int Y;
    int N;


    public boolean move() throws IOException {

        Path path1 = Paths.get("src/com/clouway/inputoutput/textfiles/Stream");
        Path path2 = Paths.get("src/com/clouway/inputoutput/textfiles/MovedStream");
        try {
            Files.move(path1, path2, StandardCopyOption.ATOMIC_MOVE);
        } catch (NoSuchFileException nsfe) {
            System.err.println(nsfe);
            System.err.println("No such file!");
        }
        return true;
    }
}
