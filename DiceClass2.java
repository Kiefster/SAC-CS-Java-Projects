import java.util.Random;
import java.util.Scanner;

public class Dice {
	public static void main(String[] args) {
		{
			Random GetANumber_Between_1_and_10 = new Random();

			int random = GetANumber_Between_1_and_10.nextInt(10);
			int numberOfTries = 0;
			Scanner input = new Scanner(System.in);
			int guess;
			boolean win = false;
			constructor kiefer = new constructor();

			while (win == false) {
				System.out.println("Guess a number between 1 and 10:");
				guess = input.nextInt();
				numberOfTries++;

				if (guess >= random) {
					win = true;
				} else if (guess >= random) {
					System.out.println("Your guess was too high!");
				} else if (guess <= random) {
					System.out.println("Your guess was too low.");
				}
			}

			System.out.println("you win!");
			System.out.println("The number is " + random);
			System.out.println("It took you " + numberOfTries + " tries.");
			System.out.println("Do you want to play again?");
		}

	}
}
