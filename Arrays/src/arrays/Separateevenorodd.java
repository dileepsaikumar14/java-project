package arrays;

import java.util.Scanner;

public class Separateevenorodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        int[] result = new int[size];

       
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int index = 0;

       
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                result[index++] = arr[i];
            }
        }

    
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {
                result[index++] = arr[i];
            }
        }

        
        System.out.println("Array after separating even and odd numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print(result[i] + " ");
        }

        scanner.close();
    }
}

