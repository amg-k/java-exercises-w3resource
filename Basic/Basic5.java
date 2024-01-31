import java.util.Scanner;

public class Basic5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program calculating product of multiplication.");
        System.out.print("Input first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = input.nextInt();
        input.close();
        int product = firstNumber*secondNumber;

        System.out.println(String.format("%d x %d = %d", firstNumber, secondNumber, product));
    }
}
