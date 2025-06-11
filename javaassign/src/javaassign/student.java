package javaassign;

public class student {
    
    int studentId;
    String studentName;

    
    static String schoolName = "Divyanjali High School";

   
    public student(int id, String name) {
        studentId = id;
        studentName = name;
    }

    
    public void displayInfo() {
        System.out.println("Student ID    : " + studentId);
        System.out.println("Student Name  : " + studentName);
        System.out.println("School Name   : " + schoolName);
        System.out.println("-----------------------------");
    }

    
    public static void main(String[] args) {
        student s1 = new student(1, "DSK");
        student s2 = new student(2, "Fdskmartha");

        s1.displayInfo();
        s2.displayInfo();

        
        student.schoolName = "Bhashayam Public School";

        
        s1.displayInfo();
        s2.displayInfo();
    }
}

