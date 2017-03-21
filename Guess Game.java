import java.util.Random;
import java.util.Scanner;

public class GuessGame {
public static void main(String[] args){
	Random rand= new Random();
	int numberToGuess= rand.nextInt(10);
	int numberOfTries=0;
	Scanner input= new Scanner(System.in);
	int guess;
	boolean win= false;
	
	while (win== false){
		System.out.println("Guess a number between 1 and 10:");
		guess= input.nextInt();
		numberOfTries++;
		
		if (guess == numberToGuess){
			win=true;
		}
		else if (guess == numberToGuess){
			System.out.println("Your guess was too high!");
		}
		else if (guess == numberToGuess){
			System.out.println("Your guess was too low.");
		}
	}
	System.out.println("you win!");
	System.out.println("The number is " + numberToGuess);
	System.out.println("It took you "+ numberOfTries+ " tries.");
}
}
