package flowcontrol;

import java.util.Scanner;

public class Perfectnumbercheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.println("Perfect numbers between 1 and " + n + " are:");

        for (int num = 1; num <= n; num++) {
            int sum = 0;

            
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

           
            if (sum == num && num != 0) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
