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
	//Setting the value methods of the Automobile class.
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
	
	public void GenerateRandomGearNumber() {
	    int n= rand.nextInt(8)+ 1;
	    CurrentGear=n;
	}
	public void Drive(){
	    NumofLaps = NumofLaps + 1;
	    CurrentSpeed=CurrentGear*15;
	}
	public int GetDistance(){
	    return NumofLaps;
	}
	public Automobile(String NewName,String NewColor,int NewNumberofGears){
	    Name= NewName;
	    Color= NewColor;
	    NumberofGears= NewNumberofGears;
	}
	public void Drive(boolean Shift){
	    if(Shift==true && CurrentGear<6){
	        CurrentGear= CurrentGear+1;
	    }else {
	        CurrentGear= CurrentGear-1;
	    }
	}
}
========================================================================================================================================

public class Main {

	public static void main(String[] args) {

        Automobile mustang= new Automobile("Mustang","Red",6);
        Automobile corvette= new Automobile("Corvette","White",6);
        Automobile malibu= new Automobile("Malibu","Blue",6);
        Automobile supra= new Automobile("Supra","Black",6);
        Automobile NSX= new automobile("NSX","Silver",6);
        
       
	}

}
