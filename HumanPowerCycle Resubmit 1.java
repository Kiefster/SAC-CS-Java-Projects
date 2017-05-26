public class HumanPowerCycle {
	// Member of instance variables
	int NumberofWheels = 0;
	int NumberofGears = 0;
	String name = "";
	String color;
	int CurrentGear = 0;

	// Setting the current number of gears
	public void SetCurrentGears(int num) {
		CurrentGear = num;
	}

	// Getting the current speed and returning the Number of Gears
	public int GetCurrentSpeed() {
		return NumberofGears + 5;
	}
}