package rough;

import utilities.Constants;
import utilities.ExcelReader;

public class ReadingExcelData {

	public static void main(String[] args) {
		
		ExcelReader excel= new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\BankManagerSuite.xlsx");
		int rows=excel.getRowCount(Constants.DATA_SHEET);
		System.out.println("Total rows are: " + rows);
		
		String testName= "OpenAccountTest";	
		//String testName= "AddCustomerTest";	
		int testCaseRowNum=1;
		
		for(testCaseRowNum=1;testCaseRowNum<=rows;testCaseRowNum++)
		{
			String testCaseName= excel.getCellData(Constants.DATA_SHEET, 0, testCaseRowNum);
					
					if(testCaseName.equalsIgnoreCase(testName))
						break;
		}		
		System.out.println("Test Case starts from row num:" + testCaseRowNum);
		
		//Checking total rows in test case
		
		int dataStartRowNum= testCaseRowNum+2;
		int testrows=0;
		while(!excel.getCellData(Constants.DATA_SHEET, 0, dataStartRowNum+testrows).equals(""))
		{
			testrows++;

	}
		System.out.println("Total rows of data are :" + testrows);

		//Checking total cols in test case
		int testCols=0;
		int colStartColNum=testCaseRowNum+1;
		
		while(!excel.getCellData(Constants.DATA_SHEET, testCols, colStartColNum).equals(""))
		{
			testCols++;
		}
		System.out.println("Total cols are : " + testCols);
		
		//Printing data
		for(int rNum=dataStartRowNum;rNum<(dataStartRowNum+testrows);rNum++)
		{
			for(int cNum=0;cNum<testCols;cNum++)
			{
				System.out.println(excel.getCellData(Constants.DATA_SHEET, cNum, rNum));
			}
		}
}
	
}