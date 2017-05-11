
public class DiceClass2 extends SetDiceClass {

	void History() {
		int[] array = new int[101];
		for (int counter = 0; counter < 100; counter++) {
			array[counter] = counter;
			System.out.println(counter);
		}
	}

	public static void main(String[] args) {
		int[] array = new int[101];
		for (int counter = 0; counter < 101; counter++) {
			array[counter] = counter;
			System.out.println(counter);
		}

	}
}
