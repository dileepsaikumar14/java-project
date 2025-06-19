package arrays;

import java.util.Scanner;

public class Removespecificelement{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

       
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

       
        System.out.print("Enter the element to remove: ");
        int elementToRemove = scanner.nextInt();

       
        int removeIndex = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == elementToRemove) {
                removeIndex = i;
                break;
            }
        }

        if (removeIndex == -1) {
            System.out.println("Element not found in the array.");
        } else {
           
            int[] newArr = new int[size - 1];

     
            for (int i = 0, j = 0; i < size; i++) {
                if (i != removeIndex) {
                    newArr[j++] = arr[i];
                }
            }

      
            System.out.println("Array after removing " + elementToRemove + ":");
            for (int val : newArr) {
                System.out.print(val + " ");
            }
        }

        scanner.close();
    }
}
