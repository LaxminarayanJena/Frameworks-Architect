package multithreading;

public class MyThread extends Thread {
	
	/*
	 * class-extends Thread-override run()-create instance of your thread class
	 * start()
	 * 
	 */
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("child thread "+Thread.currentThread().getName());
		}
	}

}
