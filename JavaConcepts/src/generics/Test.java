package generics;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);//stored in form of object
		list.add("10.25");
		list.add("ram");
		
		double var=(double)list.get(1);//ClassCastException:
		System.out.println(var);
		
		
	}
	
	
	
	

}
