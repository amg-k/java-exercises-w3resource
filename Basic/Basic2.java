import java.util.Scanner;

public class Basic2 {
    public static void main(String[] args) {
        basic2();

    }

    private static void basic2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Program calculating sum of two numbers");
        System.out.println("Enter the first number:");
        int firstNumber = Integer.parseInt(in.nextLine());
        System.out.println("Enter the second number:");
        int secondNumber = Integer.parseInt(in.nextLine());
        int sum = firstNumber + secondNumber;
        System.out.println("Sum of given numbers is: " + sum);
    }
}
