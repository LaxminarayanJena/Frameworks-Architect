package rough;

import utilities.ExcelReader;
import utilities.DataUtil;

public class CheckingRunModes {

	public static void main(String[] args) {
		
		//String suiteName= "CustomerSuite";
		String suiteName= "BankManagerSuite";
		boolean suiteRunmode=DataUtil.isSuiteRunnable(suiteName, new ExcelReader(System.getProperty("user.dir") +"\\src\\test\\resources\\testData\\Suite.xlsx"));

		System.out.println(suiteRunmode);
		
		
		String testCaseName= "AddCustomerTest";
		//String TestCaseName= "OpenAccountTest";
		boolean TestRunmode=DataUtil.isTestRunnable(testCaseName, new ExcelReader(System.getProperty("user.dir") +"\\src\\test\\resources\\testData\\" +suiteName+".xlsx"));

		System.out.println(TestRunmode);
		
		
	}
	

}
