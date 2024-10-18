import java.util.Scanner;

public class Extra2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Input some number: ");
        num = input.nextInt();

        for (int i = 1; i <= num; i++) { // Loop process for the top half of the diamond
            for (int j = i; j < num; j++) { // Printing the spaces to make the triangle symmetrical
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) { // Printing the arterisks
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = num; i >= 1; i--) { // Loop process for the bottom half of the diamond
            for (int j = num; j > i; j--) { // Printing the spaces to make the triangle symmetrical
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) { // Printing the arterisks
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}