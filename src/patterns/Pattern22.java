package patterns;

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
           
            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  ");
            }

            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + "   ");
                num = num * (i - j) / (j + 1); 
            }
            System.out.println();
        }

        scanner.close();
    }
}
