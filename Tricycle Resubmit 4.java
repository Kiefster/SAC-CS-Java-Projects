public class Tricycle extends HumanPowerCycle {
	// Member of instance variables
	int NumberofWheels = 3;
	int NumberofGear = 5;
	int currentGear = 0;

	// Getting current speed and returning speed of the current gear
	@Override
	public int GetCurrentSpeed() {
		if (CurrentGear == 1) {
			return 6;
		} else if (CurrentGear == 2) {
			return 7;

		} else if (CurrentGear == 3) {
			return 8;
		} else if (CurrentGear == 4) {
			return 9;
		} else {
			return 10;
		}
	}
}