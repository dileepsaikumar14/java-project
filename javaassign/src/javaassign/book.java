package javaassign;

public class book {
    
    String title;
    String author;

    
    static int bookCount = 0;

    
    public book(String title, String author) {
        this.title = title;
        this.author = author;
        bookCount++; 
    }

    
    public void printBookInfo() {
        int serialNumber = bookCount; 
        System.out.println("Book Serial Number: " + serialNumber);
        System.out.println("Title             : " + title);
        System.out.println("Author            : " + author);
        System.out.println("-------------------------------------");
    }

    
    public static void main(String[] args) {
        book b1 = new book("1984", "George Orwell");
        book b2 = new book("Harry potter", "JK Rowling");
        book b3 = new book("War and Peace", "Leo Tolstoy");

        
        b1.printBookInfo();
        b2.printBookInfo();
        b3.printBookInfo();

       
        System.out.println("Total Books in Inventory: " + book.bookCount);
    }
}

