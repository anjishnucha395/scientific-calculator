package com.anjishnu;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {
    }

    public double squareRoot(double first) {
        double result = java.lang.Math.sqrt(first);
        logger.info("[SQUARE ROOT - INPUT]  "+first);
        logger.info("[SQUARE ROOT - RESULT]  "+result);
        return result;
    }

    public long factorial(int first) {
        long result = 1;
        for (int i=1; i<=first; i++)
            result *= i;

        logger.info("[FACTORIAL - INPUT]  "+first);
        logger.info("[FACTORIAL - RESULT]  "+result);

        return result;
    }

    public double naturalLog(double first) {
        double result = java.lang.Math.log(first);
        logger.info("[NATURAL LOG - INPUT]  "+first);
        logger.info("[NATURAL LOG - RESULT]  "+result);
        return result;
    }

    public double power(double first, double second) {
        double result = java.lang.Math.pow(first, second);
        logger.info("[POWER - INPUT]  "+first+" and "+second);
        logger.info("[POWER - RESULT]  "+result);
        return result;
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
                    logger.info("[SQUARE ROOT - INPUT]  "+Double.NaN);
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
                    else {
                        logger.info("[FACTORIAL - INPUT]  "+num);
                        logger.info("[FACTORIAL - RESULT]  Factorial calculation not possible");
                        System.out.println("\nFactorial calculation is possible only for non-negative number");
                    }
                } else {
                    logger.info("[FACTORIAL - INPUT]  NaN");
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
                    logger.info("[NATURAL LOG - INPUT]  "+Double.NaN);
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
                        logger.info("[POWER - INPUT]  "+x+" and "+Double.NaN);
                        System.out.println("Second input is not a number");
                    }
                } else {
                    logger.info("[POWER - INPUT]  "+Double.NaN+" NOT GIVEN");
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
