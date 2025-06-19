package arrays;

import java.util.Scanner;

public class Swaparraywith2tempvar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the size of the arrays: ");
        int size = scanner.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

   
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < size; i++) {
            arr1[i] = scanner.nextInt();
        }

     
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < size; i++) {
            arr2[i] = scanner.nextInt();
        }

       
        for (int i = 0; i < size; i++) {
            int temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }

       
        System.out.println("After swapping:");
        System.out.print("First array: ");
        for (int val : arr1) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.print("Second array: ");
        for (int val : arr2) {
            System.out.print(val + " ");
        }

        scanner.close();
    }
}
