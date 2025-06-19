package arrays;

import java.util.Scanner;

public class Arraycontainspecificvalue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

      
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

     
        System.out.print("Enter the value to search: ");
        int value = scanner.nextInt();

        boolean found = false;

        
        for (int num : arr) {
            if (num == value) {
                found = true;
                break;
            }
        }

        // Output result
        if (found) {
            System.out.println(value + " is found in the array.");
        } else {
            System.out.println(value + " is not found in the array.");
        }

        scanner.close();
    }
}
