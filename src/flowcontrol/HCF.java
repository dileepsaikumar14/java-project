package flowcontrol;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int hcf = 1; 

    
        int min = (num1 < num2) ? num1 : num2;

        
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }

        System.out.println("HCF (GCD) of " + num1 + " and " + num2 + " is: " + hcf);

        scanner.close();
    }
}
