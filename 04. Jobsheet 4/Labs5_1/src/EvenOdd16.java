import java.util.Scanner;
/**
 * EvenOdd16
 */
public class EvenOdd16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input an integer number: ");
        int number = sc.nextInt();

        if (number % 2 == 0 && number != 0) {
            System.out.println("The "+number+" is even number");
        } else if (number == 0) {
            System.out.println("The "+number+" is an undefined number");
        }
        else {
            System.out.println("The "+number+" is odd number");
        }
        sc.close();
    }
//        String even_odd = (number % 2 == 0) ? "The "+number+" is an even number" : ("The "+number+" is an odd number");
//        System.out.println(even_odd);
//        sc.close();
//    }
}
