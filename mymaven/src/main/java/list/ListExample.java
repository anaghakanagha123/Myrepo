package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ListExample {
	
	public void listOperations() {
		
		List<String> list=new ArrayList<String>();
		list.add("anagha");
		list.add("anjali");
		list.add("anusha");
		list.add("100");
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("list using for loop");
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i));
			
		}
		System.out.println("list using for each loop");

		for(String ele:list) {
			
			System.out.println(ele);
			
		}
	System.out.println("list using iterator");
	Iterator<String> it=list.iterator();
	
	while(it.hasNext()) {
		
		System.out.println(it.next());
		
	}
		}
	
	public void setOperations() {
	
	HashSet<String> set=new HashSet<String>();
	
	set.add("Anagha");
	set.add("Arjun");
	set.add("Remya");
	set.add("100");
	set.add("vishnu");
	
	
	System.out.println(set);
	
	set.remove("vishnu");
	System.out.println(set);
	
	//set.clear();
	//System.out.println(set);
	
	HashSet<String> set2=new HashSet<String>();
	set2.add("abc");
	set2.add("xyz");
	
	System.out.println("Add all elements of 'set2' to 'set'");
	set.addAll(set2);
	System.out.println(set);
	
	System.out.println("Remove all elements of 'set2' from 'set'");
	set.removeAll(set2);
	System.out.println(set);
	
	System.out.println("set using iterator");
	Iterator<String> it=set.iterator();
	
	while(it.hasNext()) {
		
		System.out.println(it.next());
		
	}
	
	System.out.println("list using for each loop");

	for(String ele:set) {
		
		System.out.println(ele);
		
	}
	
	

	}
	public static void main(String[] args) {
		ListExample lst=new ListExample();
		//lst.listOperations();
		lst.setOperations();
	}
}
