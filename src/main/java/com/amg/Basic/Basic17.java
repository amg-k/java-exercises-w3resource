package com.amg.Basic;

import java.util.Scanner;

public class Basic17 {
    public static void main(String[] args) {
        String greeting = "Program calculating sum of two binary numbers";
        String message1 = "Input first binary number: ";
        String message2 = "Input second binary number: ";

        int[] addends = Basic17.getDataFromConsole(greeting, message1, message2);
        String result = Basic17.addBinaryNumbers(addends[0], addends[1]);

        System.out.println(result);
    }

    static public int[] getDataFromConsole(String greeting, String message1, String message2) {
        System.out.println(greeting);

        Scanner input = new Scanner(System.in);
        System.out.print(message1);
        int firstBinary = input.nextInt();
        
        System.out.print(message2);
        int secondBinary = input.nextInt();
        input.close();

        return new int[] { firstBinary, secondBinary };
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
