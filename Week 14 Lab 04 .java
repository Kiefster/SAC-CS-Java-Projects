public class Animal {
private String m_Name;
private String m_Move;
private int m_Distance=0;
private String m_Speak;
private String[] Moves = new String[5];
// Making constructor that takes name as a parameter to set the member variable
public Animal(String Name){
    m_Name=Name;
} //Making constructor that takes name and distance as  parameters to set the member variables.
public Animal(String Name,int Distance){
    
    m_Name=Name;
    m_Distance= Distance;
}
// Making constructor that takes name,move, and speak as parameters to set the member variables.
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
// This SetMove method accepts the Direction as a parameter to be assigned as a value of the member variable named m_Move
public void SetMove(String Direction){
    m_Move = Direction;
}
// Recording the move and distance.
public void Move(String Direction){
    System.out.println(m_Name+"is moving");
    for(int counter=0;counter<5;counter++){
        if(Moves[counter]==null){
            Moves[counter]=Direction;
            
        }
    
    }
    m_Distance++;
}
//Printing the 5 moves
public void Printmoves(){
    for(int counter=0;counter<5;counter++){
        System.out.println(Moves[counter]);
    }
}
// Making the GetDistance method and returning the m_Distance value
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
		  cat.Move("Left, Right");  
		  dog.Move("Left,Right");
		  bird.move("Left,Right");
		  cat.Speak();
		  dog.Speak();
		  bird.Speak();
		  System.out.println(cat.GetDistance());
		  System.out.println(dog.GetDistance());
		  System.out.println(bird.GetDistance());
		 
		}
		System.out.print(cat.GetName());
		System.out.print(dog.GetName());
		System.out.print(bird.GetName());
		cat.GetMoves();
		dog.GetMoves();
		bird.GetMoves();
}