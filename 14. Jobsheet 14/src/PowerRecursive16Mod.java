import java.util.Scanner;

public class PowerRecursive16Mod {
    static String calculationSeries = "";

    static int calculatePower(int base, int pow) {
        if (pow == 0) {
            calculationSeries += "1"; // Append "1" at the end for the base case.
            return 1;
        } else {
            calculationSeries += base + "x"; // Append the base and "x" to the series.
            return base * calculatePower(base, pow - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input base number: ");
        int base = input.nextInt();
        System.out.print("Input Power Number: ");
        int power = input.nextInt();

        int result = calculatePower(base, power); // Make a separate variable just for the result for the power
                                                  // calculation.

        System.out.println("Result of " + base + " power " + power + " = " +
                result); // Prints the result using a variable this time

        System.out.println("The Calculation series is: " + calculationSeries + " = " + result);
    }
}
