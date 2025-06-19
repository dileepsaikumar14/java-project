package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sortindescendingorder{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        Integer[] arr = new Integer[size]; 

   
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

       
        Arrays.sort(arr, Collections.reverseOrder());

    
        System.out.println("Array elements in descending order:");
        for (int val : arr) {
            System.out.print(val + " ");
        }

        scanner.close();
    }
}
