package javaassign;

public class collegestudent {
  
    int studentId;
    String studentName;

    
    static String collegeName = "National Institute of Technology";

    
    public collegestudent(int id, String name) {
        studentId = id;
        studentName = name;
    }

    
    public void displayStudentInfo() {
        System.out.println("Student ID    : " + studentId);
        System.out.println("Student Name  : " + studentName);
        System.out.println("College Name  : " + collegeName);
        System.out.println("----------------------------------");
    }

    
    public static void main(String[] args) {
      
        collegestudent s1 = new collegestudent(1259016, "DSK");
        collegestudent s2 = new collegestudent(1258096, "FdskMartha");
        collegestudent s3 = new collegestudent(1257086, "SinRaizel");

        
        s1.displayStudentInfo();
        s2.displayStudentInfo();
        s3.displayStudentInfo();

       
        collegestudent.collegeName = "CVR College of Enginnering";

        
        s1.displayStudentInfo();
        s2.displayStudentInfo();
        s3.displayStudentInfo();
    }
}

