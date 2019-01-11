package multithreading;

public class TestingThreadSyncIssue {

	public static void main(String[] args) {
		Home h= new Home();
		ABC  t1= new ABC(h, "sam");
		t1.start();
		t1.i=10;
		System.out.println("value of i  from thread 1 is : " + t1.i);
		t1.threadLocal.set("pol");
		System.out.println("printing from  second thread " + t1.threadLocal.get());
		
		ABC  t2= new ABC(h, "hari");
		t2.start();
		System.out.println("value of i  from thread 2 is : " + t2.i);
		System.out.println("printing from  second thread " + t2.threadLocal.get());
	}

}
