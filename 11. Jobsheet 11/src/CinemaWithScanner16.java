import java.util.Scanner;

public class CinemaWithScanner16 {
    public static void main(String[] args) {
        Scanner sigmaSkibidi = new Scanner(System.in);

        int row, column;
        String name, next;
        String[][] audience = new String[4][2];
        int choice; // A variable for the user to input a choice from the menu list
        boolean validInput = false; // A variable to indicate whether the row and seats input in the option 1 is
                                    // valid or not

        while (true) {
            // Adds a syntax to display a menu for the user to choose
            System.out.println("Choose an option: "); // List of options the user can input and also the description
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: "); // Giving the user to input an option
            choice = sigmaSkibidi.nextInt();
            sigmaSkibidi.nextLine();

            switch (choice) {
                case 1:
                    do { // Using a do-while loop so the user can still input the audience data as long
                         // as the user keeps inputting y as an option
                        System.out.print("Enter a name: ");
                        name = sigmaSkibidi.nextLine();
                        validInput = false; // Reset validInput for each new audience member

                        while (!validInput) { // Using a while loop to repeatedly prompt for valid row and columns.
                            System.out.print("Enter row number: ");
                            row = sigmaSkibidi.nextInt();
                            System.out.print("Enter column number: ");
                            column = sigmaSkibidi.nextInt();
                            sigmaSkibidi.nextLine(); // Clear the newline character left by nextInt()

                            // Check if row and column numbers are within valid bounds
                            if (row >= 1 && row <= audience.length && column >= 1 && column <= audience[0].length) {
                                if (audience[row - 1][column - 1] != null) { // Check if the seat is already occupied
                                    System.out.println(
                                            "The selected seat is already occupied. Please choose another seat.");
                                } else {
                                    audience[row - 1][column - 1] = name; // Assign the name to the seat
                                    validInput = true; // Mark input as valid to exit the loop
                                }
                            } else {
                                System.out.println("Invalid row or column number. Please try again.");
                            }
                        }

                        System.out.print("Are there any other audience members to add? (y/n): ");
                        next = sigmaSkibidi.nextLine();
                    } while (next.equalsIgnoreCase("y")); // Repeat if user enters 'y'
                    break;
                case 2:
                    for (int i = 0; i < audience.length; i++) { // Loops the print syntax using for loop
                        // Create a new array to hold the display values
                        String[] displayRow = new String[audience[i].length];
                        for (int j = 0; j < audience[i].length; j++) {
                            // If the seat is null, display "***", otherwise display the name
                            displayRow[j] = (audience[i][j] == null) ? "***" : audience[i][j];

                        }
                        System.out.println("Audience in the row " + (i + 1) + ": " + String.join(", ", displayRow));
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program..."); // Displays a sentence that the program is exiting
                    return;
				default:
					System.out.println("Please input the valid choice!");
            }
        }
    }
}
