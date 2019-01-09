package encapsulation;

public class ATM {

	public static void main(String[] args) {
		Bank obj = new Bank();
		//obj.pinNo=12345;
		obj.updatePin(1234, 1234, 12345);
		obj.withDrawAmount(1234, 12345, 1000);
		

	}

}
