import java.util.Scanner;

public class Basic2 {
    public static void main(String[] args) {
        basic2();

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
}
