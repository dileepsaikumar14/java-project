package arrays;

import java.util.Scanner;

public class SwapArraysWithTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the size of the arrays: ");
        int size = scanner.nextInt();

        int[] array1 = new int[size];
        int[] array2 = new int[size];

        
        System.out.println("Enter " + size + " elements for Array 1:");
        for (int i = 0; i < size; i++) {
            array1[i] = scanner.nextInt();
        }

        
        System.out.println("Enter " + size + " elements for Array 2:");
        for (int i = 0; i < size; i++) {
            array2[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < size; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }

        
        System.out.println("After swapping:");
        System.out.print("Array 1: ");
        for (int val : array1) {
            System.out.print(val + " ");
        }

        System.out.print("\nArray 2: ");
        for (int val : array2) {
            System.out.print(val + " ");
        }

        scanner.close();
    }
}
