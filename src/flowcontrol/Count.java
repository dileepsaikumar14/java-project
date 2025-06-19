package flowcontrol;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int count = 0;

      
        for (int n = Math.abs(num); n > 0; n /= 10) {
            count++;
        }

       
        if (num == 0) {
            count = 1;
        }

        System.out.println("Number of digits in " + num + " is: " + count);

        scanner.close();
    }
}
