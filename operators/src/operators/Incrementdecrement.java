package operators;

import java.util.Scanner;

public class Incrementdecrement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer (n): ");
        int n = scanner.nextInt();

        
        System.out.println("Original value of n: " + n);

        
        System.out.println("n++ (Post-increment): " + (n++));
        System.out.println("Value after n++: " + n);

        
        System.out.println("++n (Pre-increment): " + (++n));
        System.out.println("Value after ++n: " + n);

        
        System.out.println("n-- (Post-decrement): " + (n--));
        System.out.println("Value after n--: " + n);

       
        System.out.println("--n (Pre-decrement): " + (--n));
        System.out.println("Value after --n: " + n);

        scanner.close();
    }
}

