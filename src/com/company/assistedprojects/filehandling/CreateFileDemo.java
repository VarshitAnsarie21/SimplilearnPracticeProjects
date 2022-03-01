package com.company.assistedprojects.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

class CreateNewFile{
    public static void createFileUsingFileClass() throws IOException {
        File file = new File("d://Java//testFile1.txt");

        //Create the file
        if (file.createNewFile()){
            System.out.println("File is created!");
        }else{
            System.out.println("File already exists.");
        }

        //Write Content
        FileWriter writer = new FileWriter(file);
        writer.write("Java is pure OOPS");
        writer.close();
    }

    public static void createFileUsingFileOutputStreamClass() throws IOException {
        String data = "Java uses class and object";
        FileOutputStream out = new FileOutputStream("d://Java//testFile2.txt");
        out.write(data.getBytes());
        out.close();

        System.out.println("New file is created..");
    }

    public static void createFileIn_NIO() throws IOException {
        String data = "Java is a programming language";
        Files.write(Paths.get("d://Java//testFile3.txt"), data.getBytes());
        List<String> lines = Arrays.asList("class", "object");
        Files.write(Paths.get("d://Java//file6.txt"),
                lines,
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);

        System.out.println("Files are created...");
    }
}

public class CreateFileDemo {
    public static void main(String[] args) throws IOException{

        CreateNewFile.createFileUsingFileClass();
        CreateNewFile.createFileUsingFileOutputStreamClass();
        CreateNewFile.createFileIn_NIO();
    }
}
