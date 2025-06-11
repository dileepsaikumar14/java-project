package javaassign;

public class finalsalary {
    public static void main(String[] args) {
        double salary = 85000.0;
        double taxRate = 20.0;

        double taxAmount = (salary * taxRate) / 100;

        System.out.println(" Salary: ₹" + salary);
        System.out.println("Tax @ 20%: ₹" + taxAmount);
    }
}
