package operators;

import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter boolean value for x (true/false): ");
        boolean x = scanner.nextBoolean();

        System.out.print("Enter boolean value for y (true/false): ");
        boolean y = scanner.nextBoolean();

        
        System.out.println("x && y: " + (x && y));  
        System.out.println("x || y: " + (x || y));  
        System.out.println("!x: " + (!x));           
        System.out.println("!y: " + (!y));           

        scanner.close();
    }
}
