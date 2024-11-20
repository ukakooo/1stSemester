/**
 * java_PartOne
 */
public class java_PartOne {

    public static void main(String[] args) {

        //Variables
        double t_shirt = 300000.00, kidssock = 150000.00, cap = 200000.00, purp_jacket = 350000.00, jogger = 500000.00, blazer = 800000.00, jeans = 1200000.00;

        //Lists
        System.out.println("Welcome to Suniclo");
        System.out.println("===================================================");
        System.out.println("Purchased Items");
        System.out.println("---------------------------------------------------");
        System.out.println("1. Men Oversize T-shirt Black L");
        System.out.println("2. Airismi Polkadot Kids Sock");
        System.out.println("3. Unisex Casual Cap Cream");
        System.out.println("4. Unisex Windbreaker Jacket Purple L");
        System.out.println("5. Men Heatechy Jogger Pants L");
        System.out.println("6. Women Casual Blazer Navy M");
        System.out.println("7. Women Ripped Jeans Casual Cut Navy M");
        System.out.println("---------------------------------------------------");

        //Operation
        double totalprice = t_shirt + kidssock + cap + purp_jacket + jogger + blazer + jeans;
        double percentage = totalprice * 0.175;
        double grand_total = totalprice - percentage;

        System.out.println("Total       : IDR " + totalprice);
        System.out.println("Discount    : IDR " + percentage);
        System.out.println("Grand Total : IDR " + grand_total);


    }
}