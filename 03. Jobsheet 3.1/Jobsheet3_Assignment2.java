import java.util.Scanner;
/**
 * Jobsheet3_Assignment2
 */
public class Jobsheet3_Assignment2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numeric_grades;        

        System.out.print("Input Numeric Grade: ");
        numeric_grades = sc.nextDouble();

        if (numeric_grades > 80 && numeric_grades <= 100) {
            System.out.println("The alphabetic grade is A");
        }
        if (numeric_grades > 73 && numeric_grades <= 80) {
            System.out.println("The alphabetic grade is B+");
        }
        if (numeric_grades > 65 && numeric_grades <= 73) {
            System.out.println("The alphabetic grade is B");
        }
        if (numeric_grades > 60 && numeric_grades <= 65) {
            System.out.println("The alphabetic grade is C+");
        }
        if (numeric_grades > 50 && numeric_grades <= 60) {
            System.out.println("The alphabetic grade is C");
        }
        if (numeric_grades > 39 && numeric_grades <= 50) {
            System.out.println("The alphabetic grade is D");
        }
        if (numeric_grades <= 39) {
            System.out.println("The alphabetic grade is E");
        }



    }
}