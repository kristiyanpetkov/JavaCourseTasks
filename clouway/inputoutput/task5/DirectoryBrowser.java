package com.clouway.inputoutput.task5;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by clouway on 15-6-30.
 */
public class DirectoryBrowser {
    public void listContent(String path) throws IOException {
        try {
            Path p1 = Paths.get(path);
            BasicFileAttributes attr = Files.readAttributes(p1, BasicFileAttributes.class);
            if (attr.isRegularFile()) {
                System.out.println("Path name is a file!");
            }
            if (attr.isDirectory()) {
                try (DirectoryStream<Path> stream = Files.newDirectoryStream(p1)) {
                    for (Path files : stream) {
                        System.out.println(files.getFileName());
                    }
                }
            }
        } catch (NoSuchFileException nsfe) {
            System.out.println(nsfe + ": No such file or directory! Please check your path!");
        }
    }
}
