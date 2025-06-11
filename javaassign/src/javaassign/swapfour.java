package javaassign;
public class swapfour {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4, temp;

        temp = a;
        a = b;
        b = c;
        c = d;
        d = temp;

        System.out.println("After swap: a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
    }
}
