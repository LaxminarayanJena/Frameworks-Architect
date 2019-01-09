package encapsulation;

public class Bank {

	public int accountNo=1234;
	private int pinNo=1234;
	private double balanceAmount=1000000;
	
	
	
	
	public int getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}


	public int getPinNo() {
		return pinNo;
	}


	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}


	public double getBalanceAmount() {
		return balanceAmount;
	}


	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}


	public void withDrawAmount(int accNo, int pin, int amount)
	{
		if(accNo==accountNo && pin==pinNo)
		{
			if(amount<=balanceAmount)
			{
				balanceAmount=balanceAmount-amount;
				System.out.println("amount withdrawl is" + amount);
			}
			else
			{
				System.out.println("transaction sucessfull");
			}
		}
		else
		{
			System.out.println("inavlid credentials");
		}
		
		
	}
	
	
	public void updatePin(int accNo,int oldPin,int newPin)
	{
		if(accNo==accountNo && oldPin==pinNo)
			
		{
			pinNo=newPin;
			System.out.println("pin changed sucessfully");
		}
		else
		{
			System.out.println("inavlid credentials");
		}
	}
	
	public double depositCash(int accNo,int pin,double amount)
	{
		if(accNo==accountNo && pin==pinNo)
		{
			balanceAmount=balanceAmount+amount;
		return balanceAmount;
		}
		else
		{
		}
		return balanceAmount;
		}
	}

