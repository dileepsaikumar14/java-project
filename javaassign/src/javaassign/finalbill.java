package javaassign;

public class finalbill {
    public static void main(String[] args) {
        double pizzaPrice = 399.0;
        int quantity = 2;
        double discountRate = 20.0;

        double totalBill = pizzaPrice * quantity;
        double discountAmount = (totalBill * discountRate) / 100;
        double finalAmount = totalBill - discountAmount;

        System.out.println("Total Bill Before Discount: ₹" + totalBill);
        System.out.println("Discount @ 20%: ₹" + discountAmount);
        System.out.println("Final Bill Amount: ₹" + finalAmount);
    }
}
