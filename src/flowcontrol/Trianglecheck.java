package flowcontrol;
import java.util.Scanner;

public class Trianglecheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter side 1 length: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 length: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 length: ");
        double side3 = scanner.nextDouble();

       
        if ( (side1 + side2 > side3) &&
             (side2 + side3 > side1) &&
             (side1 + side3 > side2) ) {

           
            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is Equilateral.");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("The triangle is Isosceles.");
            } else {
                System.out.println("The triangle is Scalene.");
            }

        } else {
            System.out.println("Invalid triangle sides entered.");
        }

        scanner.close();
    }
}
