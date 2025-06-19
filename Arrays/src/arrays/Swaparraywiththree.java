package arrays;

import java.util.Scanner;

public class Swaparraywiththree{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter the size of the arrays: ");
        int size = scanner.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        int[] arr3 = new int[size];

       
        System.out.println("Enter elements for Array 1:");
        for (int i = 0; i < size; i++) {
            arr1[i] = scanner.nextInt();
        }

       
        System.out.println("Enter elements for Array 2:");
        for (int i = 0; i < size; i++) {
            arr2[i] = scanner.nextInt();
        }

       
        System.out.println("Enter elements for Array 3:");
        for (int i = 0; i < size; i++) {
            arr3[i] = scanner.nextInt();
        }

      
        for (int i = 0; i < size; i++) {
            int temp = arr1[i];   
            arr1[i] = arr3[i];   
            arr3[i] = arr2[i];    
            arr2[i] = temp;       
        }

       
        System.out.println("\nAfter Swapping:");
        System.out.print("Array 1: ");
        for (int val : arr1) System.out.print(val + " ");
        
        System.out.print("\nArray 2: ");
        for (int val : arr2) System.out.print(val + " ");
        
        System.out.print("\nArray 3: ");
        for (int val : arr3) System.out.print(val + " ");

        scanner.close();
    }
}
