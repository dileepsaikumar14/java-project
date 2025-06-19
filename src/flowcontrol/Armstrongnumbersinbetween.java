package flowcontrol;

import java.util.Scanner;

public class Armstrongnumbersinbetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.println("Armstrong numbers between 1 and " + n + " are:");

        for (int num = 1; num <= n; num++) {
            int sum = 0;
            int digits = 0;
            int temp = num;

          
            for (int t = temp; t != 0; t /= 10) {
                digits++;
            }

            temp = num;

           
            for (int t = temp; t != 0; t /= 10) {
                int digit = t % 10;
                sum += Math.pow(digit, digits);
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
