import java.util.Scanner;

public class LinearSearch16 {
    public static void main(String[] args) {
        Scanner sigmaSkibidi = new Scanner(System.in);

        int elementsCount; // Declare the variable for the elements count
        System.out.print("Enter the number of array elements: "); // Ask the user to input the number of array elements
        elementsCount = sigmaSkibidi.nextInt();

        // Declare Variables
        int[] arrayInt = new int[elementsCount]; // Declare an array and the number of the array elements based on the
                                                 // input that was given by the user
        int key = 0;
        int result = 0;
        boolean isFound = false; // A boolean variable to check whether the key is found or not

        for (int i = 0; i < arrayInt.length; i++) { // A loop process to ask the user to input the array elements into
                                                    // the array
            System.out.print("Enter the array element " + i + ": ");
            arrayInt[i] = sigmaSkibidi.nextInt();
        }
        System.out.print("Enter the key you want to search for: "); // A print command to ask the user to enter the key
                                                                    // input the user want to search for
        key = sigmaSkibidi.nextInt();

        for (int i = 0; i < arrayInt.length; i++) { // A loop process to check one by one for the key that the user want
                                                    // to search for
            if (arrayInt[i] == key) { // A condition to check if the i is equals the key that the user was searching
                                      // for
                result = i; // A syntax to input the key that was found into the result variable to be
                            // printed out later
                System.out.println("The key in the array is located at index position " + result); // Display the result
                                                                                                   // of the key that
                                                                                                   // the user wanted to
                                                                                                   // find
                isFound = true; //Mark the isFound variable to be true since we found the key
                break; // A syntax to stop the loop process altogether if the condition is checked
            }
        }
            if (!isFound) {
                System.out.println("Key not found.");
            }

        sigmaSkibidi.close();

        // int[] arrayInt = { 34, 18, 26, 48, 72, 20, 56, 63 };

        // int key = 20;
        // int result = 0;

        // for (int i = 0; i < arrayInt.length; i++) {
        // if (arrayInt[i] == key) {
        // result = i;
        // break;
        // }
        // }
    }
}
