import java.util.Scanner;
/**
 * SIAKAD16
 */
public class SIAKAD16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        String name = sc.nextLine();
        System.out.print("Input NIM: ");
        long nim = sc.nextLong();
        System.out.print("Input class: ");
        char clas = sc.next().charAt(0);
        System.out.print("Input ID number: ");
        int idNum = sc.nextInt();
        System.out.print("Input quiz score: ");
        double quizScore = sc.nextDouble();
        System.out.print("Input assignment score: ");
        double assignmentScore= sc.nextDouble();
        System.out.print("Input exam score: ");
        double examScore = sc.nextDouble();

        double finalGrade = (quizScore + assignmentScore + examScore) / 3;

        String alphabetic, qualification;
        if (finalGrade > 80 && finalGrade <= 100) {
            alphabetic = "A";
            qualification = "Very good";
        }
        else if (finalGrade > 73 && finalGrade <= 80) {
            alphabetic = "B+";
            qualification = "More than good";
        }
        else if (finalGrade > 65 && finalGrade <= 73) {
            alphabetic = "B";
            qualification = "Good";
        }
        else if (finalGrade > 60 && finalGrade <= 65) {
            alphabetic = "C+";
            qualification = "More than enough";
        }
        else if (finalGrade > 50 && finalGrade <= 60) {
            alphabetic = "C";
            qualification = "Enough";
        }
        else if (finalGrade > 39 && finalGrade <= 50) {
            alphabetic = "D";
            qualification = "Not enough";
        }
        else if (finalGrade <= 39) {
            alphabetic = "E";
            qualification = "Failed";
        }
        else{
            alphabetic = "invalid";
            qualification = "invalid";
        }
        
        System.out.println("A student named "+name+ " (NIM "+nim+") in class "+clas+" with an ID number "+idNum+"");
        System.out.println("Final grade: "+ finalGrade);
        System.out.println("The alphabetic grade is: "+ alphabetic);
        System.out.println("The qualification is: "+ qualification);
        
sc.close();
    }
}