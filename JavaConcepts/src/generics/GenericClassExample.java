package generics;

import java.util.ArrayList;

public class GenericClassExample<T extends Object>  {
	
	//t means can hold any type of object
	T ob;
	
	public GenericClassExample(T ob)
	{
		this.ob=ob;
	}
	
	public void show()
	{
	System.out.println("type of object is :" + ob.getClass().getName());
	}
	
	public T get()
	{
		return this.ob;
	}
	
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	

}
