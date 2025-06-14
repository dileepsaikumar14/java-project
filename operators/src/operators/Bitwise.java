package operators;

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter first integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second integer (b): ");
        int b = scanner.nextInt();

      
        System.out.println("a & b (Bitwise AND): " + (a & b));
        System.out.println("a | b (Bitwise OR): " + (a | b));
        System.out.println("a ^ b (Bitwise XOR): " + (a ^ b));
        System.out.println("~a (Bitwise NOT of a): " + (~a));
        System.out.println("~b (Bitwise NOT of b): " + (~b));
        System.out.println("a << 1 (Left shift a by 1): " + (a << 1));
        System.out.println("b >> 1 (Right shift b by 1): " + (b >> 1));

        scanner.close();
    }
}
