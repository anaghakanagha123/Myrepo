package cricketer;

public class ClassInheritance {

	public static void main(String[] args) {
		
		Batsman bts=new Batsman("virat",24,106);
		bts.displayBatsmanDetails();
		System.out.println("--------------------");
		Bowler bwr=new Bowler("Bumrah",34,60);
		bwr.displayBowlerDetails();
	
	}

}
