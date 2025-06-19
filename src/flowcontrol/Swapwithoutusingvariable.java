package flowcontrol;

import java.util.Scanner;

public class Swapwithoutusingvariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter first value: ");
        int a = scanner.nextInt();

        System.out.print("Enter second value: ");
        int b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

       
        for (int i = 0; i < 1; i++) {
            a = a + b;  
            b = a - b;  
            a = a - b;  
        }

        System.out.println("After swapping: a = " + a + ", b = " + b);

        scanner.close();
    }
}
