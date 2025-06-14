package operators;

import java.util.Scanner;

public class Mixed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter first integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second integer (b): ");
        int b = scanner.nextInt();

        System.out.print("Enter third integer (c): ");
        int c = scanner.nextInt();

        
        boolean result = (a + b > c) && (b != 0);

        
        System.out.println("Condition (a + b > c) && (b != 0) is: " + result);

        scanner.close();
    }
}

