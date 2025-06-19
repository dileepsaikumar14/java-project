package arrays;

import java.util.Scanner;

public class Secondlargest{
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

       
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no distinct second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }

        scanner.close();
    }
}
