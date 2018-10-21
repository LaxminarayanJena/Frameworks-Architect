package rough;

import utilities.ExcelReader;
import utilities.TestUtil;

public class CheckingRunModes {

	public static void main(String[] args) {
		
		//String suiteName= "CustomerSuite";
		String suiteName= "BankManagerSuite";
		boolean suiteRunmode=TestUtil.isSuiteRunnable(suiteName, new ExcelReader(System.getProperty("user.dir") +"\\src\\test\\resources\\testData\\Suite.xlsx"));

		System.out.println(suiteRunmode);
		
		
		String testCaseName= "AddCustomerTest";
		//String TestCaseName= "OpenAccountTest";
		boolean TestRunmode=TestUtil.isTestRunnable(testCaseName, new ExcelReader(System.getProperty("user.dir") +"\\src\\test\\resources\\testData\\" +suiteName+".xlsx"));

		System.out.println(TestRunmode);
		
		
	}
	

}
