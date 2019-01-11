package multithreading;

public class ThreadDemo2 {

	public static void main(String[] args) {
		MyThreadUsingRunnable obj = new MyThreadUsingRunnable();
		Thread t1= new Thread(obj);
		t1.setName("First");
		t1.start();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("main thread " + Thread.currentThread().getName());
		}
	}

}
