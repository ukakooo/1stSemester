import java.util.Scanner;
/**
 * JTICafe16
 */
public class JTICafe16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String menu;
        char cupSize;
        int amount;
        boolean membership;

        
        System.out.print("Enter the menu: ");
        menu = sc.nextLine();

        System.out.print("Enter the cup size: ");
        cupSize = sc.next().charAt(0);

        System.out.print("Enter the amount of item: ");
        amount = sc.nextInt();

        System.out.print("Is the customer our member? (true/false): ");
        membership = sc.nextBoolean();

        double itemPrice = 0;

        switch (menu.toLowerCase()) {
            case "coffee":
                itemPrice = 12000;
                break;
            case "tea":
                itemPrice = 7000;
            case "chocolate":
                itemPrice = 20000;
        }
        
        double totalPrice = itemPrice * amount;

        switch (cupSize) {
            case 'S':
                break;
            case 'M':
                totalPrice += 0.25 * totalPrice;
                break;
            case 'L':
                totalPrice += 0.4 * totalPrice;
                break;
            default:
                System.out.println("Invalid cup size");
                System.exit(0);
                
        }
        double discount = membership ? 0.1 : 0;
        double grandTotal = totalPrice - (discount * totalPrice);

        System.out.println("Purchased item: "+amount+ " "+menu+ " cup size " +cupSize);
        System.out.println("Grand Total: "+grandTotal);

        sc.close();
    }
}