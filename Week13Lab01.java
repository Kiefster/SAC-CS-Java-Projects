import java.util.Scanner;

public class Week13Lab01 {



	public static int divide(int num1, int num2) {
		return num1 / num2; 

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first number: "); // user will
																	// first number
		int numerator = scan.nextInt();
		System.out.println("Please enter the second number: "); // user will enter second number
																		
		int denominator = scan.nextInt();
		int num1 = 0,num2 = 0;
		int result = divide(num1, num2);
		System.out.printf("%Result:%d/%d=%d%n", num1, num2, result);

	} // end of Week13Lab01 Class

}
