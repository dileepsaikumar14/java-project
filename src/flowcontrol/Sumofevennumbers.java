package flowcontrol;

import java.util.Scanner;

public class Sumofevennumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = 0;

       
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }

       
        System.out.println("Sum of even numbers from 1 to " + n + " is: " + sum);

        scanner.close();
    }
}
