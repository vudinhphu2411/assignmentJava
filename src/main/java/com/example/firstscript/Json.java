package com.example.firstscript;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Json {

    private static Scanner scanner = new Scanner(System.in);

    public static void write(JSONObject jsonObject) throws IOException {

        FileWriter file = new FileWriter("C:/Users/Administrator/Desktop/Jsonfile.json");
        file.write(jsonObject.toString());
        file.flush();
        file.close();

        System.out.println("Done");
    }

    public static JSONObject read() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Administrator/Desktop/Jsonfile.json"));

        JSONObject jsonObject = new JSONObject(reader.readLine());
        System.out.println(" ");
        System.out.println("Name = " + jsonObject.get("name"));
        System.out.println("Age = " + jsonObject.get("age"));
        JSONArray facilitys = (JSONArray) jsonObject.get("facility");
        System.out.print("Facility = ");
        for (int i = 0; i < facilitys.length(); i++) {
            System.out.print(facilitys.get(i));
            if (i < facilitys.length() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        reader.close();
        return jsonObject;
    }

    public static JSONObject updateJson(JSONObject jsonObject, String fieldName) {
        if (jsonObject.get(fieldName) instanceof String) {

            // Nhap value cua field do
            System.out.print("Enter new value: ");
            jsonObject.put(fieldName, scanner.nextLine());

        } else {
            // Neu la 1 list
            // Nhap so luong cua list
            List<String> values = new ArrayList<>();
            System.out.print("Enter array size: ");
            for (int i = 0; i < Integer.parseInt(scanner.nextLine()); i++) {
                // Nhap du lieu cua tung phan tu ben trong list
                System.out.println("Enter value[" + i + "]: ");
                values.add(scanner.nextLine());
            }
            jsonObject.put(fieldName, values);
        }

        return jsonObject;
    }
}