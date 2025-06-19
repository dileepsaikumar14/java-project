package arrays;

import java.util.Scanner;
import java.util.HashSet;

public class Duplicateusingstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the number of strings: ");
        int size = scanner.nextInt();
        scanner.nextLine(); 

        String[] arr = new String[size];

        
        System.out.println("Enter " + size + " strings:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextLine();
        }

        HashSet<String> seen = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();

       
        for (String str : arr) {
            if (!seen.add(str)) {
                duplicates.add(str);
            }
        }

      
        if (duplicates.isEmpty()) {
            System.out.println("No duplicate strings found.");
        } else {
            System.out.println("Duplicate strings in the array are:");
            for (String dup : duplicates) {
                System.out.println(dup);
            }
        }

        scanner.close();
    }
}
