import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables
        int numInput;
        // Input
        System.out.print("Input some number: ");
        numInput = input.nextInt();

        // Operation
        for (int i = 1; i <= numInput; i++) {
            for (int j = numInput - i; j > 0; j--) {//Printing the spaces to make the triangle symmetrical
                System.out.print(" ");
            }
            int num = 1; //Printing the pascal triangle
            for (int k = 0; k <= i; k++) {
                System.out.print(num + " ");
                num = num * (i - k) / (k + 1);
            }
            System.out.println();
        }
        input.close();
    }
}
