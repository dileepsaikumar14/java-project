package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sortinascendingorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

    
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

       
        Arrays.sort(arr);

      
        System.out.println("Array elements in ascending order:");
        for (int val : arr) {
            System.out.print(val + " ");
        }

        scanner.close();
    }
}

