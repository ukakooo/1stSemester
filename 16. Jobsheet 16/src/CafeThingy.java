import java.util.Scanner;
import java.util.ArrayList;

public class CafeThingy {

    //Declare ArrayLists for the menu lists
    static ArrayList<String> menuList = new ArrayList<>();
    static ArrayList<Integer> prices = new ArrayList<>();

    //Declare ArrayLists for the Customer's data
    static ArrayList<String> customerName = new ArrayList<>();
    static ArrayList<Integer> tableNum = new ArrayList<>();
    static ArrayList<Integer> totalPrice = new ArrayList<>();
    static ArrayList<ArrayList<String>> orders = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> quantities = new ArrayList<>();

    public static void main(String[] args) {

        //Input the menu datas such as the item names and the prices
        menuList.add("Kopi Hitam");
        menuList.add("Latte");
        menuList.add("Teh Tarik");
        menuList.add("Mie Goreng");

        prices.add(15000);
        prices.add(22000);
        prices.add(12000);
        prices.add(18000);

        Scanner sigmaSkibidi = new Scanner(System.in);

        while (true) {

            //Display the whole menu
            System.out.println("\n==== MENU UTAMA ====");
            System.out.println("1. Tambahkan Pesanan");
            System.out.println("2. Tampilkan Daftar Pesanan");
            System.out.println("3. Keluar");

            System.out.print("Pilih menu (masukkan nomor menu): ");
            int choice = sigmaSkibidi.nextInt();
            sigmaSkibidi.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    tambahPesanan(sigmaSkibidi);
                    break;
                case 2:
                    tampilkanPesanan();
                    break;
                case 3:
                    System.out.println("Sedang keluar dari program. Terima Kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang valid!");
                    break;
            }
        }
    }

    static void tambahPesanan(Scanner sigmaSkibidi) {
        
        //Input customer's simple name and table number
        System.out.print("Masukkan nama pelanggan: ");
        String name = sigmaSkibidi.nextLine();
        System.out.print("Masukkan nomor meja: ");
        int tableNo = sigmaSkibidi.nextInt();
        sigmaSkibidi.nextLine();

        //Declare ArrayLists for the current customer's order
        ArrayList<String> currentOrder = new ArrayList<>();
        ArrayList<Integer> currentQuantities = new ArrayList<>();
        int totalOrderPrice = 0; //Declare the total order price variable and initialize the value

        //Prints the whole menu lists
        System.out.println("\n==== MENU KAFE ====");
        for (int i = 0; i < menuList.size(); i++) {
            System.out.printf("%d. %s - Rp %d%n", i + 1, menuList.get(i), prices.get(i));
        }

        //Loops the menu input process until the user inputs 0 as a choice
        while (true) {
            System.out.print("\nPilih menu (masukkan nomor menu, atau 0 untuk selesai): ");
            int menuChoice = sigmaSkibidi.nextInt();

            if (menuChoice == 0) {
                break;
            }

            if (menuChoice < 1 || menuChoice > menuList.size()) {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                continue;
            }

            System.out.print("Masukkan jumlah item untuk " + menuList.get(menuChoice - 1) + ": ");
            int quantity = sigmaSkibidi.nextInt();

            if (quantity <= 0) {
                System.out.println("Jumlah item harus lebih dari 0. Silakan coba lagi.");
                continue;
            }

            //Saves the current order and quantities each loop and totals the order prices
            currentOrder.add(menuList.get(menuChoice - 1));
            currentQuantities.add(quantity);
            totalOrderPrice += prices.get(menuChoice - 1) * quantity;
        }

        //Saves customer's input for the name, table number, orders, quantities and the total price
        customerName.add(name);
        tableNum.add(tableNo);
        orders.add(currentOrder); //Saves the current orders and the current quantities into the 2D ArrayLists for each
        quantities.add(currentQuantities);
        totalPrice.add(totalOrderPrice); //Saves the total order prices

        System.out.println("Pesanan berhasil ditambahkan.");
        System.out.println("Total harga pesanan: Rp " + totalOrderPrice);
    }

    static void tampilkanPesanan() {
        if (customerName.isEmpty()) {
            System.out.println("Belum ada pesanan yang tercatat.");
            return;
        }

        System.out.println("\n==== DAFTAR PESANAN ====");

        //Loops the whole process of displaying all customer's menu
        for (int i = 0; i < customerName.size(); i++) {
            System.out.println("\nNama Pelanggan: " + customerName.get(i));
            System.out.println("Nomor Meja: " + tableNum.get(i));
            System.out.println("Detail Pesanan:");

            //Declare the customer's ArrayLists
            ArrayList<String> currentOrder = orders.get(i);
            ArrayList<Integer> currentQuantities = quantities.get(i);

            for (int j = 0; j < currentOrder.size(); j++) { //Loops the process to display the customer's menu
                //Declare separate variables to be displayed so it's readable in the printf prompt
                String menuItem = currentOrder.get(j); //This also intended to be used as an index to get the menu price
                int quantity = currentQuantities.get(j);
                int menuPrice = prices.get(menuList.indexOf(menuItem)); //Prints the menu price by using the index of the input of menu item
                System.out.printf("- %s x %d = Rp %d%n", menuItem, quantity, menuPrice * quantity);
            }

            System.out.println("Total Harga Pesanan: Rp " + totalPrice.get(i));
        }
    }
}