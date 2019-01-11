package multithreading;

public class ABC extends Thread {
	
	Home h;
	String name;
	
	ThreadLocal<String> threadLocal = new ThreadLocal<String>();
	
	static int i;
	public ABC(Home h,String name)
	{
		this.h=h;
		this.name=name;
	}
	
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
		this.h.print(this.name);
		}
	}

}
