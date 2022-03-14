package com.company.phase1.assessmentproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class BusinessOperations {

    //Using Bubble sorting to sort file in ascending order
    public static String[] sortFiles(String[] array, int size){
        String temp = "";
        for(int i=0; i<size; i++){
            for(int j=1; j<(size-i); j++){
                if(array[j-1].compareToIgnoreCase(array[j])>0){
                    temp = array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }

    //File listing function
    public static void listFiles() {
        int fileCount = 0;

        ArrayList<String> filenames = new ArrayList<>();
        /*  if you want see the files in the same hierarchy as "src" folder in the given project then, we use below
             line of code.

            File directoryPath = new File(System.getProperty("user.dir"));
         */

        //Creating the File object to list the files in the given directory
        File directoryPath = new File("d://Java");

        File[] listOfFiles = directoryPath.listFiles();

        fileCount = listOfFiles.length;

        //adding the files into array that is present in the directory
        System.out.println("\nFiles present in the directory:");
        for (int i = 0; i < fileCount; i++) {
            if (listOfFiles[i].isFile()) {
                filenames.add(listOfFiles[i].getName());
            }
        }

        String[] str = new String[filenames.size()];

        for (int i = 0; i < filenames.size(); i++) {
            str[i] = filenames.get(i);
        }

        String[] sorted_filenames = sortFiles(str, str.length);

        for(String currentFile: sorted_filenames) {
            System.out.println(currentFile);
        }
    }

    //File delete function
    public static void deleteFile(String fileToBeDeleted) {

        /*  if you want to delete the file in the same hierarchy as "src" folder in the given project then, we use below
             line of code.

            File fileObj = new File( (System.getProperty("user.dir")) + "\\" + fileToBeDeleted);

         */

        File fileObj = new File("d://java//" + fileToBeDeleted);
        if(fileObj.exists()) {
            if ( fileObj.delete() ) {
                System.out.println("File deleted successfully!");
            }
        } else {
            System.out.println("Sorry, File wasn't deleted (File Not Found)");
        }
    }

    //File search function
    public static void searchFile(String fileToBeSearched) {

         /*  if you want to search the file in the same hierarchy as "src" folder in the given project then, we use below
             line of code.

            File fileObj = new File( (System.getProperty("user.dir") ) + "\\" + fileToBeSearched);

         */

        File fileObj = new File("d://java//" + fileToBeSearched);

        //Check whether file exists or not. If yes then display associated message
        if(fileObj.exists()) {
            System.out.println("File successfully found! It is present in the directory.");
        } else {
            System.out.println("Sorry, File Not Found in the directory");
        }	PrintWriter pw;
        try {
            pw = new PrintWriter(fileToBeSearched); //may throw exception
            pw.println("saved");
        }

        // providing the checked exception handler
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    //File creation function
    public static void createFile (String fileToBeCreated) {

        /*  if you want to search the file in the same hierarchy as "src" folder in the given project then, we use below
             line of code.

            File fileObj = new File( (System.getProperty("user.dir") ) + "\\" + fileToBeCreated);
         */

        File fileObj = new File("d://java//" + fileToBeCreated);

        try {
            if (fileObj.createNewFile() ) {
                System.out.println("File created successfully !");
            } else {
                System.out.println("File is already exists !");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}