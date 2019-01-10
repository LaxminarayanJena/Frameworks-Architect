package interfaceExamples;

public class Child1 extends ParentClass1 implements Parent1,Parent2 {

	/*
	@Override
	public void show() {
		System.out.println("child show");
		
	}
	
	*/
	public static void main(String[] args) {
		Parent2 obj = new Child1();
			obj.show();
			
	}

}
