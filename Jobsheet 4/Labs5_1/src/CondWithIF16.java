import java.util.Scanner;
/**
 * CondWithIF16
 */
public class CondWithIF16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input day value: ");
        int day = sc.nextInt();

        if (day <= 5 && day >= 1){
            System.out.println("The day is Weekday");
        }
        else if (day <= 7 && day >= 6) {
            System.out.println("The day is Weekend");    
        } 
        else {
            System.out.println("Day input is invalid");
        }
           
        
sc.close();
    }
}