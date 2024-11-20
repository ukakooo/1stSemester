import java.util.Scanner;
/**
 * JTICafe16
 */
public class JTICafe16 {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price, totalprice, disc;

        System.out.println("-----------------------");
        System.out.println("==== JTI CAFE MENU ====");
        System.out.println("-----------------------");
        System.err.println("1. Ricebowl");
        System.out.println("2. Ice tea");
        System.out.println("3. Bundling Package (Ricebowl + Ice Tea)");
        System.out.println("----------------------------------------");
        System.out.print("Input a value from the choosen menu = ");
        int choosenMenu = sc.nextInt();
        sc.nextLine();
        System.out.print("Are you a member? (y/n) = ");
        String member = sc.nextLine();
        System.out.print("Are you paying using QRIS? (y/n) = ");
        String qris = sc.nextLine();
        System.out.println("----------------------------------------");

        if (member.equalsIgnoreCase("y")) {
        disc = 0.10;
        System.out.println("Discount = 10%");
        if (choosenMenu == 1) {
            price = 14000;
            System.out.println("Ricebowl price = Rp. " + price);
        } else if (choosenMenu == 2) {
            price = 3000;
            System.out.println("Ice tea price = Rp. " + price);
        } else if (choosenMenu == 3) {
            price = 15000;
            System.out.println("Bundling price = Rp. " + price);
        } else {
            System.out.println("Input the correct menu");
            return;
        }
        if (qris.equalsIgnoreCase("y")) {
            double qrisdisc;
            qrisdisc = 1000;
            totalprice = price - (price * disc);
            totalprice -= qrisdisc;
            System.out.println("Total price after discount is = Rp. " + totalprice);
        } else if (qris.equalsIgnoreCase("n")) {
            totalprice = price - (price * disc);
            System.out.println("Total price after discount is = Rp. " + totalprice);
        } else
        System.out.println("Payment method invalid");  
        return; 

        
                
        }
        else if (member.equalsIgnoreCase("n")) {
            System.out.println("Discount = 10%");
            if (choosenMenu == 1) {
                price = 14000;
                System.out.println("Ricebowl price = Rp. " + price);
            } else if (choosenMenu == 2) {
                price = 3000;
                System.out.println("Ice tea price = Rp. " + price);
            } else if (choosenMenu == 3) {
                price = 15000;
                System.out.println("Bundling price = Rp. " + price);
            } else {
                System.out.println("Input the correct menu");
                return;
            } if (qris.equalsIgnoreCase("y")) {
            double qrisdisc;
            qrisdisc = 1000;
            price -= qrisdisc;
            System.out.println("Total price after discount is = Rp. " + price);
        } else if (qris.equalsIgnoreCase("n")) {
            System.out.println("Total price after discount is = Rp. " + price);
        } else
        System.out.println("Payment method invalid");  
        return; 
            

    } else {
        System.out.println("Member not valid");
    }
        
     
} 
}