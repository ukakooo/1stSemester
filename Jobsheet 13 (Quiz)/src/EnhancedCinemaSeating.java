import java.util.Scanner;

public class EnhancedCinemaSeating {
    public static void main(String[] args) {
        Scanner sigmaSkibidi = new Scanner(System.in);
        int[][] audience = new int[5][5];
        int choice;
        int row, column;
        int bookedSeats = 0;
        int earnings = 0;
        int seatPrice, vipPrice = 20, regularPrice = 15, economyPrice = 10;

        // Initialize each seat with 0 (not occupied)
        for (int i = 0; i < audience.length; i++) {
            for (int j = 0; j < audience[i].length; j++) {
                audience[i][j] = 0;
            }
        }

        while (true) {
            // Display the seating arrangement
            System.out.println("\nCurrent Available Seats:");
            for (int i = 0; i < audience.length; i++) {
                for (int j = 0; j < audience[i].length; j++) {
                    System.out.print(audience[i][j] + " ");
                }
                System.out.println();
            }

            int availableSeats = audience.length * audience[0].length - bookedSeats; // Calculate the available seats
                                                                                     // count by multiply the row length
                                                                                     // and the column length and then
                                                                                     // subtracted by the Booked Seats
                                                                                     // count

            System.out.println("Total Booked Seats: " + bookedSeats);
            System.out.println("Total Available Seats: " + availableSeats);
            System.out.println("Total Earnings : $" + earnings);

            System.out.println("\nMenu: ");
            System.out.println("1. Book a seat");
            System.out.println("2. Cancel a booking");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = sigmaSkibidi.nextInt();
            sigmaSkibidi.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter row number (0-4): ");
                    row = sigmaSkibidi.nextInt();
                    System.out.print("Enter column number (0-4): ");
                    column = sigmaSkibidi.nextInt();
                    sigmaSkibidi.nextLine();

                    if (row >= 0 && row < 5 && column >= 0 && column < 5) {
                        // Checks if the current seat is not yet occupied
                        if (audience[row][column] == 0) { // A condition if the seat is not yet occupied.
                            audience[row][column] = 1; // Mark the seat as occupied.
                            bookedSeats++; // Increase the Booked Seats count

                            //Extra if-else operator to check the category seats
                            if (row <= 1) {
                                seatPrice = vipPrice; // Row 0 and 1 are VIP
                            } else if (row <= 3) {
                                seatPrice = regularPrice; // Row 2 and 3 are Regular
                            } else {
                                seatPrice = economyPrice; // Row 4 is Economy
                            }
                            earnings += seatPrice; //Increase the earning value
                            System.out.println("Seat successfully booked. Price: $" + seatPrice);
                        } else { // A condition where the seat is occupied.
                            System.out.println("Seat already booked. Please choose a different seat.");
                        }
                    } else {
                        System.out.println("Invalid seat location. Please try again.");
                    }
                    break;

                case 2:
                    System.out.print("Enter row number (0-4): ");
                    row = sigmaSkibidi.nextInt();
                    System.out.print("Enter column number (0-4): ");
                    column = sigmaSkibidi.nextInt();
                    sigmaSkibidi.nextLine();

                    if (row >= 0 && row < 5 && column >= 0 && column < 5) {
                        if (audience[row][column] == 1) {
                            audience[row][column] = 0; // Mark the seat as not occupied
                            bookedSeats--; // Decrease the booked seats count

                            //Extra if-else operator to check the category seats
                            if (row <= 1) {
                                seatPrice = vipPrice; // Row 0 and 1 are VIP
                            } else if (row <= 3) {
                                seatPrice = regularPrice; // Row 2 and 3 are Regular
                            } else {
                                seatPrice = economyPrice; // Row 4 is Economy
                            }
                            earnings -= seatPrice; //Decrease the earning value
                            System.out.println("Booking successfully cancelled. ");
                        } else {
                            System.out.println("Seat is not booked. Nothing to cancel.");
                        }
                    } else {
                        System.out.println("Invalid seat location. Please try again.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting the program. Thank you!");
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
