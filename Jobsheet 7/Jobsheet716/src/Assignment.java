import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare Variables
        int numInput;
        String s;

        // Input
        System.out.print("Input some number: ");
        numInput = input.nextInt();

        // Operation
        for (int i = numInput; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                s = "* ";
                System.out.print(s);
            }
            System.out.println();
        }
        input.close();
    }
}
