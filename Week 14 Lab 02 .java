
public class Animal {
private String m_Name;
private String m_Move;
private int m_Distance=0;
private String m_Speak;

public Animal(String Name){
    m_Name=Name;
}
public Animal(String Name,int Distance){
    
    m_Name=Name;
    m_Distance= Distance;
}

public Animal(String Name,String Move,String Speak){
    m_Name=Name;
    m_Move=Move;
    m_Speak=Speak;
}

// Setting the value of m_Name.
public void SetName(String Name){
    m_Name= Name;
}
//Returning m_Name.
public String GetName(){
    return m_Name;
}

public void SetMove(String Direction){
    
}
public void Move(int Distance){
    System.out.println(m_Name+"is moving");
}
public int GetDistance(){
    return m_Distance;
}
/*method that invokes the speak method. Instructions did not specify a value for m_Speak nor did they call for a setSpeak(), 
therefore I have chosen the most generic route in hopes of meeting the desired output.*/
 public void Speak(){
     System.out.println("Speak");
 }
@Override
	public String toString() {
		return "Animal Class [getClass()=" +   ", toString()=" + super.toString() + "]";
	}
}



public static void main(String[] args) {
        Animal cat= new Animal("Garfield"," 1 feet","Meow");
        Animal dog= new Animal("Oldie","2 feet","Woof");
        Animal bird= new Animal("Twetie","3 feet","Tweet");
		for(int NumofLaps=0;NumofLaps<=3;NumofLaps++){
		    
		}