package flowcontrol;

import java.util.Scanner;

public class Palindromenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int originalNum = num;
        int reversed = 0;

     
        for (int temp = num; temp > 0; temp /= 10) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
        }

      
        if (originalNum == reversed) {
            System.out.println(originalNum + " is a Palindrome number.");
        } else {
            System.out.println(originalNum + " is not a Palindrome number.");
        }

        scanner.close();
    }
}

