package heirachicalInheritance;

public class HirChildClass extends HirParentClass {

	public void hirChildDis() {
		
		System.out.println("heirachical child class inheritance");
		hirParentDis();
	}
	
	public static void main(String[] args) {
		HirChildClass obj=new HirChildClass();
		obj.hirChildDis();
		obj.hirParentDis();
		
	}

}
