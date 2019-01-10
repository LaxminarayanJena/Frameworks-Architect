package collectionsExample;

public class AutoBoxing {
	
	public static void main(String[] args) {
		int var=10;
		Integer obj= new Integer(var);  //wrapping-autoboxing
		
		System.out.println(obj);
		//primitive to class object
		
		int i=obj;//unwrapping-autounboxing
	}
	
	
	

}
