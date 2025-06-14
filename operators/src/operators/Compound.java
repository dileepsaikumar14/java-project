package operators;

import java.util.Scanner;

public class Compound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter an integer (x): ");
        int x = scanner.nextInt();

        System.out.println("Original value of x: " + x);

       
        x += 5;
        System.out.println("After x += 5: " + x);

     
        x -= 3;
        System.out.println("After x -= 3: " + x);

        
        x *= 2;
        System.out.println("After x *= 2: " + x);

        
        x /= 4;
        System.out.println("After x /= 4: " + x);

       
        x %= 3;
        System.out.println("After x %= 3: " + x);

        scanner.close();
    }
}

