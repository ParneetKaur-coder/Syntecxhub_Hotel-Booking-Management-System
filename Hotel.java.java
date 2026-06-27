import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;

    public Hotel() {

        rooms = new ArrayList<>();

        initializeRooms();
    }

    // Create Rooms
    private void initializeRooms() {

        rooms.add(new Room(101, "Standard", 1500));
        rooms.add(new Room(102, "Standard", 1500));
        rooms.add(new Room(103, "Deluxe", 2500));
        rooms.add(new Room(104, "Deluxe", 2500));
        rooms.add(new Room(105, "Suite", 4000));
        rooms.add(new Room(106, "Suite", 4000));
    }

    // View Available Rooms
    public void viewAvailableRooms() {

        boolean found = false;

        System.out.println("\nAvailable Rooms");

        for (Room room : rooms) {

            if (!room.isBooked()) {

                System.out.println("--------------------------------");
                System.out.println("Room Number : " + room.getRoomNumber());
                System.out.println("Type        : " + room.getRoomType());
                System.out.println("Price       : ₹" + room.getPrice());

                found = true;
            }
        }

        if (!found) {
            System.out.println("No rooms available.");
        }
    }

    // Book Room
    public void bookRoom(int roomNumber, String customerName) {

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber) {

                if (room.isBooked()) {
                    System.out.println("Room already booked.");
                    return;
                }

                room.bookRoom(customerName);

                System.out.println("Room booked successfully.");
                return;
            }
        }

        System.out.println("Invalid Room Number.");
    }

    // Cancel Booking
    public void cancelBooking(int roomNumber) {

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber) {

                if (!room.isBooked()) {

                    System.out.println("Room is not booked.");
                    return;
                }

                room.cancelBooking();

                System.out.println("Booking cancelled successfully.");
                return;
            }
        }

        System.out.println("Invalid Room Number.");
    }

    // View All Rooms
    public void viewAllRooms() {

        for (Room room : rooms) {

            System.out.println("--------------------------------");
            System.out.println("Room Number : " + room.getRoomNumber());
            System.out.println("Type        : " + room.getRoomType());
            System.out.println("Price       : ₹" + room.getPrice());

            if (room.isBooked()) {

                System.out.println("Status      : Booked");
                System.out.println("Customer    : " + room.getCustomerName());

            } else {

                System.out.println("Status      : Available");
            }
        }
    }
}