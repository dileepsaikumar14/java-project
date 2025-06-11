package javaassign;

public class product {
    
    int id;
    String name;
    double price;

    
    public product(int productId, String productName, double productPrice) {
        id = productId;
        name = productName;
        price = productPrice;
    }

    
    public void calculateDiscount(double discountPercent) {
        double discountAmount = (price * discountPercent) / 100; 
        double finalPrice = price - discountAmount;              

        System.out.println("Product ID       : " + id);
        System.out.println("Product Name     : " + name);
        System.out.println("Original Price   : $" + price);
        System.out.println("Discount (" + discountPercent + "%): $" + discountAmount);
        System.out.println("Final Price      : $" + finalPrice);
        System.out.println("----------------------------------------");
    }

   
    public static void main(String[] args) {
        product p1 = new product(1, "Airpods", 250.0);
        product p2 = new product(2, "Watch SE", 450.0);

        p1.calculateDiscount(10.0); 
        p2.calculateDiscount(15.0); 
    }
}
