package strings;

import java.util.Scanner;

public class StringSplitting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        System.out.print("Enter a delimiter: ");
        String delimiter = scanner.nextLine();

      
        String[] parts = input.split(delimiter);

      
        System.out.println("Split parts:");
        for (String part : parts) {
            System.out.println(part);
        }

        scanner.close();
    }
}
