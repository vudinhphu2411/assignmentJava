package com.example.firstscript;
// import com.example.Assignment1;

import java.util.Scanner;

import org.json.JSONObject;

import com.example.Assignment1;

public class Mainclass {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) throws Exception {
        System.out.println("1: Exel File");
        Thread.sleep(2000);
        ExcelUtils excel = new ExcelUtils();
        excel.excel();

        Thread.sleep(3000);
        System.out.println("2: XML File");
        Xml xml = new Xml();
        xml.create();
        Thread.sleep(2000);
        System.out.println("Waitting.......");
        Thread.sleep(3000);
        xml.update();

        System.out.println("3: JSON File");
        System.out.println("Read JsonFile....................");
        JSONObject json = Json.read();

        // Nhap ten Field muon update
        System.out.print("Enter field name: ");
        String fieldName = scanner.nextLine();

        json = Json.updateJson(json, fieldName);

        Json.write(json);
        Thread.sleep(2000);
        System.out.printf("\n");

        System.out.println("After Update and save JsonFile....................");
        System.out.println(Json.read());

        System.out.println("4: Text File");
        Thread.sleep(2000);
        Assignment1 ass1 = new Assignment1();
        ass1.txt();
        System.out.println(" ");

    }
}