package javaassign;
public class salarycal {
    public static void main(String[] args) {
        double basicSalary = 85000.0;

        
        double ta = basicSalary * 15 / 100;
        double da = basicSalary * 20 / 100;
        double hra = basicSalary * 18 / 100;

        
        double grossSalary = basicSalary + ta + da + hra;

        
        double pf = basicSalary * 20 / 100;
        double tax = basicSalary * 25 / 100;

       
        double netSalary = grossSalary - (pf + tax);

      
        System.out.println("Basic Salary: ₹" + basicSalary);
        System.out.println("TA (15%): ₹" + ta);
        System.out.println("DA (20%): ₹" + da);
        System.out.println("HRA (18%): ₹" + hra);
        System.out.println("Gross Salary: ₹" + grossSalary);
        System.out.println("PF (20%): ₹" + pf);
        System.out.println("Tax (25%): ₹" + tax);
        System.out.println("Net Salary: ₹" + netSalary);
    }
}
