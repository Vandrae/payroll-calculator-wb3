package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class PayrollCalcApp {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader theFile = new BufferedReader(fileReader);
            String line;


            while ((line = theFile.readLine()) != null){
                String[] splitPipe = line.split("\\|");

                System.out.println(splitPipe[0]);
            }

            Employee.
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //System.out.println(line);
        //System.out.println(Arrays.toString(splitPipe));



    }
}
