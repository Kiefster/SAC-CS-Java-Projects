public class Unicycle extends HumanPowerCycle {
	// Member of instance variables
	int NumberofWheels = 1;
	int NumberofGears = 3;
	int CurrentGear = 0;

	// Getting current speed and returning speed of the current gear
	@Override
	public int GetCurrentSpeed() {
		if (CurrentGear == 1) {
			return 5;
		} else if (CurrentGear == 2) {
			return 6;
		} else {
			return 8;
		}

	}
}