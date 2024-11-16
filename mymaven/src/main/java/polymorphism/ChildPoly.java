package polymorphism;

public class ChildPoly extends ParentPoly {

	
	public int operations(int num1,int num2) {
		//super.operations(2,2);//or super.operations(num1,num2);
		int div;
		div=num1/num2;
		System.out.println("Result of child operation ="+div);
		return div;
	}
	
	public void displayres() {
		
		System.out.println("Child operations");
		
	}
	
	public static void main(String[] args) {
		ChildPoly pol=new ChildPoly();
		pol.operations(40,20);
		/*ParentPoly mulp=new ParentPoly();
		mulp.operations(60,3);*/
		//ParentPoly obj=new ChildPoly();
		//obj.operations(40,20);
		//obj.displayres();//cannot use as obj is the objectname of parent*/
	}

}
