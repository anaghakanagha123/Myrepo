package encapsulation;

public class AccountDetails {
 private String name;
 private float blnc;
 
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getBlnc() {
	return blnc;
}
public void setBlnc(float blnc) {
	this.blnc = blnc;
}
	public void interest() {
		
		float i;
		i=blnc*2f;
		blnc+=i;
		
		
	}
}
