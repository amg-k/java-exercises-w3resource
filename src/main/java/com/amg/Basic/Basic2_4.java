package com.amg.Basic;

import java.util.Scanner;

public class Basic2_4 {
    public static void main(String[] args) {
        basic2();
        basic3();
        basic4();
    }

    private static void basic2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Program calculating sum of two numbers");
        System.out.println("Enter the first number:");
        int firstNumber = in.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = in.nextInt();
        in.close();
        int sum = firstNumber + secondNumber;
        System.out.println("Sum of given numbers is: " + sum);
    }

    private static void basic3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Program calculating quotient of division");
        System.out.println("Enter the dividend:");
        int firstNumber = in.nextInt();
        System.out.println("Enter the divider:");
        int secondNumber = in.nextInt();
        in.close();
        if (secondNumber != 0) {
            int quotient = firstNumber/secondNumber;
            System.out.println("The quotient is: " + quotient);
        } 
        else {
            System.out.println("Can't divide by zero");
        }        
    }

    private static void basic4() {
        int exp1 = -5 + 8 * 6;
        System.out.println(String.valueOf(exp1));
        int exp2 = (55+9) % 9;
        System.out.println(String.valueOf(exp2));
        int exp3 = 20 + -3*5 / 8;
        System.out.println(String.valueOf(exp3));
        int exp4 = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(String.valueOf(exp4));
    }
}
