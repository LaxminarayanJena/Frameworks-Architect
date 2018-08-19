package com.ddf.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.ddf.base.TestBase;
import com.ddf.utilities.TestUtil;
import com.relevantcodes.extentreports.LogStatus;

public class CustomListeners extends TestBase implements ITestListener {

	public void onFinish(ITestContext arg0) {
		
		
	}

	public void onStart(ITestContext arg0) {
		
		test= rep.startTest(arg0.getName().toUpperCase());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}

	public void onTestFailure(ITestResult arg0) {
		
		System.setProperty("org.uncommons.reportng.escape-output","false");	
		try {
			TestUtil.captureScreenshot();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		test.log(LogStatus.FAIL, arg0.getName().toUpperCase()+"Failed with exception:"+arg0.getThrowable());
		test.log(LogStatus.FAIL, test.addScreenCapture(TestUtil.screenshotName));
		Reporter.log("Click to see screenshot");
		//Reporter.log("<a target=\"_blank\" href=\"D:\\download.jpg\">Screenshot</a>");
		Reporter.log("<a target=\"_blank\" href="+TestUtil.screenshotName+">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\" href="+TestUtil.screenshotName+"><img src="+TestUtil.screenshotName+" height=200 width=200></img></a>");
		rep.endTest(test);
		rep.flush();
		
	}

	public void onTestSkipped(ITestResult arg0) {
		
		
	}

	public void onTestStart(ITestResult arg0) {
		
		
	}

	public void onTestSuccess(ITestResult arg0) {
		
		test.log(LogStatus.PASS, arg0.getName().toUpperCase()+"PASS");
		rep.endTest(test);
		rep.flush();
	}

}
