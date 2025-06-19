package flowcontrol;

import java.util.Scanner;

public class Powerusingmathpow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("How many power calculations do you want to perform? ");
        int times = scanner.nextInt();

        for (int i = 1; i <= times; i++) {
            System.out.print("Enter base #" + i + ": ");
            double base = scanner.nextDouble();

            System.out.print("Enter exponent #" + i + ": ");
            double exponent = scanner.nextDouble();

            double result = Math.pow(base, exponent);
            System.out.println(base + "^" + exponent + " = " + result);
            System.out.println();
        }

        scanner.close();
    }
}
