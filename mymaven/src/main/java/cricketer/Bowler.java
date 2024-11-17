package cricketer;

public class Bowler extends Cricket {
	
	int wicketscored;
	
	public  Bowler(String playername,int playerage, int wicketscored) {
		
		super(playername,playerage);
		this.wicketscored=wicketscored;
	}

	
	public void displayBowlerDetails() {
		
		diaplayDetails();
		System.out.println("wicketscored: "+wicketscored);
		
	}
}
