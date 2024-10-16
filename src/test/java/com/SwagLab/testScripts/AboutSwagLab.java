package com.SwagLab.testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SwagLab.generic.BaseClass;
import com.SwagLab.pom.LogOutPage;

@Listeners(com.SwagLab.generic.ListernerImplementation.class)

public class AboutSwagLab extends BaseClass{
	
	
	@Test(priority=0)
	
	public void aboutSwag() throws InterruptedException {
		
		
		

		LogOutPage lo= new LogOutPage(driver);
		Thread.sleep(2000);
		lo.setClic();
		
		
		
		lo.setClicAbout();
		
		driver.navigate().back();
		
		
	}
	
	

	
	
	

}
