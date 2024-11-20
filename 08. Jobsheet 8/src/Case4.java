public class Case4 {
    public static void main(String[] args) {

        // Declare Variable and input
        int letter = 65;
        int rows = 5;

        // Operation
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print((char) letter + " ");
                letter++;
            }
            System.out.println();
        }
    }
}
