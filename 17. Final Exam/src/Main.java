import java.util.Scanner;

public class Main {
    static String[] titles = { "Harry Potter", "Lord of The Ring", "The Alchemist", "Sherlock Holmes" };
    static String[] isbn = { "978-3-16-148410-0", "978-1-843-56710-2", "978-0-06-231500-7", "978-1-566-19310-3" };
    static boolean[] isAvailable = { true, true, true, true };

    public static void main(String[] args) {
        Scanner sigmaSkibidi = new Scanner(System.in);

        System.out.println("\n==== Welcome to the Polinema Library! Please select the menu below! ====");

        mainMenu(sigmaSkibidi);
    }

    public static void mainMenu(Scanner sigmaSkibidi) {
        while (true) {
            System.out.println("\n1. Display Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Please choose the showed menu: ");
            int choice = sigmaSkibidi.nextInt();
            sigmaSkibidi.nextLine();

            switch (choice) {
                case 1:
                    displayBook();
                    break;
                case 2:
                    borrowBook(sigmaSkibidi);
                    break;
                case 3:
                    returnBook(sigmaSkibidi);
                    break;
                case 4:
                    System.out.println("Exiting program. Please wait a moment.....");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang valid!");
                    break;
            }
        }
    }

    public static void displayBook() {
        System.out.println("\nIndex \t Title \t \t\t   ISBN \t\t Availability");
        for (int i = 0; i < titles.length; i++) {
            System.out.printf("%d.\t%17s \t%20s \t ", i + 1, titles[i], isbn[i]);

            if (isAvailable[i] == false) {
                System.out.println("Borrowed");
            } else if (isAvailable[i] == true) {
                System.out.println("Available");
            }
        }
    }

    public static void borrowBook(Scanner sigmaSkibidi) {
        System.out.print("Please select the book you want to borrow: ");
        int borrowChoice = sigmaSkibidi.nextInt();

        if (isAvailable[borrowChoice - 1] == false && borrowChoice < titles.length) {
            System.out.println("The book is currently borrowed, please choose another book.");
        } else if (isAvailable[borrowChoice - 1] == true && borrowChoice < titles.length) {
            System.out.println("Book titled " + titles[borrowChoice - 1] + " with the ISBN " + isbn[borrowChoice - 1]
                    + " borrowed successfully! Please return it on time.");
            isAvailable[borrowChoice - 1] = false;
        } else {
            System.out.println("Invalid input, please input the correct value.");
        }
    }

    public static void returnBook(Scanner sigmaSkibidi) {
        System.out.print("Please select the book you want to return: ");
        int returnChoice = sigmaSkibidi.nextInt();

        if (isAvailable[returnChoice - 1] == false && returnChoice < titles.length) {
            System.out.println(
                    "Book titled " + titles[returnChoice - 1] + " with the ISBN " + isbn[returnChoice - 1]
                            + " returned successfully! Thank you!");
            isAvailable[returnChoice - 1] = true;
        } else if (isAvailable[returnChoice - 1] == true && returnChoice < titles.length) {
            System.out.println("You have not borrowed this book yet.");
        } else {
            System.out.println("Invalid input, please input the correct value.");
        }
    }
}