package Listeners_study;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listener implements ITestListener


{
	
	
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("Test Passed Successful",true);
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("Test case failed",true);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("Test case skipped",true);
	}
	
	
	
	

}
