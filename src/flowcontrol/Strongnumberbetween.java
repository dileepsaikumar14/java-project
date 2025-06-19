package flowcontrol;

import java.util.Scanner;

public class Strongnumberbetween {

   
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.println("Strong numbers between 1 and " + n + " are:");

        
        for (int num = 1; num <= n; num++) {
            int sum = 0;
            int temp = num;

           
            for (; temp > 0; temp /= 10) {
                int digit = temp % 10;
                sum += factorial(digit);
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
