import java.util.Scanner;

public class Case1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables
        int numInput;
        int i = 0;
        String s = "";

        // Input
        System.out.print("Input some number: ");
        numInput = input.nextInt();

        for (s = ""; i < numInput; i++) {
            s += " *";
            System.out.println(s);

        }
        input.close();
    }
}
