package polymerphism;

public class HSBC extends RBI{

	public static void main(String[] args) {
		HSBC  obj = new HSBC();
		System.out.println(obj.getCarloanroi());	
	}
	
	
	public double getCarloanroi()
	{
		return 30.7;
	}
	
	public HSBC getObject()
	{
		HSBC  obj = new HSBC();
		return obj;
	}
	

}
