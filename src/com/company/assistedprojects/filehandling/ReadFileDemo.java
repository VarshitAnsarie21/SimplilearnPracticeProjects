package com.company.assistedprojects.filehandling;

import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.io.*;
import java.io.FileReader;

class ReadExistedFile{
    public static void readFile(String fileName) throws IOException {

        System.out.println("Content in File "+fileName+": ");

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close();
    }

    public static List<String> readFileInList(String fileName) {

        System.out.println("Content in File "+fileName+": ");

        List<String> lines = Collections.emptyList();
        try{
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        }catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }
}

public class ReadFileDemo {
    public static void main(String[] args) throws IOException {
        ReadExistedFile.readFile("d://Java//testFile2.txt");
        System.out.println();
        List<String> linesOfFile = ReadExistedFile.readFileInList("d://Java//testFile3.txt");

        for (String s : linesOfFile) {
            System.out.println(s);
        }
    }
}
