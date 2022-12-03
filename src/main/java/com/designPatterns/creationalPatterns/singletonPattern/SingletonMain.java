package com.designPatterns.creationalPatterns.singletonPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SingletonMain {
    static int count = 1;
    static int choice = 0;

    public static void main(String[] args) throws IOException {

        JDBCSingletonClass singletonClass = JDBCSingletonClass.getInstance();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("DATABASE OPERATION");
            System.out.println("--------------------");
            System.out.println("1. Insertion");
            System.out.println("2. View");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("5. Exit");

            System.out.println("\n");
            System.out.println("Please enter the choice that you want to perform in the database");

            choice = Integer.parseInt(bufferedReader.readLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter the username you want to insert data into the database: ");
                    String case1Username = bufferedReader.readLine();
                    System.out.print("Enter the password you want to insert data into the database: ");
                    String case1Password = bufferedReader.readLine();

                    try {
                        int i = singletonClass.insert(case1Username, case1Password);
                        if (i > 0) {
                            System.out.println((count++) + "Data has been inserted successfully");
                        } else {
                            System.out.println("Data has not been inserted!");
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    System.out.println("Press enter to continue...");
                    System.in.read();
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    String case2Username = bufferedReader.readLine();
                    try {
                        singletonClass.view(case2Username);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.print("Press Enter key to continue");
                    System.in.read();
                    break;
                case 3:
                    System.out.print("Enter the userID you want to delete: ");
                    int userID = Integer.parseInt(bufferedReader.readLine());
                    try {
                        int i = singletonClass.delete(userID);
                        if (i > 0) {
                            System.out.println((count++) + "Data has been deleted successfully!");
                        } else {
                            System.out.println("Data has not been deleted");
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    System.out.println("Press Enter key to continue...");
                    System.in.read();
                    break;
                case 4:
                    System.out.print("Enter the username you want to delete: ");
                    String case4Username = bufferedReader.readLine();
                    System.out.print("Enter the new password: ");
                    String case4Password = bufferedReader.readLine();

                    try {
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.println("Press Enter key to continue...");
                    System.in.read();
                    break;

                default:
                    return;
            }
        } while (choice != 4);

    }
}
