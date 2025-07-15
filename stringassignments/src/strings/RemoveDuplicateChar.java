package strings;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeDuplicates(input);

        System.out.println("String after removing duplicates: " + result);

        scanner.close();
    }

    
    public static String removeDuplicates(String str) {
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (seen.add(c)) { 
                result.append(c);
            }
        }
        return result.toString();
    }
}
