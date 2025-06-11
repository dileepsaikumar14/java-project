package javaassign;

public class localvariable {

    
    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2; 
        return sum;
    }

    public static void main(String[] args) {
        int a = 10;  
        int b = 20;  

        int result = calculateSum(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + result);
    }
}
