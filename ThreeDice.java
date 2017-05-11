public class Dice {
	private static Dice dice1 = new Dice();
	private static Dice dice2 = new Dice();
	private static Dice dice3 = new Dice();

	public static void main(String[] args) {
		int counter = 1;
		int roll = dice1.Throw() + dice2.Throw() + dice3.Throw();
		Throw();

		{

		}
	}

	private static int Throw() {

		int counter = 1;
		while (counter < 7) {
			System.out.println(counter);

			counter++;

		}
		return counter;

	@Override
	public String toString() {
		return "SetDiceClass [getClass()=" + Throw() + "throw2" + Throw2() + ", toString()=" + super.toString() + "]";
}
}
