import java.util.Scanner;

public class ForMultiples16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare Variables
        int multiple, sum, counter;
        sum = 0;
        counter = 0;
        double average = 0;

        // Input Variables
        System.out.print("Input the multiple: ");
        multiple = input.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % multiple == 0) {
                sum = sum + i;
                counter++;
                average = (double) sum / counter;
            }
        }
        
        System.out.printf("There are %d number that are multiple of %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum of all multiples of %d in range 1 to 50 is %d.   \n", multiple, sum);
        System.out.println("The average of all the specified multiples is " + average);

        input.close();
    }
}