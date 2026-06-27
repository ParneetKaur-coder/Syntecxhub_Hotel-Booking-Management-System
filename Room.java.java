public class Room {

    private int roomNumber;
    private String roomType;
    private double price;
    private boolean isBooked;
    private String customerName;

    // Constructor
    public Room(int roomNumber, String roomType, double price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.isBooked = false;
        this.customerName = "";
    }

    // Getters
    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public String getCustomerName() {
        return customerName;
    }

    // Book Room
    public void bookRoom(String customerName) {
        this.isBooked = true;
        this.customerName = customerName;
    }

    // Cancel Booking
    public void cancelBooking() {
        this.isBooked = false;
        this.customerName = "";
    }
}