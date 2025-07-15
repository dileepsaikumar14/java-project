package strings;

import java.util.Scanner;

public class Stringcompression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String compressed = "";
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
          
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
               
                compressed += str.charAt(i) + String.valueOf(count);
                count = 1; 
            }
        }

      
        compressed += str.charAt(str.length() - 1) + String.valueOf(count);

      
        System.out.println("Compressed string: " + compressed);

        scanner.close();
    }
}
