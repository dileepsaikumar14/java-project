package arrays;

import java.util.Scanner;

public class Calculatetheaveragevalue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

       
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

      
        double average = (double) sum / size;

        System.out.println("Average value of the array elements is: " + average);

        scanner.close();
    }
}
