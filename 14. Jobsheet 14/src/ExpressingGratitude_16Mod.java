import java.util.Scanner;

public class ExpressingGratitude_16Mod {
    public static String getGreetingRecipient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet: ");
        String recipientName = input.nextLine();
        return recipientName;
    }

	public static String sayAdditionalGreetings() { //Add a new function to input additional greetings
		Scanner sigmaSkibidi = new Scanner(System.in); //Declare a new scanner for the new function
		System.out.print("Input additional greetings you want to say to the recipient: ");
		String additionalGreetings = sigmaSkibidi.nextLine();
		return additionalGreetings;
	}

    public static void sayThankYou() {
        String name = getGreetingRecipient();
		String addGreetings = sayAdditionalGreetings();
        System.out.println("Thank you " + name + " for being the best teacher in the world. \n"
                + "You inspired in me a love for learning and made me feel like I could ask you anything."
				+ "\n" + addGreetings);
    }

    public static void main(String[] args) {
        sayThankYou();
    }
}