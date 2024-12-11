import java.util.ArrayList;
import java.util.Scanner;

class Course {
    String course1;
    String courseName;
    int sks;

    public Course(String course1, String courseName, int sks) {
        this.course1 = course1;
        this.courseName = courseName;
        this.sks = sks;
    }
}

class KRS {
    String studentJeneng;
    String nim;
    ArrayList<Course> courses = new ArrayList<>();

    public int totalSKS() {
        int total = 0;
        for (Course course : courses) {
            total += course.sks;
        }
        return total;
    }
}

public class KRSMonitoring {
    static ArrayList<KRS> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sigmaSkibidi = new Scanner(System.in);

        while (true) {
            System.out.println("\n\n=== Student KRS Monitoring System ===");
            System.out.println("1. Add KRS Data");
            System.out.println("2. Display Student KRS");
            System.out.println("3. Analyze KRS Data");
            System.out.println("4. Exit");
            System.out.print("Choose your menu: ");
            int choice = sigmaSkibidi.nextInt();
            sigmaSkibidi.nextLine();

            switch (choice) {
                case 1:
                    addKRS();
                    break;
                case 2:
                    displayKRS();
                    break;
                case 3:
                    analisaKRS();
                    break;
                case 4:
                    programExit();
                    return;
                default:
                    break;
            }
        }
    }


    public static void addKRS() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Add KRS Data ---");
        System.out.print("Student Name: ");
        String studengJeneng = scanner.nextLine();
        System.out.println("NIM: ");
        String nim = scanner.nextLine();

        KRS studentKRS = new KRS();
        studentKRS.studentJeneng = studengJeneng;
        studentKRS.nim = nim;

        int totalSKS = 0;
        String addMore = "";

        do {
            System.out.print("Subject Code: ");
            String course1 = scanner.nextLine();
            System.out.print("Subject Name: ");
            String courseName = scanner.nextLine();
            System.out.print("SKS Total (1-3): ");
            int sks = scanner.nextInt();
            scanner.nextLine();

            if (sks < 1 || sks > 3) {
                System.out.println("SKS Total is not valid! Must be between 1 and 3.");
                continue;
            }

            if (totalSKS + sks > 24) {
                System.out.println("SKS Total is exceeding the maximum of 24!");
                break;
            }
            
            studentKRS.courses.add(new Course(course1, courseName, sks));
            totalSKS += sks;

            System.out.println("Subject data completely added!");
            System.out.print("Add another subject? (y/n: )");
            addMore = scanner.nextLine();
        } while (addMore.equalsIgnoreCase("y"));

        students.add(studentKRS);
    }

    public static void displayKRS() {
        Scanner nimScanner = new Scanner(System.in);
        System.out.println("\n--- Display Students KRS Data List ---");
        System.out.print("\nMasukkan NIM Mahasiswa: ");
        String nim = nimScanner.nextLine();

        for (KRS student : students) {
            if (student.nim.equals(nim)) {
                System.out.println("\nDaftar KRS:");
                System.out.println("NIM       Nama          Kode MK    Nama Mata Kuliah        SKS");
                System.out.println("                                                            ");
                for (Course course : student.courses) {
                    System.out.printf("%-10s %-12s %-8s %-25s %d\n",
                            student.nim, student.studentJeneng, course.course1, course.courseName, course.sks);
                }
                System.out.println("Total SKS: " + student.totalSKS());
                return;
            }
        }
        System.out.print("");
    }

    public static void analisaKRS() {
        int count = 0;

        System.out.println("\n--- KRST Data Analysis ---");

        for (KRS student : students) {
            if (student.totalSKS() < 20) {
                count++;
            }
        }

        System.out.println("The total students that took SKS less than 20 is: " + count);
    }

    static void programExit() {
        System.out.print("Thank you!");
    }
}