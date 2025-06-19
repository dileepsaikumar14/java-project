package arrays;

import java.util.Scanner;

public class Copyelements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] sourceArray = new int[size];
        int[] destinationArray = new int[size];

        
        System.out.println("Enter " + size + " elements for the source array:");
        for (int i = 0; i < size; i++) {
            sourceArray[i] = scanner.nextInt();
        }

       
        for (int i = 0; i < size; i++) {
            destinationArray[i] = sourceArray[i];
        }

       
        System.out.println("Elements in the destination array:");
        for (int val : destinationArray) {
            System.out.print(val + " ");
        }

        scanner.close();
    }
}
