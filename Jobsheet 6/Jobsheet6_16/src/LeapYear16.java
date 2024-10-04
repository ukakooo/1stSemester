import java.util.Scanner;
/**
 * LeapYear16
 */
public class LeapYear16 {

    public static void main(String[] args) {
        Scanner inputYear = new Scanner(System.in);

        System.out.print("Input year value: ");
        int year = inputYear.nextInt();
        
        //Operation
        if ((year % 4) ==0) {
            if ((year % 100) == 0) {
                System.out.println("Leap year");
                if ((year % 400) == 0) {
                    System.out.println("Leap year");
                } else 
                System.out.println("Not a leap year");
            } else 
            System.out.println("Not a leap year");
        } else
            System.out.println("Not a leap year");

        inputYear.close();
    }
}