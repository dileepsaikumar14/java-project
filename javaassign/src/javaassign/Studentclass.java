package javaassign;

public class Studentclass {
    
    String name;
    int mark1, mark2, mark3;

    
    public Studentclass(String studentName, int m1, int m2, int m3) {
        name = studentName;
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    
    public void calculateAverage() {
        int total = mark1 + mark2 + mark3;      
        double average = total / 3.0;           

        System.out.println("Student Name  : " + name);
        System.out.println("Marks         : " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Total Marks   : " + total);
        System.out.println("Average Marks : " + average);
        System.out.println("----------------------------------");
    }

    
    public static void main(String[] args) {
        Studentclass s1 = new Studentclass("Dsk", 85, 90, 88);
        Studentclass s2 = new Studentclass("Suresh", 70, 65, 80);

        s1.calculateAverage();
        s2.calculateAverage();
    }
}
