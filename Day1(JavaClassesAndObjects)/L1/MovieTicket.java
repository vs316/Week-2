package JavaClassAndObjects;

public class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket("Avengers: Endgame", "A12", 300.00); // Example details
        ticket.displayTicketDetails();
    }

    // Method to book a ticket
    public void bookTicket(String movie, String seat, double ticketPrice) {
        this.movieName = movie;
        this.seatNumber = seat;
        this.price = ticketPrice;
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
}