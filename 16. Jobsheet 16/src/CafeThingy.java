import java.util.Scanner;
import java.util.ArrayList;

public class CafeThingy {
    static ArrayList<String> menuList = new ArrayList<>();
    static ArrayList<Integer> prices = new ArrayList<>();
    static ArrayList<String> customerName = new ArrayList<>();
    static ArrayList<Integer> tableNum = new ArrayList<>();
    static ArrayList<Integer> totalPrice = new ArrayList<>();
    static ArrayList<ArrayList<String>> orders = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> quantities = new ArrayList<>();

    public static void main(String[] args) {

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
        System.out.print("Masukkan nama pelanggan: ");
        String name = sigmaSkibidi.nextLine();
        System.out.print("Masukkan nomor meja: ");
        int tableNo = sigmaSkibidi.nextInt();
        sigmaSkibidi.nextLine();

        ArrayList<String> currentOrder = new ArrayList<>();
        ArrayList<Integer> currentQuantities = new ArrayList<>();
        int totalOrderPrice = 0;

        System.out.println("\n==== MENU KAFE ====");
        for (int i = 0; i < menuList.size(); i++) {
            System.out.printf("%d. %s - Rp %d%n", i + 1, menuList.get(i), prices.get(i));
        }

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

            currentOrder.add(menuList.get(menuChoice - 1));
            currentQuantities.add(quantity);
            totalOrderPrice += prices.get(menuChoice - 1) * quantity;
        }

        customerName.add(name);
        tableNum.add(tableNo);
        orders.add(currentOrder);
        quantities.add(currentQuantities);
        totalPrice.add(totalOrderPrice);

        System.out.println("Pesanan berhasil ditambahkan.");
        System.out.println("Total harga pesanan: Rp " + totalOrderPrice);
    }

    static void tampilkanPesanan() {
        if (customerName.isEmpty()) {
            System.out.println("Belum ada pesanan yang tercatat.");
            return;
        }

        System.out.println("\n==== DAFTAR PESANAN ====");

        for (int i = 0; i < customerName.size(); i++) {
            System.out.println("\nNama Pelanggan: " + customerName.get(i));
            System.out.println("Nomor Meja: " + tableNum.get(i));
            System.out.println("Detail Pesanan:");

            ArrayList<String> currentOrder = orders.get(i);
            ArrayList<Integer> currentQuantities = quantities.get(i);

            for (int j = 0; j < currentOrder.size(); j++) {
                String menuItem = currentOrder.get(j);
                int quantity = currentQuantities.get(j);
                int menuPrice = prices.get(menuList.indexOf(menuItem));
                System.out.printf("- %s x %d = Rp %d%n", menuItem, quantity, menuPrice * quantity);
            }

            System.out.println("Total Harga Pesanan: Rp " + totalPrice.get(i));
        }
    }
}
