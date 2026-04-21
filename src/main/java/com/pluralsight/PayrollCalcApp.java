package com.pluralsight;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class PayrollCalcApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What file do you want to read? ");
        String read = input.nextLine();

        System.out.print("What file do you want to write ? ");
        String write = input.nextLine();


        try {
            FileReader fileReader = new FileReader("src/main/resources/" + read);
            FileWriter writer = new FileWriter("src/main/resources/" + write);
            BufferedReader theFile = new BufferedReader(fileReader);
            BufferedWriter bwriter = new BufferedWriter(writer);

            theFile.readLine();
            String line;

            bwriter.write("id|name|gross pay \n");
            while ((line = theFile.readLine()) != null){
                System.out.println(line);
                String[] splitPipe = line.split("\\|");
                System.out.println("ID: " + splitPipe[0]);
                System.out.println("Name: " + splitPipe[1]);
                System.out.println("hours worked: " + splitPipe[2]);
                System.out.println("Pay Rate: " + splitPipe[3]);
                System.out.println(" ");

                Employee employee = new Employee(Integer.parseInt(splitPipe[0]),splitPipe[1], Double.parseDouble(splitPipe[2]),Double.parseDouble(splitPipe[3]));
                bwriter.write(employee.getEmployeeID() + "|" + employee.getName() + "|" + employee.getGrossPay() + "\n");

            }
            bwriter.close();
            writer.close();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
