import java.util.Scanner;

public class WhileMultiples16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare Variables
        int multiple, sum, counter;
        sum = 0;
        counter = 0;
        double average = 0;
        int i = 1;

        // Input Variables
        System.out.print("Input the multiple: ");
        multiple = input.nextInt();

        while (i <= 50) {
            if (i % multiple == 0) {
                sum = sum + i;
                counter++;
                average = (double) sum / counter;
            }
            i++;
        }

        System.out.printf("There are %d number that are multiple of %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum of all multiples of %d in range 1 to 50 is %d.   \n", multiple, sum);
        System.out.println("The average of all the specified multiples is " + average);

        input.close();
    }
}