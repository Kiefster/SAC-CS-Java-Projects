import java.util.Scanner;
public class Calculator {
	public static void main(String args []){
		Scanner kiefer= new Scanner(System.in);
		double fnum,snum,thirdnum, fourthnum,anwser;
		System.out.println("Enter First Number: ");
		fnum=kiefer.nextInt();
		System.out.println("Enter Second Number: ");
		snum=kiefer.nextInt();
		
		System.out.println("Enter Third Number: ");
		thirdnum=kiefer.nextInt();
		System.out.println("Enter Fourth Number: ");
		fourthnum=kiefer.nextInt();	
		anwser= fnum + snum * thirdnum / fourthnum;
		System.out.printf("Your anwser is ",anwser);
		System.out.println(anwser);
		
	}
}
