package arrays;

import java.util.Scanner;

public class Reverseorderarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

 
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

     
        System.out.println("Array elements in reverse order:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
