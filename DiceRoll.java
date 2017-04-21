import java.util.Random;
import java.util.Scanner;

public class Dice {
	public static void main(String[] args) {
		int player;

		int count = 0;
		int dice;

		Random gen = new Random();
		String restart;
		Scanner scan = new Scanner(System.in); // user input
		System.out.print(
				"Which number would you want to roll for? \nPress any number to start playing. \npress 0 to quit");
		int roll = scan.nextInt();
		dice = gen.nextInt(18) + 1; // this will randomly generate a number
									// between 1-18
		do {
			count++;
			if (roll == 0) {
				System.out.println("\nQuit game.");
				System.out.println("\nWill you play again?");
				restart = scan.next();
				roll = scan.nextInt();
				if (restart.equalsIgnoreCase("Y")) {
					System.out.print("Enter a number to begin playing.");

				} else
					break;
			}
			if (roll == dice) {
				System.out.println("you win! You have rolled " + count + " times ");
				System.out.println("\nWill you play again?");
				restart = scan.next();
				if (restart.equalsIgnoreCase("Y")) {
					System.out.print("Enter a number to begin playing.");
					restart = scan.next();
					roll = scan.nextInt();
				} else
					break;

			}
			if (roll < dice) {
				System.out.print("Your roll was too low, please try again.\n");
				roll = scan.nextInt(); // if player rolls high number
				Random gen2 = new Random(dice);
				return;
			}
			if (roll > dice) {
				System.out.print("Your roll was too high, please try again.\n");
				roll = scan.nextInt(); // if player rolls low number
				Random gen3 = new Random(dice);
				return ;
			}
		} while (roll != 0);
		System.out.print("Thanks for playing!");

	}
}
