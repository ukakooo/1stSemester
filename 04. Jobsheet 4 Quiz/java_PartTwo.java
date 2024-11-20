import java.util.Scanner;
/**
 * java_PartTwo
 */
public class java_PartTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;

        //Giving inputs
        System.out.print("Please input the temperature in F: ");
                fahrenheit = sc.nextDouble();
        System.out.println("-------------------");

        //Operation

        double step1 = (fahrenheit - 32) * 5/9f;
        double Kelvin = step1 + 273.15;

        System.out.println("The temperature in Kelvin is " + Kelvin + " K");







    }
}