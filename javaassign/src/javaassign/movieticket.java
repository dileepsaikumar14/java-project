package javaassign;

public class movieticket {
    
    static int totalTicketsSold = 0;

    
    String movieName;
    String seatNumber;

    
    public movieticket(String movie, String seat) {
        movieName = movie;
        seatNumber = seat;
        totalTicketsSold++; 
        System.out.println("Ticket booked for " + movieName + " | Seat: " + seatNumber);
        System.out.println("Total Tickets Sold: " + totalTicketsSold);
        System.out.println("-------------------------------------");
    }

   
    public static void main(String[] args) {
        movieticket t1 = new movieticket("Inception", "A1");
        movieticket t2 = new movieticket("Inception", "A2");
        movieticket t3 = new movieticket("Interstellar", "B1");

        
        System.out.println("Final Total Tickets Sold: " + movieticket.totalTicketsSold);
    }
}
