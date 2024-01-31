import java.util.Scanner;

public class Basic11 {
    public static void main(String[] args) {
        System.out.println("Program calculating area and perimeter of a circle.");
        System.out.print("Input radius of circle: ");
        
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        input.close();
        
        double perimeter = 2*Math.PI*radius;
        double area = Math.PI*Math.pow(radius, 2);
        
        System.out.println(String.format("Circle perimeter = %f\nCirlce area = %f", perimeter, area));    
    }
}
