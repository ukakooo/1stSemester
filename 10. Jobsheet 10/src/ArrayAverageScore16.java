import java.util.Scanner;

public class ArrayAverageScore16 {
    public static void main(String[] args) {
        Scanner sigmaSkibidi = new Scanner(System.in);

        // Declare arrays
        int[] score = new int[5];
        // double total = 0;
        // double average;
        double averagePassed, averageFailed;
        double totalPassed = 0, totalFailed = 0;
        int countPassed = 0, countFailed = 0;

        // Input elements onto the array
        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student final score " + i + ": ");
            score[i] = sigmaSkibidi.nextInt();
        }

        // Calculate the total value of the passed scores
        for (int i = 0; i < score.length; i++) {
            if (score[i] > 70) { // Adds an if else command if the score is more than 70, and vice versa
                totalPassed += score[i]; // Total the whole passed score elements and saved it to the totalPassed
                                         // variable
                countPassed++; // Increase the count of the passed scores
            } else {
                totalFailed += score[i]; // Total the whole failed score elements and saved it to the totalFailed
                                         // variable
                countFailed++; // Increase the count of the failed scores
            }
        }

        // Calculate the average of both passed and failed values
        averagePassed = totalPassed / countPassed; // Count the average of the passed scores
        averageFailed = totalFailed / countFailed; // Count the average of the failed scores
        System.out.println("The average score of students who passed is " + averagePassed); // Display the average score
                                                                                            // of the passed students
        System.out.println("The average score of students who failed is " + averageFailed); // Display the average score
                                                                                            // of the failed students

        // // Input elements onto the array
        // for (int i = 0; i < score.length; i++) {
        // System.out.print("Enter student score " + (i + 1) + ": ");
        // score[i] = sigmaSkibidi.nextInt();
        // }

        // // Loop command to display the scores that passed
        // for (int i = 0; i < score.length; i++) {
        // if (score[i] > 70) { // Adds an if else command to check if each element
        // inside the array are more
        // // than 70. If true, then print if the student is passed and vice versa
        // System.out.println("The student " + (i + 1) + " has passed!");
        // } else {
        // System.out.println("The student " + (i + 1) + " has failed.");
        // }
        // }

        // // Loop command to calculate the total number of scores
        // for (int i = 0; i < score.length; i++) {
        // total += score[i];
        // }

        // // Calculate the average value of the scores
        // average = total / score.length;
        // System.out.println("The class average score is " + average);

        sigmaSkibidi.close();
    }
}
