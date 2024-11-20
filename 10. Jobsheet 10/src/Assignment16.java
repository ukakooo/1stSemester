import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        Scanner sigmaSkibidi = new Scanner(System.in);

        // Declare variables and arrays
        int elementsCount;
        double average;
        double total = 0;

        // Prompt the user to input the elements into the array
        System.out.print("Enter the number of array elements: "); // Ask the user to input the number of array elements
        elementsCount = sigmaSkibidi.nextInt();

        // Declare the array
        int[] numbers = new int[elementsCount];

        // Input elements onto the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the integer " + i + ": ");
            numbers[i] = sigmaSkibidi.nextInt();
        }

        // Initialize highest, lowest
        int highest = numbers[0];
        int lowest = numbers[0];

        // Loop process that checks the elements one by one
        for (int num : numbers) { // Creates a loop process where it iterates over each element in the numbers
                                  // array sequentially
            if (num > highest) { // Checks if the current element is greater than highest, update highest
                highest = num;
            }
            if (num < lowest) { // Checks if the current element is greater than lowest, update lowest
                lowest = num;
            }
            total += num; // Totals the whole numbers
        }

        // Calculate the average
        average = total / elementsCount;

        // Print out the results
        System.out.println("The highest value is: " + highest);
        System.out.println("The lowest value is: " + lowest);
        System.out.println("The average value is: " + average);

        sigmaSkibidi.close();
    }
}
