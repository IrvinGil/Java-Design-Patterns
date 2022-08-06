package com.designPatterns.creationalPatterns.prototypeDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Employee Id: ");
        int employeeID = Integer.parseInt(bufferedReader.readLine());
        System.out.print("\n");

        System.out.print("Enter Employee Name: ");
        String employeeName = bufferedReader.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Designation: ");
        String employeeDesignation = bufferedReader.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Address: ");
        String employeeAddress = bufferedReader.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Salary: ");
        double employeeSalary = Double.parseDouble(bufferedReader.readLine());
        System.out.print("\n");

        EmployeeRecord employee1 = new EmployeeRecord(employeeID, employeeName, employeeDesignation, employeeSalary, employeeAddress);

        employee1.showRecord();
        System.out.println("\n");

        //demonstrate cloning object
        EmployeeRecord employee2 = (EmployeeRecord) employee1.getClone();
        employee2.showRecord();
        ;

    }
}
