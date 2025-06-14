package flowcontrol;

import java.util.Scanner;

public class Vowelorconsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a single alphabet character: ");
        char ch = scanner.next().charAt(0);

       
        char lowerCh = Character.toLowerCase(ch);

        
        if ((lowerCh >= 'a' && lowerCh <= 'z')) {
           
            if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                System.out.println(ch + " is a Vowel.");
            } else {
                System.out.println(ch + " is a Consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter an alphabet letter.");
        }

        scanner.close();
    }
}
