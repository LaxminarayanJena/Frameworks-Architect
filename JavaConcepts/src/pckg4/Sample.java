package pckg4;

import pckg3.Test;

public class Sample extends Test {

	public static void main(String[] args) {
		
		/*inheritance - one class object will inherit other class properties
		extends, implements
		class a 
		
		*/
		Sample obj = new Sample();
		//System.out.println(obj.PrivateVariable); 
		//System.out.println(obj.defaultVariable);
		System.out.println(obj.protectedVariable);
		System.out.println(obj.publicVariable);


	}

}
