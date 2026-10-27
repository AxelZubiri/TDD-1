
package com.zubirimanteo.devops;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean out = false;

        while (!out) {
            System.out.println("\n===== CALCULATOR =====");
            System.out.println("1. Sum");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Error: insert a valid number.");
                scanner.next();
                continue;
            }

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                case 2:
                case 3:
                    System.out.print ("Insert the first number: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Error: Insert whole number");
                        scanner.next();
                        continue;
                    }

                    int num1 = scanner.nextInt();

                    System.out.print("Insert the second number: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Error: insert a whole number");
                        scanner.next();
                        continue;
                    }

                    int num2 = scanner.nextInt();
                    int result;

                    switch (option) {
                        case 1:
                            result = calculator.suma(num1, num2);
                            System.out.println(
                                    "Result: " + num1 + " + " + num2
                                            + " = " + result);
                            break;
                        case 2:
                            result = calculator.rest(num1, num2);
                            System.out.println(
                                    "Result: " + num1 + " - " + num2
                                            + " = " + result);
                            break;
                        case 3:
                            result = calculator.mult(num1, num2);
                            System.out.println(
                                    "Result: " + num1 + " * " + num2
                                            + " = " + result);
                            break;
                        default:
                            break;
                    }
                    break;

                case 0:
                    out = true;
                    System.out.println("Goodbye");
                    break;

                default:
                    System.out.println(
                            "Invalid option, choose between 1,2,3 and 0");
                    break;
            }
        }

        scanner.close();
    }
}
