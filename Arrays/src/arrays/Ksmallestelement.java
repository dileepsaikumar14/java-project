package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ksmallestelement {
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
            System.out.println("Invalid value of k. It must be between 1 and " + size);
            return;
        }

       
        Arrays.sort(arr);

       
        System.out.println(k + " smallest elements are:");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
