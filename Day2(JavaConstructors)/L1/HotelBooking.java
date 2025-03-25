package JavaConstructorsAndAccessModifiers;

// HotelBooking Class
class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default Constructor
    public HotelBooking() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 0;
    }

    // Parameterized Constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy Constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
}
