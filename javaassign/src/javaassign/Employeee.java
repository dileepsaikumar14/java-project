package javaassign;

public class Employeee {
    
    int empId;
    String name;
    double salary;

   
    static int totalEmployees = 0;
    static double totalSalaryExpense = 0.0;

   
    public Employeee(int id, String empName, double empSalary) {
        empId = id;
        name = empName;
        salary = empSalary;

        
        totalEmployees++;
        totalSalaryExpense += salary;
    }

  
    public void displayEmployeeInfo() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary        : $" + salary);
        System.out.println("-------------------------------");
    }

   
    public static void main(String[] args) {
        Employeee e1 = new Employeee(1, "Ravi", 85000);
        Employeee e2 = new Employeee(2, "Suresh", 92000);
        Employeee e3 = new Employeee(3, "Ramesh", 78000);

        e1.displayEmployeeInfo();
        e2.displayEmployeeInfo();
        e3.displayEmployeeInfo();

        
        System.out.println("Total Employees      : " + Employeee.totalEmployees);
        System.out.println("Total Salary Expense : $" + Employeee.totalSalaryExpense);
    }
}
