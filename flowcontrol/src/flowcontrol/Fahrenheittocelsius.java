package flowcontrol;

import java.util.Scanner;

public class Fahrenheittocelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

       
        if (fahrenheit >= -459.67) { 
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius);
        } else {
            System.out.println("Invalid input: Temperature below absolute zero!");
        }

        scanner.close();
    }
}
