import java.util.Scanner;

public class CinemaSeating {
    public static void main(String[] args) {
        Scanner sigmaSkibidi = new Scanner(System.in);
        int[][] audience = new int[5][5];
        int choice;
        int row, column;

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
                            System.out.println("Seat successfully booked.");
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
                            System.out.println("Booking successfully cancelled.");
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
