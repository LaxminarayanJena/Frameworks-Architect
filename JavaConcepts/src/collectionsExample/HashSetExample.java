package collectionsExample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		
		//unordered and removed duplicates
		HashSet<String> set = new HashSet<String>();
		set.add("Ram");
		set.add("selenium");
		set.add("appium");
		set.add("Ram");
		set.add("soapui");
		
		System.out.println(set);
		
		for(String var: set)
		{
			System.out.println(var);
		}
		
		System.out.println("------------");
		
		Iterator<String> itr=set.iterator();
		
		while(itr.hasNext())
		{
			String var= itr.next();
			if(var.equals("appium"))
			{
				System.out.println(var);
			}
		}
		
		
		
		
		
	}

}
