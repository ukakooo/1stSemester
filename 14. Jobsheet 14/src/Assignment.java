import java.util.Scanner;

public class Assignment {
    static int[][] grades = new int[5][7]; //Declare an array for the students's grades
    static String[] students = {"Sari", "Rina", "Yani", "Dwi", "Lusi"}; //Declare the students's names
    public static void main(String[] args) {
        Scanner sigmaSkibidi = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input Grades");
            System.out.println("2. Display Grades");
            System.out.println("3. Find week with the highest grade");
            System.out.println("4. Find student with the highest grade");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sigmaSkibidi.nextInt();
            sigmaSkibidi.nextLine();

            switch (choice) {
                case 1:
                    inputGrades();
                    break;
                
                case 2:
                    displayGrades();
                    break;
                
                case 3:
                    findWeekHighestGrade();
                    break;

                case 4:
                    findStudentHighestGrade();
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    return;
                
                default:
                    System.out.println();
                    break;
            }
        }
    }

    public static void inputGrades() {
        Scanner gradesScanner = new Scanner(System.in);
        System.out.println("Enter the grades for each student.");

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter the grade for student " + students[i]);
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print("Week " + (j+1) + ": ");
                grades[i][j] = gradesScanner.nextInt();
            }
        }
    }

    public static void displayGrades() {
        System.out.print("Student ");
            for (int i = 0; i < grades[1].length; i++) {
                System.out.print("Week  " + (i + 1) + "\t");
            }
            System.out.println();

            for (int i = 0; i < students.length; i++) {
                System.out.print(students[i] + "\t");
                for (int j = 0; j < grades[i].length; j++) {
                    System.out.print(grades[i][j] + "\t");
                }
                System.out.println();
            }
       
    }
    
    public static void findWeekHighestGrade() {
        int maxGrade = 0;
        int weekWithMaxGrade = -1;

        for (int i = 0; i < grades[1].length; i++) {
            for (int j = 0; j < students.length; j++) {
                if (grades[j][i] > maxGrade) {
                    maxGrade = grades[j][i];
                    weekWithMaxGrade = i + 1;
                }
            }
        }
        System.out.println("The week with the highest grade is Week " + weekWithMaxGrade + " With the grade of " + maxGrade);
    }
    public static void findStudentHighestGrade() {
        int maxGrade = 0;
        int studentWithMaxGrade = -1;

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                if (grades[i][j] > maxGrade) {
                    maxGrade = grades[i][j];
                    studentWithMaxGrade = i;
                }
            }
        }
        System.out.println("The student with the highest grade is " + students[studentWithMaxGrade] + " with a grade of " + maxGrade);
        System.out.println("Grades for " + students[studentWithMaxGrade] + ":");
        for (int i = 0; i < grades[1].length; i++) {
            System.out.println("Week " + (i + 1) + ": " + grades[studentWithMaxGrade][i]);
        }
    }
}
