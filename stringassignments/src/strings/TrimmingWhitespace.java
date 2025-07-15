package strings;
import java.util.Scanner;

public class TrimmingWhitespace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String input = scanner.nextLine();
        String trimmed = input.trim();

        System.out.println("Original string: \"" + input + "\"");
        System.out.println("Trimmed string: \"" + trimmed + "\"");

        scanner.close();
    }
}
