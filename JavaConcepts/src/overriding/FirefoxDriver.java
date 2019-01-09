package overriding;

public class FirefoxDriver extends WebDriver{
	
	
	public void click()
	{
		System.out.println("clicking in ff");
	}
	
	public void Sendkeys()
	{
		System.out.println("typing in ff");
	}
}
