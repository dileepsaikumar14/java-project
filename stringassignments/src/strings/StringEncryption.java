package strings;

import java.util.Scanner;

public class StringEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string to encrypt: ");
        String text = scanner.nextLine();

        System.out.print("Enter the shift key (e.g., 3): ");
        int shift = scanner.nextInt();

        String encrypted = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                ch = (char)((ch - base + shift) % 26 + base);
            }

            encrypted += ch;
        }

        System.out.println("Encrypted string: " + encrypted);

        scanner.close();
    }
}
