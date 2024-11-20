import java.util.Scanner;

public class Case3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare Variables
        int rows, columns;

        // Inputs
        System.out.print("Input number of row: ");
        rows = input.nextInt();

        System.out.print("Input number for column: ");
        columns = input.nextInt();

        // Operation
        for (int i = 1; i <= rows; i++) {
            if (i == 1 || i == rows) {
                for (int j = 1; j <= columns; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 1; j <= columns; j++) {
                    if (j == 1 || j == columns) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        input.close();
    }
}
