package strings;
import java.util.Scanner;

public class SubstringFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

      
        System.out.print("Enter the substring to find: ");
        String subString = scanner.nextLine();

        int count = 0;
        int index = 0;

      
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index = index + subString.length();
        }

        System.out.println("Frequency of substring \"" + subString + "\": " + count);

        scanner.close();
    }
}
