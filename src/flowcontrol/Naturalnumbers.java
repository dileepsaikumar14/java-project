package flowcontrol;

import java.util.Scanner;

public class Naturalnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

      
        System.out.println("Natural numbers from 1 to " + n + " are:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
