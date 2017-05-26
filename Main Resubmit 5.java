public class Main {
	public static void main(String[] args) {
		Unicycle W1u = new Unicycle();
		Bicycle W2b = new Bicycle();
		Tricycle W3t = new Tricycle();
		for (int counter = 0; counter <= 10; counter++) {
			W1u.SetCurrentGears(counter);
			W2b.SetCurrentGears(counter);
			W3t.SetCurrentGears(counter);
			System.out.println(W1u.GetCurrentSpeed());
			System.out.println(W2b.GetCurrentSpeed());
			System.out.println(W3t.GetCurrentSpeed());
		}

	}
}