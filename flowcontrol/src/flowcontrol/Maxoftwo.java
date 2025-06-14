package flowcontrol;

import java.util.Scanner;

public class Maxoftwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        
        if (a > b) {
            System.out.println("Maximum number is: " + a);
        } else if (b > a) {
            System.out.println("Maximum number is: " + b);
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}
