import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables
        int numInput;

        // Input
        System.out.print("Input some number: ");
        numInput = input.nextInt();

        for (int i = 0; i < numInput; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
        input.close();
    }
}
