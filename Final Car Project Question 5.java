public class Main {

	public static void main(String[] args) {

		// using the new constructor as requested
		Mustang mustang = new Mustang("Mustang", "Red", 6);
		Corvette corvette = new Corvette("Corvette", "White", 6);
		Malibu malibu = new Malibu("Malibu", "Blue", 6);
		Supra supra = new Supra("Supra", "Black", 6);
		NSX NSX = new NSX("NSX", "Silver", 6);
		// Performing the 8 laps as requested
		for (int i = 0; i < 10; i++) {
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
====================================================================================================

public class Mustang extends Automobile {
	String Sound;

	public Mustang(String Name, String Color, int CurrentGear) {
		super(Name, Color, CurrentGear);
		Sound = Name;

	}

	public String Sound() {

		return Sound;
	}
}
=========================================================================================================

public class Corvette extends Automobile {
	String Sound;

	public Corvette(String Name, String Color, int CurrentGear) {
		super(Name, Color, CurrentGear);
		Sound = Name;

	}

	public String Sound() {

		return Sound;
	}
}
========================================================================================================

public class Malibu extends Automobile {
	String Sound;

	public Malibu(String Name, String Color, int CurrentGear) {
		super(Name, Color, CurrentGear);
		Sound = Name;

	}

	public String Sound() {

		return Sound;
	}
}
======================================================================================================

public class Supra extends Automobile {
	String Sound;

	public Supra(String Name, String Color, int CurrentGear) {
		super(Name, Color, CurrentGear);
		Sound = Name;

	}

	public String Sound() {

		return Sound;
	}
}
================================================================================================================

public class NSX extends Automobile {
	String Sound;

	public NSX(String Name, String Color, int CurrentGear) {
		super(Name, Color, CurrentGear);
		Sound = Name;

	}

	public String Sound() {

		return Sound;
	}
}
