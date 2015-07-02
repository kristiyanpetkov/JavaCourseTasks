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
    public boolean move(String inputFile, String outputFile) throws IOException {

        Path path = Paths.get(inputFile);
        OutputStream out = new FileOutputStream(outputFile);
        try {
            Files.copy(path, out);
        } catch (NoSuchFileException nsfe) {
            System.err.println(nsfe);
            System.err.println("No such file!");
        }

        PrintWriter pw = new PrintWriter(inputFile);
        pw.close();

        return true;
    }

    public boolean transferChar(String inputFile, String outputFile, int number) throws IOException {

        Path path = Paths.get(inputFile);
        OutputStream out = new FileOutputStream(outputFile);
        Reader r = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), "US-ASCII"));
        try {
            int count = 0;
            while ((r.read() != -1) && count < number) {
                out.write(r.read());
                count++;
            }
        } catch (NoSuchFileException nsfe) {
            System.err.println(nsfe);
            System.err.println("No such file");
        } finally {
            r.close();
        }

        PrintWriter pw = new PrintWriter(inputFile);
        pw.close();
        return true;
    }
}
