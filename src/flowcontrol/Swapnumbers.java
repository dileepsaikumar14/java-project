package flowcontrol;

import java.util.Scanner;

public class Swapnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        
        if (num >= 0 && num < 10) {
            System.out.println("After swapping first and last digit: " + num);
            scanner.close();
            return;
        }

        int originalNum = num;
        int digitsCount = 0;
        int temp = num;

      
        for (; temp > 0; temp /= 10) {
            digitsCount++;
        }

        int lastDigit = num % 10;
        int firstDigit = 0;

        temp = num;

      
        for (int i = 1; i <= digitsCount; i++) {
            firstDigit = temp % 10;
            temp /= 10;
        }

      
        int middlePart = num % (int) Math.pow(10, digitsCount - 1);
        middlePart /= 10;

       
        int swappedNum = lastDigit * (int) Math.pow(10, digitsCount - 1) + middlePart * 10 + firstDigit;

        System.out.println("After swapping first and last digit: " + swappedNum);

        scanner.close();
    }
}
