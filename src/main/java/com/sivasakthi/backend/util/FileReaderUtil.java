package com.sivasakthi.backend.util;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class FileReaderUtil {

    public static List<File> getJavaFiles(File folder) {

        List<File> javaFiles = new ArrayList<>();

        File[] files = folder.listFiles();

        if (files == null) {
            return javaFiles;
        }

        for (File file : files) {

            if (file.isDirectory()) {

                javaFiles.addAll(getJavaFiles(file));

            } else if (file.getName().endsWith(".java")) {

                javaFiles.add(file);

            }

        }

        return javaFiles;
    }

    public static String readFile(File file) {

        try {

            return Files.readString(file.toPath());

        } catch (Exception e) {

            return "";

        }

    }

}