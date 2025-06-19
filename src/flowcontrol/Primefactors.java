package flowcontrol;

import java.util.Scanner;

public class Primefactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Prime factors of " + num + " are:");

        int n = num;

       
        for (; n % 2 == 0; n /= 2) {
            System.out.print(2 + " ");
        }

       
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
           
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        
        if (n > 2) {
            System.out.print(n);
        }

        scanner.close();
    }
}
