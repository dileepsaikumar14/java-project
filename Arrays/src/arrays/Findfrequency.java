package arrays;

import java.util.Scanner;

public class Findfrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        boolean[] visited = new boolean[size]; 

       
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            visited[i] = false; 
        }

      
        System.out.println("Frequency of each element:");
        for (int i = 0; i < size; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println(arr[i] + " occurs " + count + " time(s)");
            }
        }

        scanner.close();
    }
}
