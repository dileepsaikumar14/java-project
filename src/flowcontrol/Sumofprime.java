package flowcontrol;

import java.util.Scanner;

public class Sumofprime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = 0;

       
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;

          
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

           
            if (isPrime) {
                sum += num;
            }
        }

        System.out.println("Sum of prime numbers between 1 and " + n + " is: " + sum);

        scanner.close();
    }
}
