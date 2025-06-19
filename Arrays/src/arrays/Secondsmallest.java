package arrays;

import java.util.Scanner;

public class Secondsmallest {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the size of the array (at least 2): ");
        int size = scanner.nextInt();

        if (size < 2) {
            System.out.println("Array must have at least 2 elements.");
            return;
        }

        int[] arr = new int[size];

      
        System.out.println("Enter " + size + " integer elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

      
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

    
        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

       
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no distinct second smallest element.");
        } else {
            System.out.println("The second smallest element is: " + secondSmallest);
        }

        scanner.close();
    }
}

