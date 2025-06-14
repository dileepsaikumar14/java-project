package flowcontrol;

import java.util.Scanner;

public class Celsiustofahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        
        if (celsius <= 100) {
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else {
            System.out.println("The temperature entered is too high for typical conversion.");
        }

        scanner.close();
    }
}
