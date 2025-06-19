package flowcontrol;

import java.util.Scanner;

public class Strongnumbercheck {
   
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum = 0;
        int temp = num;

        
        for (; temp > 0; temp /= 10) {
            int digit = temp % 10;
            sum += factorial(digit);
        }

       
        if (sum == num) {
            System.out.println(num + " is a Strong number.");
        } else {
            System.out.println(num + " is not a Strong number.");
        }

        scanner.close();
    }
}
