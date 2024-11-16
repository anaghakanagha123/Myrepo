package superkeyword;

public class Child extends Parent{
	
	int number;
	public void setValue(int num) {
		
		super.number=num;
		this.number=num;//instance var and parameter var equl
		}
	public void displayChild() {
		
		number+=20;
		System.out.println("child class numebr is " +number);//executes this.number=num;
		System.out.println("child class numebr is " +super.number);//executes super.number=num;
	}

	public static void main(String[] args) {
		Child obj=new Child();
		
		obj.setValue(100);//executes parent method "System.out.println("Parent numebr is " +number);"
		obj.displayChild();
		obj.Parentmethod();
		

	}

}
