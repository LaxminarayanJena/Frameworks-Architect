package multithreading;

public class Home {
	
	public synchronized void print(String name) 
	{
		System.out.println("good morning : ");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name);
	}

}
