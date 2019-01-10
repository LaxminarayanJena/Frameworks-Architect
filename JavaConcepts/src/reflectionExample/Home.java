package reflectionExample;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Home {

	
	public static void main(String[] args) {
		Test t= new Test();
		Class clazz=t.getClass();
		System.out.println(clazz.getSimpleName());
		
		 Method[] arrayofmethods=clazz.getDeclaredMethods();
		 
		 clazz.getConstructors();//
		 
		 
		
		 System.out.println(arrayofmethods.length);//3
		 System.out.println(clazz.getMethods().length);//11
		 
		 for(Method m:arrayofmethods)
		 {
			 System.out.println(m.getName() + "-" + m.getReturnType());
			
			 Parameter[] parms=m.getParameters();
			 
			 for(Parameter param:parms)
			 {
				System.out.println(param.getName());
			}
		 }
		 
		 
		 /*
		  * @BeforeMethod
		  * public void beforeMethod(Method m){
		  * }
		  */
	}
}
