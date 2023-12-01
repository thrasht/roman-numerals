package org.montes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Insert a number from the options and hit Enter");
            System.out.println("1. Convert Roman Numeral to Integer");
            System.out.println("2. Convert Integer to Roman Numeral");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Insert a Roman Numeral:");
                    String romanInput = scanner.nextLine();
                    try {
                        int result = converter.romanToInt(romanInput);
                        System.out.println("Result: " + result);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: Illegal input");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese un número entero:");
                    int intInput = scanner.nextInt();
                    scanner.nextLine();  // Consumir la nueva línea después de nextInt()
                    try {
                        String result = converter.intToRoman(intInput);
                        System.out.println("Resultado: " + result);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }

        scanner.close();
    }
}