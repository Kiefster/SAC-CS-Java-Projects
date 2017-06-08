import java.util.Random;
public class Automobile {
	// Creating the variables

	private String Name;
	private String Color;
	private int NumberofGears=8;
	private int CurrentGear=0;
	private int CurrentSpeed=0;
	private Random rand = new Random();
	private int NumofLaps=0;
	//The following are getters and setter for the Automobile class
	public String GetName(){
	    return Name;
	}
	public void SetName(String NewName) {
		Name=NewName;
	}

	public int  GetGear() {
		return CurrentGear;
	}
	public void SetGear(int NewGears) {
		CurrentGear=NewGears;
	}
	
	public String GetColor(){
	    return Color;
	}
	public void SetColor(String NewColor){
	    Color= NewColor;
	}
	public int GetSpeed(){
	    return CurrentSpeed;
	}
	public void SetSpeed(int NewSpeed){
	    CurrentSpeed=NewSpeed;
	}
	public int GetDistance(){
	    return NumofLaps;
	}
	//generating random number for the current gear
	public void GenerateRandomGearNumber() {
	    int n= rand.nextInt(8)+ 1;
	    CurrentGear=n;
	}
	//method that increases lap numbers and calculates speed
	public void Drive(){
	    NumofLaps = NumofLaps + 1;
	    CurrentSpeed=CurrentGear*15;
	}
	//Constructor for the automobile clas
	public Automobile(String NewName,String NewColor,int NewNumberofGears){
	    Name= NewName;
	    Color= NewColor;
	    NumberofGears= NewNumberofGears;
	}

}
==================================================================================================================================================================

public class Main {

	public static void main(String[] args) {

	    //using the new constructor as requested
        Automobile mustang= new Automobile("Mustang","Red",6);
        Automobile corvette= new Automobile("Corvette","White",6);
        Automobile malibu= new Automobile("Malibu","Blue",6);
        Automobile supra= new Automobile("Supra","Black",6);
        Automobile NSX= new Automobile("NSX","Silver",6);
        //Performing the 8 laps as requested
        for(int i = 0; i < 8; i++){
            mustang.Drive();
            corvette.Drive();
            malibu.Drive();
            supra.Drive();
            NSX.Drive();
        }
	}

}