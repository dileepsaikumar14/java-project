package arrays;

import java.util.Scanner;
import java.util.LinkedHashSet;

public class Removeduplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

       
        System.out.println("Enter " + size + " integer elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

       
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }

      
        System.out.println("Array after removing duplicates:");
        for (int num : set) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
