package polymerphism;

public class overloading {
	
	public static void main(int a) { 
		
	}
	
	public static void main(String[] args) {
		overloading obj = new overloading();
		obj.add(3, 4);
		byte b1=10;
		byte b2=10;
		byte b3=10;
		obj.add(b1, b2, b3);
	}
	//ambuiguity error
	//duplicacy eror
	public void add(int a ,int b)
	{
		
	}
	
	public int add(int a ,int b, int c)
	{
		return 10;
		
	}
	
	public int add(float a ,int b, int c)
	{
		return 10;
		
	}
	
	public int add(byte a ,byte b, byte c)
	{
		return 10;
		
	}
	
	
	public void login(int mobileno ,String password)
	{
		
	}
	
	public void login(String username ,String password)
	{
		
	}

}
