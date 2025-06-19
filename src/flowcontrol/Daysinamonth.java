package flowcontrol;

import java.util.Scanner;

public class Daysinamonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();

        
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        int days = 0;

        if (month == 1 || month == 3 || month == 5 || month == 7 ||
            month == 8 || month == 10 || month == 12) {
            days = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else if (month == 2) {
            
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                days = 29;
            } else {
                days = 28;
            }
        } else {
            System.out.println("Invalid month number!");
            scanner.close();
            return; 
        }

        System.out.println("Number of days in month " + month + " of year " + year + " is: " + days);

        scanner.close();
    }
}
