import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// variables
		String input = ""; // to hold user's input

		int num = 0;// to hold the number of dice
		int answer = 0;// initiating a variable to hold the system number
		do {
			// asking the user how many dice he/she would like, as well as
			// giving the user a chance to quit
			System.out.println("Please enter the number of dice you would like? (you may enter q to quit)");
			// reading the user's input
			Scanner scanner = new Scanner(System.in); // to read in user's input
			input = scanner.nextLine();
			// checking to see if the user would like to quit
			if (input.toLowerCase().equals("q")) {
				break;
			}
			// saving the number of dice the user wants in a variable called
			// dice
			try {
				num = Integer.parseInt(input);
			} catch (Exception e) {
				System.out.println("That's not a number, please try again.");
				continue;
			}
			// using a constructor to create a dice object with the number of
			// dice the user desires
			Dice dice = new Dice(num);
			// generating a system number
			answer = dice.roll();

			do {
				System.out.println("Please guess a number: ");
				num = scanner.nextInt();

			} while (num != answer); // checking to see if the user has guessed
										// the correct number

		} while (true);

	}
}
