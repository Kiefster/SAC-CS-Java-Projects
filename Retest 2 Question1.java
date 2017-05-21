public class Dice {
	// member of instance variables
	int numOfDice = 0;
	int valueOfRoll = 0;
	String history;

	// constructor that takes in the amount of dice as a parameter
	public Dice(int amount) {
		numOfDice = amount;
	}

	// method setting the number of dice
	public void SetDices(int amount) {
		numOfDice = amount;
	}

	// method generating the value of rolling the dice
	public int roll() {
		Random random = new Random();
		valueOfRoll = random.nextInt(numOfDice * 6) + 1;
		history = history + valueOfRoll;
		return valueOfRoll;
	}

	// returning the last value rolled
	public int ValueOfRoll() {
		return valueOfRoll;
	}