import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTesting {

	
	@Parameters("browser") 
	@Test
	public void doLogin(String b) throws InterruptedException {
		
		Date d= new Date();
		System.out.println("Executing login Test for :"+b+d.toString());
		Thread.sleep(2000);
	}

}
