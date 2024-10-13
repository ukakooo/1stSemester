import java.util.Scanner;

public class DoWhileLeaveEntitlement16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare Variables
        int leaveEntitlement, numLeave;
        String confirmation;

        // Input Leave Entitlement
        System.out.print("Input the number of Leave Entitlement: ");
        leaveEntitlement = input.nextInt();

        // Operation
        do {
            System.out.print("Do you want to take a leave (y/n)?: ");
            confirmation = input.next();

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("How many day(s)?: ");
                numLeave = input.nextInt();

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave entitlement: " + leaveEntitlement);
                } else {
                    System.out.println("You don't have enough leave entitlement");

                }
            } else {
                System.out.println("Input Invalid, please enter the right Input");
                break;
            }
        } while (leaveEntitlement > 0);
        
        input.close();
    }

}
