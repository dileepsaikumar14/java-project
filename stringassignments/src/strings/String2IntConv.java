package strings;

import java.util.Scanner;

public class String2IntConv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string of digits: ");
        String input = scanner.nextLine();

        int number = 0;
        for (int i = 0; i < input.length(); i++) {
            number = number * 10 + (input.charAt(i) - '0');
        }

        System.out.println("Converted integer: " + number);
        scanner.close();
    }
}
