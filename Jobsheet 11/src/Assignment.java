import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sigmaSkibidi = new Scanner(System.in);

        // Declare Variables
        int matrixSize;
        int choice; // A variable for the user's choice in the program menu
        int primaryDiag = 0;
        int secondaryDiag = 0;
        boolean isSymmetric = true;

        // Ask the user for the matrix size
        System.out.print("Welcome to the square matrix creator program! Please enter the size of the square matrix: ");
        matrixSize = sigmaSkibidi.nextInt();

        // Declare matrix array with the size based on the input
        int[][] matrix = new int[matrixSize][matrixSize];

        while (true) {
            // Adds a syntax to display a menu for the user to choose
            System.out.println("\nChoose an option: ");
            System.out.println("1. Input elements into the matrix");
            System.out.println("2. Compute the sum of the primary diagonal");
            System.out.println("3. Compute the sum of the secondary diagonal");
            System.out.println("4. Check if the matrix is symmetric");
            System.out.println("5. Display the elements of the matrix");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sigmaSkibidi.nextInt();
            sigmaSkibidi.nextLine();

            switch (choice) {
                case 1:
                    // Ask the user to input the elements inside the matrix
                    System.out.println("Enter the elements of the matrix:");
                    for (int i = 0; i < matrixSize; i++) { // This loop iterates over each row
                        for (int j = 0; j < matrixSize; j++) { // This loop iterates over each column in that row
                            System.out.print("Element [" + i + "][" + j + "]: ");
                            matrix[i][j] = sigmaSkibidi.nextInt();
                        }
                    }
                    System.out.println();
                    break;
                case 2: //Sums up the primary diagonal (Top left --> Bottom Right)
                    for (int i = 0; i < matrixSize; i++) {
                        primaryDiag += matrix[i][i];
                    }
                    System.out.println("Primary diagonal sum: " + primaryDiag);
                    System.out.println();
                    break;
                case 3: //Sums up the secondary diagonal (Top Right --> Bottom Left)
                    for (int i = 0; i < matrixSize; i++) {
                        secondaryDiag += matrix[i][matrixSize - i - 1];
                    }
                    System.out.println("Secondary diagonal sum: " + secondaryDiag);
                    System.out.println();
                    break;
                case 4: //Checks whether the matrix is symmetric or no
                    for (int i = 0; i < matrixSize; i++) {
                        for (int j = 0; j < matrixSize; j++) {
                            if (matrix[i][j] != matrix[j][i]) {
                                isSymmetric = false;
                                break;
                            }
                        }
                        if (!isSymmetric)
                            break;
                    }
                    System.out.println("The matrix is " + (isSymmetric ? "symmetric." : "not symmetric."));
                    System.out.println();
                    break;
                case 5: //Display the whole matrix
                    System.out.println("The matrix is:");
                    for (int i = 0; i < matrixSize; i++) {
                        for (int j = 0; j < matrixSize; j++) {
                            System.out.print(matrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 6: //Exits the program
                    System.out.println("Exiting Program....");
                    sigmaSkibidi.close();
                    return;
                default:
                    // Handle invalid menu options
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

    }
}
