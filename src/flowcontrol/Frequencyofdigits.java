package flowcontrol;

import java.util.Scanner;

public class Frequencyofdigits{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        long num = scanner.nextLong(); 

        int[] freq = new int[10]; 

     
        for (long temp = Math.abs(num); temp > 0; temp /= 10) {
            int digit = (int)(temp % 10);
            freq[digit]++;
        }

       
        System.out.println("Digit frequencies in " + num + " are:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " time(s)");
            }
        }

        scanner.close();
    }
}

