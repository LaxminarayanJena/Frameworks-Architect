package generics;

import java.util.ArrayList;

public class UseGenericClass {

	public static void main(String[] args) {
		GenericClassExample<Integer> obj = new GenericClassExample<Integer>(10);
		obj.show();
		System.out.println(obj.get());
		
		
		GenericClassExample<String> obj1 = new GenericClassExample<String>("ram");
		obj1.show();
		System.out.println(obj1.get());
		
		
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		//list1.add("ram");		
		m1(list1);
		
		
		ArrayList list2 = new ArrayList();
		list2.add("10");
		list2.add("20");
		list2.add("ram");		
		m1(list2);
	}
	
	public static void m1(ArrayList<?> list)
	{
		list.add(null); //cant add string
		System.out.println(list);
	}
	
	
	
	
}
	/*
public static void m1(ArrayList<Integer> list)
{
	
	int var=0;
	for(Integer i:list)
	{
		var=var+i;
		
	}
	System.out.println(var);
}


}
	*/