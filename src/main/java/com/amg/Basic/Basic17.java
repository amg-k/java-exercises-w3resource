package com.amg.Basic;

import java.util.Arrays;
import java.util.Scanner;

public class Basic17 {
    public static void main(String[] args) {
/*         System.out.println("Program calculating sum of two binary numbers");
                
        Scanner input = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        int firstBinary = Integer.bitCount(input.nextInt());
        
        System.out.print("Input second binary number: ");
        int secondBinary = Integer.bitCount(input.nextInt());
        input.close();
        
        System.out.println(Math.addExact(firstBinary, secondBinary)); */

        Basic17.addBinaryNumbers(1010, 10100);
    }

    public int[] getDataFromConsole(String greeting, String message1, String message2) {
        System.out.println(greeting);

        Scanner input = new Scanner(System.in);
        System.out.print(message1);
        int firstBinary = Integer.bitCount(input.nextInt());
        
        System.out.print(message2);
        int secondBinary = Integer.bitCount(input.nextInt());
        input.close();

        return new int[] { firstBinary, secondBinary };
    }

    public static int addBinaryNumbers(int binary1, int binary2) {
        int[] sum = new int[20];
        int i = 0;
        int reminder = 0;

        while (binary1 != 0 || binary2 != 0) {
            sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + reminder) % 2);
            reminder = (int) ((binary1 % 10 + binary2 % 10 + reminder) / 2);
            binary1 = (int) binary1 / 10;
            binary2 = (int) binary2 / 10;
        }
        System.out.println(Arrays.toString(sum));
        return 0;
    }
}
