package com.david;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by cw8454tn on 2/8/2017.
 */
public class Main {
    //Use this scanner to read text data that will be stored in String variables
    static Scanner stringScanner = new Scanner(System.in);
    //Use this scanner to read in numerical data that will be stored in int or double variables
    static Scanner numberScanner = new Scanner(System.in);


    public static void main(String[] args) {

        ArrayList<String> lakes = new ArrayList<String>();

        Testing run1 = new Testing();
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Are you running? y/n");
            choice = stringScanner.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                System.out.println("Enter the name of the lake");
                String lake = stringScanner.nextLine();
                run1.setLakeName(lake);
                System.out.println("Enter your time");
                double time = numberScanner.nextDouble();
                run1.setTime(time);
            }
            run1.printInfo();


            // Close scanners. Good practice to clean up resources you use.
            // Don't try to use scanners after this point. All code that uses scanners goes above here.
            stringScanner.close();
            numberScanner.close();

        }
    }
}
