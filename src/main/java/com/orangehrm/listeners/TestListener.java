package com.orangehrm.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.orangehrm.base.BaseTest;
import com.orangehrm.utilities.Screenshot;

public class TestListener extends BaseTest implements ITestListener{

	@Override
	
	public void onTestStart(ITestResult result)
{
	test=extent.createTest(result.getMethod().getMethodName());
	
}
	@Override
	
	public void onTestSuccess(ITestResult result) 
		{
		test.log(Status.PASS, "Test Passed"+result.getMethod().getMethodName());
        }
	@Override
	public void onTestFailure(ITestResult result)
	{
		test.log(Status.FAIL,"Test Failed"+result.getMethod().getMethodName());
	   
		try {
			String screenshotpath=Screenshot.Capture(driver, result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	@Override
	
	public void onTestSkipped(ITestResult result)
	{
		test.log(Status.SKIP,"Test Failed"+result.getMethod().getMethodName());
	}
	
	@Override
	
	public void onStart(ITestContext context )
	{
	System.out.println("=============Test Suite Started==========="+context.getName());	
	}
	

	 @Override
	    public void onFinish(ITestContext context) {
	        extent.flush();   
		System.out.println("=============Test Suite Finish==========="+context.getName());	
	}
   }



