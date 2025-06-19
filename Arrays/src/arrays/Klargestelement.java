package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Klargestelement {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

       
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

   
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

       
        if (k <= 0 || k > size) {
            System.out.println("Invalid value of k. Must be between 1 and " + size);
            return;
        }

      
        Arrays.sort(arr);

        System.out.println(k + " largest elements are:");
        for (int i = size - 1; i >= size - k; i--) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
