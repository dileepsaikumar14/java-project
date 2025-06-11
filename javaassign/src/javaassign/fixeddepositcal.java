package javaassign;

public class fixeddepositcal {
    public static void main(String[] args) {
        double principal = 500000.0; 
        double rate = 6.8;           
        int time = 5;                

       
        double interest = (principal * time * rate) / 100;
        double finalAmount = principal + interest;

        System.out.println("Principal Amount: ₹" + principal);
        System.out.println("Interest @ 6.8% for 5 years: ₹" + interest);
        System.out.println("Final Amount after 5 years: ₹" + finalAmount);
    }
}
