import java.util.Random;

public class Automobile {
	// Creating the variables

	private String Name;
	private String Color;
	private int NumberofGears = 8;
	private int CurrentGear = 0;
	private int CurrentSpeed = 0;
	private Random rand = new Random();
	private int NumofLaps = 0;
	private String[] Shifts = new String[8];
	private int index = 0;

	// The following are getters and setter for the Automobile class
	public String GetName() {
		return Name;
	}

	public void SetName(String NewName) {
		Name = NewName;
	}

	public int GetGear() {
		return CurrentGear;
	}

	public void SetGear(int NewGears) {
		CurrentGear = NewGears;
	}

	public String GetColor() {
		return Color;
	}

	public void SetColor(String NewColor) {
		Color = NewColor;
	}

	public int GetSpeed() {
		return CurrentSpeed;
	}

	public void SetSpeed(int NewSpeed) {
		CurrentSpeed = NewSpeed;
	}

	public int GetDistance() {
		return NumofLaps;
	}

	// generating random number for the current gear
	public void GenerateRandomGearNumber() {
		int n = rand.nextInt(8) + 1;
		CurrentGear = n;
	}

	// Constructor for the automobile class
	public Automobile(String NewName, String NewColor, int NewNumberofGears) {
		Name = NewName;
		Color = NewColor;
		NumberofGears = NewNumberofGears;
	}

	// method that increases lap numbers and calculates speed
	public void Drive() {
		NumofLaps = NumofLaps + 1;
		CurrentSpeed = CurrentGear * 15;
		Shifts[index] = "No Change Since there is no boolean parameter";
		index++;
	}

	// creating a new method that will shift up or down depending on a boolean
	// parameter called Shift and the value of CurrentGear
	public void Drive(boolean Shift) {
		if (Shift == true && CurrentGear < 6) {
			CurrentGear = CurrentGear + 1;
			Shifts[index] = "Up to make CurrentGear = " + CurrentGear;
			index++;
		} else {
			CurrentGear = CurrentGear - 1;
			Shifts[index] = "Down to make CurrentGear= " + CurrentGear;
			index++;
		}
	}

	// method to print all of the shifts made in the Drive methods
	public void PrintShifts() {
		for (int counter = 0; counter < Shifts.length; counter++) {
			System.out.println(Shifts[counter]);
		}
	}
}
=====================================================================================================================
public class Main {

	public static void main(String[] args) {

		// using the new constructor as requested
		Automobile mustang = new Automobile("Mustang", "Red", 6);
		Automobile corvette = new Automobile("Corvette", "White", 6);
		Automobile malibu = new Automobile("Malibu", "Blue", 6);
		Automobile supra = new Automobile("Supra", "Black", 6);
		Automobile NSX = new Automobile("NSX", "Silver", 6);
		// Performing the 8 laps as requested
		for (int i = 0; i < 8; i++) {
			boolean Shift = false;
			if (i % 2 == 0) {
				Shift = true;
			} else {
				Shift = false;
			}
			mustang.Drive(Shift);
			corvette.Drive(Shift);
			malibu.Drive(Shift);
			supra.Drive(Shift);
			NSX.Drive(Shift);
		}
		// printing out the history of shifts that where made
		mustang.PrintShifts();
		corvette.PrintShifts();
		malibu.PrintShifts();
		supra.PrintShifts();
		NSX.PrintShifts();

	}
}