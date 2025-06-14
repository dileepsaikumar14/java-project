package flowcontrol;

import java.util.Scanner;

public class Charactercheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);

        
        if ((input >= 'A' && input <= 'Z') || (input >= 'a' && input <= 'z')) {
            System.out.println("The input is an Alphabet.");
        } else if (input >= '0' && input <= '9') {
            System.out.println("The input is a Digit.");
        } else {
            System.out.println("The input is a Special Character.");
        }

        scanner.close();
    }
}

