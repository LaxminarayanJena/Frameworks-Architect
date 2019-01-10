package overriding;

public  class Child extends Parent{

	public void show()
	{
		System.out.println("chid show");
	}
	
	public void display()
	{
		
	}
	
	public static void add()
	{
		System.out.println("chid");
	}
	public static void main(String[] args) {
		Parent c = new Child();
		c.show();
		//c.display();
		c.add();
				
	}
}
