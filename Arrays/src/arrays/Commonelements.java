package arrays;

import java.util.Scanner;
import java.util.HashSet;

public class Commonelements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        scanner.nextLine(); 

        String[] arr1 = new String[size1];
        System.out.println("Enter " + size1 + " strings for the first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextLine();
        }

      
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        scanner.nextLine(); 

        String[] arr2 = new String[size2];
        System.out.println("Enter " + size2 + " strings for the second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextLine();
        }

        
        HashSet<String> set1 = new HashSet<>();
        for (String s : arr1) {
            set1.add(s);
        }

        HashSet<String> common = new HashSet<>();
        for (String s : arr2) {
            if (set1.contains(s)) {
                common.add(s);
            }
        }

        
        if (common.isEmpty()) {
            System.out.println("No common elements found.");
        } else {
            System.out.println("Common elements between the two arrays:");
            for (String s : common) {
                System.out.println(s);
            }
        }

        scanner.close();
    }
}
