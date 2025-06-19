package flowcontrol;

import java.util.Scanner;

public class Reversenaturalnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

       
        System.out.println("Natural numbers from " + n + " to 1 are:");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
