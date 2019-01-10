package collectionsExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		System.out.println(list);

		System.out.println(list.size());
		list.add(10);
		list.add("ram");
		list.add(10.25);
		list.add('c');
		list.add(true);
		list.add(null);
		list.add("ram");

		System.out.println(list);

		System.out.println(list.size());
		
		System.out.println(list.get(0));
		
		list.remove(5);
		System.out.println(list.size());
		
		// 
		
		int var1=(Integer)list.get(0);
		System.out.println(20+var1);  //will create issue if its float
		
		for(int i=0; i<list.size();i++)
		{
			System.out.print(list.get(i));
	}
		
		System.out.println();
		for(Object var:list)
		{
			System.out.print(var);
		}
		System.out.println();
		
		Iterator itr= list.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
	}
}
