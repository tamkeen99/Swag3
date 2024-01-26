package com.SwagLab.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernerImplementation extends BaseClass implements ITestListener {


	@Override
	public void onTestFailure(ITestResult result) {
	String data= result.getName();
	TakesScreenshot t= (TakesScreenshot)driver;
	File fs=t.getScreenshotAs(OutputType.FILE);
	File fd= new File(".//Screenshot//"+data+".png");
	try {
		
FileUtils.copyFile(fs, fd);
	}
	
	catch(IOException e) {
		
		System.out.println(e);
	}
	
	}


	
	
	
	
	
}
