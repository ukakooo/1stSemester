import java.util.Scanner;
public class ArrayValue16 {
    public static void main(String[] args) {
        Scanner skibidiSigma = new Scanner(System.in);

        //Creating an array
        int[] finalScore = new int[10];

        //Input elemenets in the array
        // for (int i = 0; i < 10; i++) {
        //     System.out.print("Enter the final score " + i + ": ");
        //     finalScore[i] = skibidiSigma.nextInt();
        // }

        //Modified Step 5
        for (int i = 0; i < finalScore.length; i++) {
            System.out.print("Enter the final score " + i + ": ");
            finalScore[i] = skibidiSigma.nextInt();
        }

        //Print all elements from the array
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Final score " + i + " is " + finalScore[i]);
        // }

        //Modified Step 6
        for (int i = 0; i < finalScore.length; i++) {
            if (finalScore[i] > 70) { //Adds a condition if the final score element is more than 70, then prints that the student is passed
                System.out.println("Student " + i + " Passed!");
            } else {// Adds a condition if the final score is 70 or less
                System.out.println("Student " + i + " Failed!");
            }
        }
        skibidiSigma.close();
    } 
}
