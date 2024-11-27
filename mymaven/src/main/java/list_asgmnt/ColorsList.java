package list_asgmnt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColorsList {
	
	List<String> clrs=new ArrayList<String>();
	
	public void addColors() {
	clrs.add("Blue");
	clrs.add("Yellow");
	clrs.add("Red");
	clrs.add("Pink");
	clrs.add("Orange");
	
	System.out.println("Colors list");
	System.out.println(clrs);
	}
	
	public void retrieveElement() {
		
		clrs.get(2);
		
		System.out.println("Retrived element: " +clrs.get(2));
			
		}
	
	public void iterateElements() {
		
		System.out.println("colors using iterator");
			
		Iterator<String> it=clrs.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());}
			
		}
	
		public void searchElement() {
		
		System.out.println("Search color");
		clrs.contains("Blue");
		System.out.println(clrs.contains("Blue"));
				
		}
		
		public void removeElement() {
			
			System.out.println("list after removing an element");
				clrs.remove(3);
				System.out.println(clrs);
				
				
			}
		

		public static void main(String[] args) {
			ColorsList clr=new ColorsList();
			clr.addColors();
			clr.retrieveElement();
			clr.iterateElements();
			clr.removeElement();
			clr.searchElement();

		}

		}
