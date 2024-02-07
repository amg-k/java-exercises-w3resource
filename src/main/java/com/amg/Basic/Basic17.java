package com.amg.Basic;

import java.util.Scanner;

public class Basic17 {
    public static void main(String[] args) {
        String greeting = "Program calculating sum of two binary numbers";
        String message1 = "Input first binary number: ";
        String message2 = "Input second binary number: ";

        System.out.println(greeting);

        int binary1 = Basic17.getIntFromConsoleWithMessage(message1);
        int binary2 = Basic17.getIntFromConsoleWithMessage(message2);
        
        String result = Basic17.addBinaryNumbers(binary1, binary2);

        System.out.println(result);
    }

    static public int getIntFromConsoleWithMessage(String message) {
        Scanner input = new Scanner(System.in);
        
        System.out.print(message);
        
        int num = input.nextInt();

        return num;
    }
    
    public static String addBinaryNumbers(int binary1, int binary2) {
        StringBuilder sum = new StringBuilder();
        int reminder = 0;

        while (binary1 != 0 || binary2 != 0) {
            sum.append(Integer.toString((int) ((binary1 % 10 + binary2 % 10 + reminder) % 2)));
            reminder = (int) ((binary1 % 10 + binary2 % 10 + reminder) / 2);
            binary1 = (int) binary1 / 10;
            binary2 = (int) binary2 / 10;
        }
        
        if (reminder == 1) {
            sum.append(reminder);
        }
        sum.reverse();

        return sum.toString();
    }
}
