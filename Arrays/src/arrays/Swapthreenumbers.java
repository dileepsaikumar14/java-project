package arrays;

import java.util.Scanner;

public class Swapthreenumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter value of b: ");
        int b = scanner.nextInt();

        System.out.print("Enter value of c: ");
        int c = scanner.nextInt();

        System.out.println("\nBefore Swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

       
        int temp = a;
        a = c;
        c = b;
        b = temp; 

        System.out.println("\nAfter Swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        scanner.close();
    }
}
