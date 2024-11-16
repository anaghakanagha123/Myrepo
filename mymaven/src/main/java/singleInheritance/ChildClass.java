package singleInheritance;

public class ChildClass extends ParentClass {
	
	public void displayChild() {
		
		System.out.println("child class executed.");
		displayParent();//child method can call parent if extends is used
	}
	
	public static void main(String[] args) {
		
		ChildClass obj1=new ChildClass();
		obj1.displayChild();
		obj1.displayParent();//'child is a parent' child class can call parent class
		
		ParentClass obj2=new ParentClass();
		obj2.displayParent();//parent class cannot call child
	}

}
