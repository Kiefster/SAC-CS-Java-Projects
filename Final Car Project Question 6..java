public class Main {

	public static void main(String[] args) {

		// using the new constructor as requested
		Automobile[] automobiles= new Automobile[5];
		automobiles[0]= new Mustang("Mustang", "Red", 6);
		automobiles[1] = new Corvette("Corvette", "White", 6);
		automobiles[2] = new Malibu("Malibu", "Blue", 6);
		automobiles[3] = new Supra("Supra", "Black", 6);
		automobiles[4] = new NSX("NSX", "Silver", 6);
		// Performing the 8 laps as requested
		for (int i = 0; i < 10; i++) {
			boolean Shift = false;
			if (i % 2 == 0) {
				Shift = true;
			} else {
				Shift = false;
			}
			automobiles[0].Drive(Shift);
			automobiles[1].Drive(Shift);
			automobiles[2].Drive(Shift);
			automobiles[3].Drive(Shift);
			automobiles[4].Drive(Shift);
		}
		// printing out the history of shifts that where made
		automobiles[0].PrintShifts();
		automobiles[0].GetName();
		automobiles[1].GetName();
		automobiles[2].GetName();
		automobiles[3].GetName();
		automobiles[4].GetName();
		automobiles[0].GetGear();
		automobiles[1].GetGear();
		automobiles[2].GetGear();
		automobiles[3].GetGear();
		automobiles[4].GetGear();
		automobiles[0].GetColor();
		automobiles[1].GetColor();
		automobiles[2].GetColor();
		automobiles[3].GetColor();
		automobiles[4].GetColor();
		automobiles[1].GetSpeed();
		automobiles[2].GetSpeed();
		automobiles[3].GetSpeed();
		automobiles[4].GetSpeed();
		automobiles[1].GetDistance();
		automobiles[2].GetDistance();
		automobiles[3].GetDistance();
		automobiles[4].GetDistance();
		
		
		
		
		automobiles[1].PrintShifts();
		automobiles[2].PrintShifts();
		automobiles[3].PrintShifts();
		automobiles[4].PrintShifts();

	}