package flowcontrol;

import java.util.Scanner;

public class Studentgradecheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter marks obtained in Maths: ");
        double maths = scanner.nextDouble();

        System.out.print("Enter marks obtained in Physics: ");
        double physics = scanner.nextDouble();

        System.out.print("Enter marks obtained in Chemistry: ");
        double chemistry = scanner.nextDouble();

        System.out.print("Enter marks obtained in English: ");
        double english = scanner.nextDouble();

        System.out.print("Enter marks obtained in Hindi: ");
        double hindi = scanner.nextDouble();

        
        double totalMarks = 500;

      
        double obtainedMarks = maths + physics + chemistry + english + hindi;

        
        double percentage = (obtainedMarks / totalMarks) * 100;

       
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

       
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
