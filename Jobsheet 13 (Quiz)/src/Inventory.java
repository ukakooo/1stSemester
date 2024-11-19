import java.util.Scanner;

public class Inventory {
	public static void main(String[] args) {
		Scanner sigmaSkibidi = new Scanner(System.in);

		String[] items = { "Apples", "Bananas", "Cherries", "Dates", "Eggplant" }; // Declare array for the item names
		int[] itemQuantity = { 50, 30, 40, 60, 20 }; // Declare Array variable for the quantity of the item
		int choice, innerChoice, stockOption;

		while (true) {
			System.out.println("\nCurrent Inventory: ");
			for (int i = 0; i < items.length; i++) { // A command that loops to display the inventory's contents
				System.out.println(i + ". " + items[i] + ": " + itemQuantity[i]);
			}
			System.out.print("\nEnter the index of the item to manage (0-4, or 99 to exit): ");
			choice = sigmaSkibidi.nextInt();

			if (choice >= 0 && choice < 5) {
					System.out.println("Selected item: " + items[choice]);
					System.out.print("Enter action (1: Add Stock, 2: Remove Stock): ");
					innerChoice = sigmaSkibidi.nextInt();
					switch (innerChoice) {
						case 1:
							System.out.print("Enter Quantity: ");
							stockOption = sigmaSkibidi.nextInt();
							itemQuantity[choice] += stockOption;
							System.out.println("Stock added successfully.");
							break;
						case 2:
							System.out.print("Enter Quantity: ");
							stockOption = sigmaSkibidi.nextInt();
							itemQuantity[choice] -= stockOption;
							System.out.println("Stock removed successfully.");
							break;
						default:
							System.out.println("Please input a valid option.");
							break;
					}
				}
				
				else if (choice == 99) {
					System.out.println("Program Terminated!");
					return;
				}
				else {
					System.out.println("Invalid index. Try again.");
					continue;
				}
			}
		}

	}
