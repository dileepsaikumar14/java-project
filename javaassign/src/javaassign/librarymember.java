package javaassign;

public class librarymember {
   
    int memberId;
    String memberName;
    int booksBorrowed;

   
    public librarymember(int id, String name) {
        memberId = id;
        memberName = name;
        booksBorrowed = 0;
    }

    
    public void borrowBooks(int count) {
        int maxLimit = 5; 

        if (booksBorrowed + count <= maxLimit) {
            booksBorrowed += count;
            System.out.println(memberName + " borrowed " + count + " books successfully.");
        } else {
            System.out.println("Cannot borrow " + count + " books. Limit of 5 exceeded.");
        }

        System.out.println("Total books currently borrowed: " + booksBorrowed);
        System.out.println("-------------------------------------");
    }

    
    public void displayInfo() {
        System.out.println("Member ID     : " + memberId);
        System.out.println("Member Name   : " + memberName);
        System.out.println("Books Borrowed: " + booksBorrowed);
        System.out.println("-------------------------------------");
    }

    
    public static void main(String[] args) {
        librarymember m1 = new librarymember(1259087, "DSK");

        m1.displayInfo();

       
        m1.borrowBooks(3);
        m1.borrowBooks(2);
        m1.borrowBooks(1); 

        m1.displayInfo();
    }
}

