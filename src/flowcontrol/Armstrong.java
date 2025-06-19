package flowcontrol;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int originalNum = num;
        int sum = 0;

       
        int digits = 0;
        for (int temp = num; temp != 0; temp /= 10) {
            digits++;
        }

        
        for (int temp = num; temp != 0; temp /= 10) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
        }

        
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
