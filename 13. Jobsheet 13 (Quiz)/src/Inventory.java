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
			System.out.print("\nEnter the index of the item to manage (0-4, or 99 to exit): "); //Prompts the user to input an index to choose
			choice = sigmaSkibidi.nextInt();

			if (choice >= 0 && choice < 5) { //A condition if the user inputs a valid integer based on the menu
					System.out.println("Selected item: " + items[choice]);
					System.out.print("Enter action (1: Add Stock, 2: Remove Stock): "); //Prompts the user whether the user wants to add a stock or remove the stock
					innerChoice = sigmaSkibidi.nextInt();
					switch (innerChoice) {
						case 1: //If the user wants to add a stock to the selected inventory
							System.out.print("Enter Quantity: ");
							stockOption = sigmaSkibidi.nextInt();
							itemQuantity[choice] += stockOption;
							System.out.println("Stock added successfully.");
							break;
						case 2: //If the user wants to remove a stock to the selected inventory
							System.out.print("Enter Quantity: ");
							stockOption = sigmaSkibidi.nextInt();
							if (stockOption > itemQuantity[choice]) {
								System.out.println("Not enough stock to remove.");
								break;
							} else {
								itemQuantity[choice] -= stockOption;
								System.out.println("Stock removed successfully.");
								break;
							}
						default:
							System.out.println("Please input a valid option.");
							break;
					}
				}
				
				else if (choice == 99) { //If the user inputs 99 as an index, terminate the program
					System.out.println("Program Terminated!");
					return;
				}
				else { //If the user inputs an invalid input
					System.out.println("Invalid index. Try again.");
					continue;
				}
			}
		}

	}
