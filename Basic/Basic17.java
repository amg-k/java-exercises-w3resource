import java.util.Scanner;

public class Basic17 {
    public static void main(String[] args) {
        System.out.println("Program calculating sum of two binary numbers");
                
        Scanner input = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        int firstBinary = Integer.bitCount(input.nextInt());
        
        System.out.print("Input second binary number: ");
        int secondBinary = Integer.bitCount(input.nextInt());
        input.close();
        
        System.out.println(Math.addExact(firstBinary, secondBinary));
    }
}
