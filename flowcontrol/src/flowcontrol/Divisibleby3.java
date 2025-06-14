package flowcontrol;

import java.util.Scanner;

public class Divisibleby3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        
        if (num % 3 == 0) {
            System.out.println(num + " is divisible by 3.");
        } else {
            System.out.println(num + " is not divisible by 3.");
        }

        scanner.close();
    }
}

