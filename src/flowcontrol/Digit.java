package flowcontrol;

import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);

        
        if (input >= '0' && input <= '9') {
            System.out.println("The input is a digit.");
        } else {
            System.out.println("The input is not a digit.");
        }

        scanner.close();
    }
}

