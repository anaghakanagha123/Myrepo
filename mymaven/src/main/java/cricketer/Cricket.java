package cricketer;

public class Cricket {
		
	String playername;
	int playerage;
	
	public Cricket(String playername,int playerage) {
		
		this.playername=playername;
		this.playerage=playerage;
	}
	public void diaplayDetails() {
		
		System.out.println("Player Name: "+playername);
		System.out.println("Player Age: "+playerage);
		
	}
}
