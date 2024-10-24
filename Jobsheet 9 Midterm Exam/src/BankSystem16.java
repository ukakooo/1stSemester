import java.util.Scanner;

public class BankSystem16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance, withdrawAmount, depositAmount; // declare variables for balances, withdraw amount and deposit amount
        int choice; // declare variable for choices
        int failedAttempts = 0; // declare variable and input for failed attempts
        boolean isRunning = true; // declare variable and input about whether the program is running or not

        System.out.print("Enter your initial balance: "); // print out a prompt to ask for input for the initial balance
        balance = input.nextDouble();

        System.out.println("Welcome! your current balance is $" + balance); // Welcome screen

        while (isRunning) {
            System.out.println("Choose an option: "); // List of options the user can input and also the description
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: "); // Giving the user to input an option
            choice = input.nextInt();

            switch (choice) {
                case 1: // if the user gives 1 as an input
                    System.out.print("Enter amount to deposit: "); // Giving the user an option on how many amounts the user wants to deposit to the balance
                    depositAmount = input.nextDouble();
                    if (depositAmount > 0) { // If the deposit amount it more than 0, let the user know that the deposit is successful and add the deposit amount to the current balance
                        balance += depositAmount;
                        System.out.println("Deposit successful! Your new balance is $" + balance);
                        System.out.println();
                    } else { // If the deposit amount input is $0 or less, prompt an error message and increase the failed attempts count
                        System.out.println("Error: Balance amount must be greater than $0");
                        failedAttempts++;
                        System.out.println(); // To print a blank row
                    }
                    break;
                case 2: // If the user gives 2 as an input
                    System.out.print("Enter amount to withdraw: "); // Giving the user an option on how many amounts the user wants to withdraw from the balance
                    withdrawAmount = input.nextDouble();

                    if (withdrawAmount > balance) { // If the withdraw amount is over the balance amount, let the user know that the user has insufficient balance and increase the failed attempts count
                        System.out.println("Error: Insufficient balance. Transaction denied");
                        failedAttempts++;
                    } else if (withdrawAmount <= 0) { // If the withdraw amount is 0 or less, prompt an error message that the withdrawal amount must be greater than $0
                        System.out.println("Error: Withdrawal amount must be greater than $0");
                        failedAttempts++;
                    } else if (withdrawAmount > 500) { // If withdrawal is greater than $500, prompt an error message that the user can't withdraw more than $500 at once
                        System.out.println("Error: You cannot withdraw more than $500 at once");
                        failedAttempts++;
                    } else { // If the user inputs a valid withdrawal, let the user know that the withdraw process is successful and decrease the current balance by the withdraw amount
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful! Your new balance is $" + balance);
                    }
                    System.out.println(); // To print a blank row
                    break;
                case 3: // If the user inputs 3, print the user's current balance
                    System.out.println("Your current balance is $" + balance);
                    System.out.println(); // To print a blank row
                    break;
                case 4: // If the user inputs 4, terminate the program
                    System.out.println("See you next time! Your final balance is $ " + balance + "!");
                    isRunning = false; // Set the isRunning to false to make the program terminated
                    break;
                default: // If the user inputs an invalid input, print an error message and increase the
                         // failed attempts count
                    System.out.println("Error: Please input a valid input");
                    failedAttempts++;
                    System.out.println(); // Print a blank row
                    break;
            }
            if (failedAttempts >= 3) { // If there are 3 failed attempts, prints that the user's account is locked for security reasons
                System.out.println("Too many invalid attempts. Your account has been temporarily locked for security reasons.");
                isRunning = false; // Set the isRunning variable to false to make the program terminated
            } else {

            }
        }
        input.close();
    }
}
