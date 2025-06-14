package flowcontrol;

import java.util.Scanner;

public class Alphabetcheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);

       
        if ((input >= 'A' && input <= 'Z') || (input >= 'a' && input <= 'z')) {
            System.out.println("The input is an alphabet.");
        } else {
            System.out.println("The input is not an alphabet.");
        }

        scanner.close();
    }
}
