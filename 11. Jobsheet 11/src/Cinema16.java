public class Cinema16 {

    public static void main(String[] args) {
        // Declare Array
        String[][] audience = new String[4][2];

        // Fill in each element of the value array
        audience[0][0] = "Amin";
        audience[0][1] = "Bena";
        audience[1][0] = "Candra";
        audience[1][1] = "Dela";
        audience[2][0] = "Eka";
        audience[2][1] = "Farhan";
        audience[3][0] = "Gisel";
        audience[3][1] = "Hana"; // Adds "Hana" as an array element on the 1st column on the 3rd row

        // Display all contents of the elements to the screen
        System.out.printf("%s \t %s\n", audience[0][0], audience[0][1]);
        System.out.printf("%s \t %s\n", audience[1][0], audience[1][1]);
        System.out.printf("%s \t %s\n", audience[2][0], audience[2][1]);
        System.out.printf("%s \t %s\n", audience[3][0], audience[3][1]);

        System.out.println(audience.length); // Display the whole audience array's length (row)
        for (String[] rowAudience : audience) { // Loops the print syntax where it iterates through each row of the
                                                // audience array
            System.out.println("Length of row: " + rowAudience.length); // Prints the length of each
                                                                        // array's row
        }

        System.out.println("Audiences in the row 3: ");
        for (int i = 0; i < audience.length; i++) { //Loops the print syntax using for loop
            System.out.println("Audience in the row " + (i + 1) + ": " + String.join(", ", audience[i]));
        }

        // System.out.println(audience.length);
        // System.out.println(audience[0].length);
        // System.out.println(audience[1].length);
        // System.out.println(audience[2].length);
        // System.out.println(audience[3].length);
    }
}