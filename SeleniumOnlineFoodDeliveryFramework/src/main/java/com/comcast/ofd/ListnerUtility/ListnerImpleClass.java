package com.comcast.ofd.ListnerUtility;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.comcast.ofd.BaseTest.BaseClass;
import com.comcast.ofd.generic.webdriverutility.UtilityClassObject;


public class ListnerImpleClass  implements ITestListener,ISuiteListener {
	@Override
	public void onFinish(ISuite suite) {
		System.out.println("Report BackUp");
	}
	public ExtentReports report;
	// will not work properly in parallel execution , without the thread 
	public static ExtentTest test ;
	
	
	
	@Override
	public void onStart(ISuite suite) {
	System.out.println("Report configuration");
	String time = new Date().toString().replace(" ", "_").replace(":","_");

	ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReport/report"+time+".html");
	spark.config().setDocumentTitle("CRM Test Suite Results");
	spark.config().setReportName("CRM Report");
	spark.config().setTheme(Theme.DARK);
	// add environment information and create test
	 report = new ExtentReports();
	report.attachReporter(spark);
	report.setSystemInfo("OS", "Windows-10");
	report.setSystemInfo("BROWSER", "CHROME-100");	
	
}
	

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Report Backup");
		report.flush();
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String TestName = result.getMethod().getMethodName();
	
		TakesScreenshot eDriver=(TakesScreenshot)BaseClass.sdriver;
		String filepath= eDriver.getScreenshotAs(OutputType.BASE64);
		String time = new Date().toString().replace(" ", "_").replace(":","_");
		test.addScreenCaptureFromBase64String(filepath, TestName+"_"+time);
		 test.log(Status.FAIL,result.getMethod().getMethodName()+"==FAILED==");

		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ITestListener.super.onTestSkipped(result);
	} 

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("===="+result.getMethod().getMethodName()+"==Start==");
		 test = report.createTest(result.getMethod().getMethodName());
		 UtilityClassObject.setTest(test);
		 test.log(Status.INFO,result.getMethod().getMethodName()+"==Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("===="+result.getMethod().getMethodName()+"==End==");
		 test.log(Status.PASS,result.getMethod().getMethodName()+"==Completed===");
	}


}
