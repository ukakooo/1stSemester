import java.util.Scanner;

public class AssignmentNo3 {
    public static void main(String[] args) {
        Scanner sigmaSKibidi = new Scanner(System.in);
        System.out.print("Enter the value of n to be summed: ");
        int n = sigmaSKibidi.nextInt();
        System.out.println("The Summation result of n = " + n + " is: " + summationRecursive(n));

    }

    public static int summationRecursive(int n) {
        if (n < 0) {
            return 0;
        }
        return n + summationRecursive(n - 1);
    }
}
