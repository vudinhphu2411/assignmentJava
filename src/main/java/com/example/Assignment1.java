package com.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

import java.util.Scanner;

public class Assignment1 {

    static StringBuffer stringBufferOfData = new StringBuffer();
    static String filename = null;
    static Scanner sc = new Scanner(System.in);

    public void txt() {

        boolean fileRead = readFile();
        if (fileRead) {
            replacement();// call method to get text to replace, replacement text and output replaced
            writeToFile();
        }
        System.exit(0);// exit once app is done
    }

    private static boolean readFile() {
        System.out.println("Please enter your files name and path i.e C:\\test.txt: ");
        filename = sc.nextLine();
        Scanner fileToRead = null;
        try {
            fileToRead = new Scanner(new File(filename));

            for (String line; fileToRead.hasNextLine() && (line = fileToRead.nextLine()) != null;) {
                System.out.println(line);
                stringBufferOfData.append(line).append("\r\n");
            }
            fileToRead.close();
            return true;
        } catch (FileNotFoundException ex) {
            System.out.println("The file " + filename + " could not be found! " + ex.getMessage());
            return false;

        }

    }

    private static void writeToFile() {
        try {
            BufferedWriter bufwriter = new BufferedWriter(new FileWriter(filename));
            bufwriter.write(stringBufferOfData.toString());
            bufwriter.close();

        } catch (Exception e) {
            System.out.println("Error occured while attempting to write to file: " + e.getMessage());
        }
    }

    private static void replacement() {
        System.out.println("Please enter the contents of a line you would like to edit: ");
        String lineToEdit = sc.nextLine();// read the line to edit

        System.out.println("Please enter the the replacement text: ");
        String replacementText = sc.nextLine();

        int startIndex = stringBufferOfData.indexOf(lineToEdit);
        int endIndex = startIndex + lineToEdit.length();

        stringBufferOfData.replace(startIndex, endIndex, replacementText);

        System.out.println("Here is the new edited text:\n" + stringBufferOfData);
    }
}