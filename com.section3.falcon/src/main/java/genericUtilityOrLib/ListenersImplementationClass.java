package genericUtilityOrLib;


import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ListenersImplementationClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		Reporter.log("from this"+methodname+"execution successfull");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		Reporter.log("from this"+methodname+"execution successfull");
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		TakesScreenshot ts=(TakesScreenshot) BaseClass.driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\ScreenshotFolder\\"+methodname+".png");
		try {
			Files.copy(src, dest);
			
		}
		catch(IOException e){
			
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		Reporter.log(methodname+"exexution skip");
	}

	
	}
	
	


