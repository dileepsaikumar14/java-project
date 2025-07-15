package strings;

import java.util.Scanner;

public class StringFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter your full name (First Middle Last): ");
        String fullName = scanner.nextLine();

       
        String[] parts = fullName.trim().split(" ");

       
        if (parts.length < 2) {
            System.out.println("Please enter at least first and last name.");
        } else {
            String firstName = parts[0];
            String lastName = parts[parts.length - 1];

            
            StringBuilder middleName = new StringBuilder();
            for (int i = 1; i < parts.length - 1; i++) {
                middleName.append(parts[i]).append(" ");
            }

          
            System.out.println("Formatted Name: " + lastName + ", " + firstName + " " + middleName.toString().trim());
        }

        scanner.close();
    }
}
