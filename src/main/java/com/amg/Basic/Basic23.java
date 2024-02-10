package com.amg.Basic;

import java.util.Scanner;

public class Basic23 {
    public static void main(String[] args) {
        Basic23 b = new Basic23();
        BinaryToHexConverter converter = b.new BinaryToHexConverter();
        
        converter.printDesriptionAndMessage();
        converter.getStringFromConsole();

        converter.convertBinaryToHex();

        System.out.format("The hexadecimal result is: %s", converter.hex);
    }    

    class BinaryToHexConverter {
        String DESCRIPTION = "Program to convert a binary number to a hexadecimal number";
        String INPUT_MESSAGE = "Input a binary number: ";
        
        String binary;
        Integer decimal;
        String hex;

        void printDesriptionAndMessage() {
            System.out.println(DESCRIPTION);
            System.out.print(INPUT_MESSAGE);
        }
         
        void getStringFromConsole() {
            Scanner input = new Scanner(System.in);
            binary = input.nextLine();
            input.close();
        }

        void convertBinaryToHex() {
            decimal = Integer.valueOf(binary, 2);
            hex = Integer.toString(decimal, 16);
        }
    }
}
