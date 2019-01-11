package multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread t1= new MyThread();
		t1.setName("First");
		t1.start();
		
		MyThread t2= new MyThread();
		t2.setName("Second");
		t2.start();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("main thread " + Thread.currentThread().getName());
		}
	}

}
