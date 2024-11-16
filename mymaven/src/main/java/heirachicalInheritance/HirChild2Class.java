package heirachicalInheritance;

public class HirChild2Class extends HirParentClass {
	
public void hirChild2Dis() {
		
		System.out.println("heirachical child02 class inheritance");
		hirParentDis();
	}

	public static void main(String[] args) {
		
		HirChild2Class obj1=new HirChild2Class();
		obj1.hirChild2Dis();
		obj1.hirParentDis();

	}

}
