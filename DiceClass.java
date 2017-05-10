
public class SetDiceClass {
	private static SetDiceClass dice1 = new SetDiceClass();
	private static SetDiceClass dice2 = new SetDiceClass();
	private static SetDiceClass dice3 = new SetDiceClass();

	public SetDiceClass() {

	}

	public static void main(String[] args) {
		int roll = dice1.Throw();
		int roll2 = dice2.Throw2();
		int roll3 = dice3.Throw3();

	}

	private static int Throw() {
		int Value = 1;
		while (Value < 7) {
			System.out.println("Dice1 shows: " + Value);
			Value++;
		}
		return Value;
	}

	private static int Throw2() {
		int Value = 2;
		while (Value < 13) {
			System.out.println("Dice2 shows " + Value);
			Value++;
		}
		return Value;
	}

	private static int Throw3() {
		int Value = 3;
		while (Value < 19) {
			System.out.println("Dice3 shows " + Value);
			Value++;
		}
		return Value;
