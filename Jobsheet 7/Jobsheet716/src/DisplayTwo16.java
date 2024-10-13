import java.util.Scanner;
public class DisplayTwo16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declare Variables
        int numInput;

        //Input for variables
        System.out.print("Input some number: ");
        numInput = input.nextInt();

        //Operation
        for (int i = 2; i <= numInput; i+= 2) {
            System.out.print(i+" ");
        }
        input.close();
    }
}
