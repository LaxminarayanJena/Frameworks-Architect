
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Gmail {
	public WebDriver driver=null;
	
	@Parameters("browser") //testng.xml
	@Test()
	public void GmailTest(String b) throws MalformedURLException, InterruptedException{
		System.out.println("Gmail " + b);
		// RemoteWebdriver
		DesiredCapabilities cap = null;
				
		if(b.equals("firefox")){
			cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox"); 
			cap.setPlatform(Platform.ANY);
		}else if (b.equals("chrome")){
			cap = DesiredCapabilities.chrome(); 
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
		}else if (b.equals("iexplore")){
			cap = DesiredCapabilities.internetExplorer(); 
			cap.setBrowserName("iexplore");
			cap.setPlatform(Platform.WINDOWS);
		}
		
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		
		
		driver.get("http://gmail.com");
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("abcd");
		Thread.sleep(3000);
		
		
		driver.quit();
		
	}
	
	
	
	
	
	
	
}
