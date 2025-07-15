package strings;

import java.util.Scanner;

public class ReplacingCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        
        String input = scanner.nextLine();  
        System.out.print("Enter the character to replace: ");
        
        char oldChar = scanner.next().charAt(0); 
        System.out.print("Enter the new character: ");
        
        char newChar = scanner.next().charAt(0);
        String replacedString = input.replace(oldChar, newChar); 
        System.out.println("Modified string: " + replacedString);

        scanner.close();
    }
}
