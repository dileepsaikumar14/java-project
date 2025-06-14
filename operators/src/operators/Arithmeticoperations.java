package operators;

import java.util.Scanner;

public class Arithmeticoperations {
    private static Scanner scanner;

	public static void main(String[] args) {
        scanner = new Scanner(System.in);

        
        System.out.print("Enter first integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second integer (b): ");
        int b = scanner.nextInt();

        
        System.out.println("Addition of a and b is " + (a+b));
        System.out.println("Substraction of a and b is " + (a-b));
        System.out.println("Multiplication of a and b is " + a*b);
        System.out.println("Division of a and b is " + a/b);
        System.out.println("Modulus of a and b is " + a%b);
    }
}
