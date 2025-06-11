package javaassign;

public class jiofiberplan {
    public static void main(String[] args) {
        double basePrice = 699.0;
        double gstRate = 18.0;

        double gstAmount = (basePrice * gstRate) / 100;
        double finalPrice = basePrice + gstAmount;

        System.out.println("JioFiber Plan Base Price: ₹" + basePrice);
        System.out.println("GST @ 18%: ₹" + gstAmount);
        System.out.println("Final Plan Cost: ₹" + finalPrice);
    }
}
