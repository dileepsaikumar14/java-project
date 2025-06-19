package flowcontrol;

import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum = 0;

       
        for (int n = Math.abs(num); n > 0; n /= 10) {
            int digit = n % 10; 
            sum += digit;      
        }

        System.out.println("Sum of digits of " + num + " is: " + sum);

        scanner.close();
    }
}
