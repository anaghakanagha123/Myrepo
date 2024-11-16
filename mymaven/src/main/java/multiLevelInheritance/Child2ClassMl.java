package multiLevelInheritance;

public class Child2ClassMl extends ChildClassMl{
	
public void child2ClassDisplay(){
		
		System.out.println("Child02 class statement");
		parentClassDisplay();
		childClassDisplay();
		
	}

	public static void main(String[] args) {
		
		Child2ClassMl obj1=new Child2ClassMl();
		obj1.child2ClassDisplay();
		obj1.child2ClassDisplay();
		obj1.childClassDisplay();

	}

}
