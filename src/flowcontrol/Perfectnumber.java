package flowcontrol;

import java.util.Scanner;

public class Perfectnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum = 0;

        
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

       
        if (sum == num && num != 0) {
            System.out.println(num + " is a Perfect number.");
        } else {
            System.out.println(num + " is not a Perfect number.");
        }

        scanner.close();
    }
}
