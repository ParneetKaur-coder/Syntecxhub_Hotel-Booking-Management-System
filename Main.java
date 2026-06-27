import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hotel hotel = new Hotel();

        int choice;

        do {

            System.out.println("\n==============================");
            System.out.println(" HOTEL BOOKING MANAGEMENT ");
            System.out.println("==============================");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. View All Rooms");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            try {

                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:

                        hotel.viewAvailableRooms();
                        break;

                    case 2:

                        System.out.print("Enter Room Number: ");
                        int roomNo = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Customer Name: ");
                        String name = sc.nextLine();

                        if (name.trim().isEmpty()) {
                            System.out.println("Customer name cannot be empty.");
                            break;
                        }

                        hotel.bookRoom(roomNo, name);

                        break;

                    case 3:

                        System.out.print("Enter Room Number: ");
                        int cancelRoom = sc.nextInt();

                        hotel.cancelBooking(cancelRoom);

                        break;

                    case 4:

                        hotel.viewAllRooms();

                        break;

                    case 5:

                        System.out.println("Thank You!");
                        break;

                    default:

                        System.out.println("Invalid Choice.");
                }

            } catch (InputMismatchException e) {

                System.out.println("Please enter numbers only.");
                sc.nextLine();
                choice = 0;
            }

        } while (choice != 5);

        sc.close();
    }
}
