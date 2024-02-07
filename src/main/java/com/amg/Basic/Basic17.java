package com.amg.Basic;

import java.util.Scanner;

public class Basic17 {
    final String GREETING = "Program calculating sum of two binary numbers";
    final String MESSAGE1 = "Input first binary number: ";
    final String MESSAGE2 = "Input second binary number: ";
    
    int binary1, binary2;
    String result;
    Scanner input;

    public static void main(String[] args) {
        Basic17 calc = new Basic17();

        calc.calculateWithMessages();
    }

    void calculateWithMessages() {
        System.out.println(GREETING);

        binary1 = getIntFromConsoleWithMessage(MESSAGE1);
        binary2 = getIntFromConsoleWithMessage(MESSAGE2);
        
        result = addBinaryNumbers(binary1, binary2);

        System.out.println(result);
    }

    public int getIntFromConsoleWithMessage(String message) {
        input = new Scanner(System.in);
        
        System.out.print(message);
        
        int num = input.nextInt();

        return num;
    }
    
    public String addBinaryNumbers(int binary1, int binary2) {
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
