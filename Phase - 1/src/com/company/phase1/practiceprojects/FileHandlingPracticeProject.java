package com.company.phase1.practiceprojects;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

class FileOperations{

    //Function to create the file
    public static void createFile() throws IOException {

        System.out.println("Performing create file operation");

        String data = "Java uses class and object";

        //Creating the new File "testFile2.txt" in the given directory
        FileOutputStream out = new FileOutputStream("d://Java//testFile2.txt");

        //Putting the data in the file using FileOutputStream object
        out.write(data.getBytes());

        //After operation of creating the file is done, we are closing the file
        out.close();

        System.out.println("New file is created..");
        System.out.println();
    }

    //Function to read the file
    public static void readFile(String fileName) throws IOException {

        //This function taking the file path as argument which is passed when this function is called
        System.out.println("Performing read file operation");

        System.out.println("Content in File "+fileName+": ");

        //Creating the object to read the contents in the given file
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        //Reading the contents line by line
        String line = reader.readLine();

        //Printing the content until the line does not have any content
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close(); //closing the file

        System.out.println();
    }

    //Function to write in the file
    public static void writingInFile() throws IOException {

        System.out.println("Performing writing in file operation");

        //Contents will be going to write in the file
        List<String> lines = Arrays.asList("class", "object", "Inheritance", "Data hiding");

        //Putting the above content list in the given file whose full path is given below
        Files.write(Paths.get("d://Java//testFile4.txt"),
                lines,
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);

        System.out.println("Writing in the file is done...");

        System.out.println();
    }

    //Function to append contents in the file
    public static void appendInFile() throws IOException {

        System.out.println("Performing append file operation");

        //taking the file in which we have to add the content
        File file = new File("d://Java//testFile3.txt");

        //This below content will be going to add in the existed file "testFile3.txt"
        String content = "Hello from Java...";

        //If file is not created, it first creates the file
        if (file.createNewFile()) {
            System.out.println("File created successfully");
        } else {
            System.out.println("File is already exist"); //if file is already exist
        }

        //Creating the object through which we will be going to add the content
        FileWriter writer = new FileWriter(file);

        //adding the content in file
        writer.append(content);

        //closing the file
        writer.close();

        System.out.println("Adding contents in existed file is done...");
    }
}

public class FileHandlingPracticeProject {
        public static void main(String[] args) throws IOException {

            System.out.println("File Handling operations is performing");
            System.out.println();

            //calling function to create a file
            FileOperations.createFile();

            //calling function to read the file along with directory where file is located
            FileOperations.readFile("d://Java//testFile1.txt");

            //calling function to write in the file
            FileOperations.writingInFile();

            //calling function to append the content in the file
            FileOperations.appendInFile();
        }
}
