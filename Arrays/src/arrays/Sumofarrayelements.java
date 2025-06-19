package arrays;

import java.util.Scanner;

public class Sumofarrayelements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        int sum = 0;

    
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i]; 
        }

       
        System.out.println("Sum of all elements: " + sum);

        scanner.close();
    }
}
