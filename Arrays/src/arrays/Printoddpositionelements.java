package arrays;

import java.util.Scanner;

public class Printoddpositionelements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

      
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

       
        System.out.println("Elements at odd positions:");
        for (int i = 0; i < size; i += 2) { 
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
