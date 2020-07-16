package com.utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * To check whether a particular word is present in a folder
 */
public class FindTextInFile {

    public static void main(String args[]) throws IOException {
        /*
        String findString = "YUVA";
        var filesStream = Files.walk(Paths.get("C:\\Users\\Ranjith\\Documents\\yUVA\\New folder\\"));
        filesStream.map(file -> new File(file.toString()))
                .filter(File::isFile)
                .forEach(file -> {
                    try {
                        boolean isAvailable = false;
                        String fileString = Files.readString(file.toPath());
                        if (fileString.contains(findString))
                            isAvailable = true;
                        System.out.println(file.getPath() + " : " + isAvailable);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });

         */
    }
}
