package strings;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
       
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                builder.append(Character.toLowerCase(ch));
            }
        }

        String cleanedInput = builder.toString();

        
        boolean isPalindrome = true;

       
        for (int i = 0; i < cleanedInput.length() / 2; i++) {
            if (cleanedInput.charAt(i) != cleanedInput.charAt(cleanedInput.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }
}
