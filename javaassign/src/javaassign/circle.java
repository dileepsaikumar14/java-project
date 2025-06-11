package javaassign;

public class circle {
   
    double radius;

    
    public circle(double r) {
        radius = r;
    }

   
    public void printArea() {
        double area = Math.PI * radius * radius; 
        System.out.println("Area of Circle with radius " + radius + " is: " + area);
    }

   
    public void printCircumference() {
        double circumference = 2 * Math.PI * radius; 
        System.out.println("Circumference of Circle with radius " + radius + " is: " + circumference);
    }

    
    public static void main(String[] args) {
        circle c1 = new circle(7.0);

        c1.printArea();
        c1.printCircumference();
    }
}
