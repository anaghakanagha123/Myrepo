package cricketer;

public class Batsman extends Cricket{

	int runsscored; 
	
	public Batsman(String playername,int playerage,int runsscored) 
	
	{
		super(playername, playerage);
		this.runsscored=runsscored;
		
	}
	
	public void displayBatsmanDetails() {
		
		diaplayDetails();
		System.out.println("Runs scored: "+runsscored);
			
	}
	}
	