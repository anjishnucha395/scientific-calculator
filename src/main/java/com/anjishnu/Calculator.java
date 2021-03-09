package com.anjishnu;

import java.util.Scanner;

public class Calculator {

    public Calculator() {
    }

    private double squareRoot(double first) {
        return java.lang.Math.sqrt(first);
    }

    private long factorial(int first) {
        long result = 1;
        for (int i=1; i<=first; i++)
            result *= i;

        return result;
    }

    private double naturalLog(double first) {
        return java.lang.Math.log(first);
    }

    private double power(double first, double second) {
        return java.lang.Math.pow(first, second);
    }

    public void computeFunction(int choice) {
        Scanner scanner = new Scanner(System.in);

        switch (choice) {
            case 1:
                System.out.println("\nEnter the number");

                if (scanner.hasNextDouble()) {
                    double num = scanner.nextDouble();
                    System.out.println("\nSquare root of "+num+" is "+squareRoot(num));

                } else {
                    System.out.println("Your input is not a number");
                }
                scanner.close();
                break;
            case 2:
                System.out.println("\nEnter the number");

                if (scanner.hasNextInt()) {
                    int num = scanner.nextInt();

                    if(num>=0)
                        System.out.println("\nFactorial of "+num+" is "+factorial(num));
                    else
                        System.out.println("\nFactorial calculation is possible only for non-negative number");

                } else {
                    System.out.println("Your input is not a number");
                }
                scanner.close();
                break;
            case 3:
                System.out.println("\nEnter the number");

                if (scanner.hasNextDouble()) {
                    double num = scanner.nextDouble();
                    System.out.println("\nNatural log of "+num+" is "+naturalLog(num));

                } else {
                    System.out.println("Your input is not a number");
                }
                scanner.close();
                break;
            case 4:
                System.out.println("x ^ b");
                System.out.println("\nEnter x");

                if (scanner.hasNextDouble()) {
                    double x = scanner.nextDouble();

                    System.out.println("Enter b");
                    if (scanner.hasNextDouble()) {
                        double b = scanner.nextDouble();
                        System.out.println("\nValue of "+x+" ^ "+b+" is "+power(x, b));

                    } else {
                        System.out.println("Second input is not a number");
                    }
                } else {
                    System.out.println("First input is not a number");
                }
                scanner.close();
                break;
            default:
                System.out.println("Invalid choice !");
                scanner.close();
        }
    }
    public static void main(String[] args) {

        int choice;

        System.out.println("\n**********************Scientific Calculator*****************\n");

        System.out.println("1. Square root");
        System.out.println("2. Factorial");
        System.out.println("3. Natural logarithm (base e)");
        System.out.println("4. Power function (x^b)");

        System.out.println("\nEnter your choice (1-4)");

        Scanner scanner = new Scanner(System.in);

        if(scanner.hasNextInt()) {
            choice = scanner.nextInt();

            Calculator calculator = new Calculator();
            calculator.computeFunction(choice);

        } else {
            System.out.println("Your input is not a number");
        }

        scanner.close();
    }
}
