package arrays;

import java.util.Scanner;
import java.util.HashSet;

public class Duplicatevalue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

       
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

      
        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

     
        if (duplicates.isEmpty()) {
            System.out.println("No duplicate values found.");
        } else {
            System.out.println("Duplicate values in the array are:");
            for (int dup : duplicates) {
                System.out.print(dup + " ");
            }
        }

        scanner.close();
    }
}
