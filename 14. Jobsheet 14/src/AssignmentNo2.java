import java.util.Scanner;

public class AssignmentNo2 {
    public static void main(String[] args) {
        Scanner sigmaSkibidi = new Scanner(System.in);
        System.out.print("Enter a number (n) to be displayed until 0: ");
        int n = sigmaSkibidi.nextInt();
        descendingSequenceRecursive(n);
    }

    public static void descendingSequenceRecursive (int n) {
        if (n < 0) { //If this condition is met, the function will stop.
            return;
        }
        System.out.print(n + " "); //Prints the n variable
        descendingSequenceRecursive(n - 1); //Calls the function itself and decrement it until n reaches 0.
    }
}