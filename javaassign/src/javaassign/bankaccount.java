package javaassign;

public class bankaccount {
    
    int accountNumber;
    String accountHolderName;
    double balance;

    
    public bankaccount(int accNum, String accHolder, double initialBalance) {
        accountNumber = accNum;
        accountHolderName = accHolder;
        balance = initialBalance;
    }

    
    public void deposit(double amount) {
        double newBalance = balance + amount; 
        balance = newBalance; 
        System.out.println("Deposited: ₹" + amount);
    }

    
    public void displayAccountInfo() {
        System.out.println("Account Number     : " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Current Balance    : ₹" + balance);
        System.out.println("------------------------------------");
    }

   
    public static void main(String[] args) {
        
        bankaccount account = new bankaccount(70959750, "DSK", 10000.0);

       
        account.displayAccountInfo();

        
        account.deposit(5000.0);

       
        account.displayAccountInfo();
    }
}

