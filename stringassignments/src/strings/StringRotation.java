package strings;

import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

      
        if (isRotation(str1, str2)) {
            System.out.println("Yes, the second string is a rotation of the first string.");
        } else {
            System.out.println("No, the second string is not a rotation of the first string.");
        }

        scanner.close();
    }

    
    public static boolean isRotation(String s1, String s2) {
       
        if (s1.length() != s2.length() || s1.length() == 0) {
            return false;
        }

       
        String combined = s1 + s1;
        return combined.contains(s2);
    }
}
