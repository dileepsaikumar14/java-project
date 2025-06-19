package flowcontrol;

import java.util.Scanner;

public class Upperorlowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a single character: ");
        char ch = scanner.next().charAt(0);

        
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an Uppercase letter.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a Lowercase letter.");
        } else {
            System.out.println(ch + " is not an alphabet letter.");
        }

        scanner.close();
    }
}
