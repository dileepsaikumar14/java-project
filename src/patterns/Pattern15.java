package patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt(); 

        for (int i = rows; i >= 1; i--) {
            for (int j = rows; j > rows - i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
