package arrays;

import java.util.Scanner;

public class Indexarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

      
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        
        System.out.print("Enter the element to find the index of: ");
        int target = scanner.nextInt();

        int index = -1; 

       
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();
    }
}
