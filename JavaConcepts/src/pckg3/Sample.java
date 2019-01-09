package pckg3;

public class Sample {

	public static void main(String[] args) {
		Test obj = new Test();
		//System.out.println(obj.PrivateVariable); /not accesible outside class
		System.out.println(obj.defaultVariable);
		System.out.println(obj.protectedVariable);
		System.out.println(obj.publicVariable);


	}

}
