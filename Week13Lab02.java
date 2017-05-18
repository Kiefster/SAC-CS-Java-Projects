import java.util.InputMismatchException;
import java.util.Scanner;

public class Week13Lab02 {

	public static int divide(int num1, int num2) {
		return num1 / num2;

	}

	public static void main(String[] args) {

		try {
			Scanner scan = new Scanner(System.in);
			boolean continueLoop = true;
			System.out.println("Please enter the first number: "); // user will
																	// first
																	// number
			int numerator = scan.nextInt();
			System.out.println("Please enter the second number: "); // user will
																	// enter
																	// second
																	// number

			int denominator = scan.nextInt();
			int num1 = 0, num2 = 0;
			int result = divide(num1, num2);
			System.out.printf("%Result:%d/%d=%d%n", num1, num2, result);
			continueLoop = false;
		} catch (InputMismatchException inputMismatchException) {
			Scanner scan = new Scanner(System.in);
			System.err.printf("%Exception: %s%n", inputMismatchException);
			scan.nextLine();
			System.out.printf("You must enter the correct number. Try again%n%n");
		} catch (ArithmeticException arithemeticException) {
			System.err.printf("%nException: %s%n", arithemeticException);
			System.out.printf("Zero is not a valid number. Try again.");
		}

	} // end of Week13Lab01 Class

}
