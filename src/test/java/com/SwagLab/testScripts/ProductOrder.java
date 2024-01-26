package com.SwagLab.testScripts;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SwagLab.generic.BaseClass;
import com.SwagLab.generic.FileLib;
import com.SwagLab.pom.SwagLabCheckOut;
import com.SwagLab.pom.SwagLabInfo;
import com.SwagLab.pom.SwagLabOverView;
import com.SwagLab.pom.SwagLabPage;
@Listeners(com.SwagLab.generic.ListernerImplementation.class)

public class ProductOrder extends BaseClass{
	
	@Test()
	
	public void productOrder() throws IOException, InterruptedException {
		
		
		SwagLabPage sp= new SwagLabPage(driver);
		sp.setAdd1();
		Thread.sleep(2000);
		sp.setAdd2();
		Thread.sleep(2000);
		sp.setAdd3();
		Thread.sleep(2000);
		
		sp.setAdd4();
		
		Thread.sleep(2000);
		
		sp.setAdd5();
		
		Thread.sleep(2000);
		
		
		sp.setAdd6();
		Thread.sleep(2000);
		sp.setCart();
		Thread.sleep(2000);
		SwagLabCheckOut sc= new SwagLabCheckOut(driver);
		sc.setCheck();
		
		
		
		
		FileLib fb= new FileLib();
		String firstn = fb.getPropertyFile("fname");
		
		String lastn = fb.getPropertyFile("Lastname");
		String postal = fb.getPropertyFile("zip");
		
		SwagLabInfo si= new SwagLabInfo(driver);
		
		si.setFistName(firstn);
		Thread.sleep(2000);
		si.setLastName(lastn);
		Thread.sleep(2000);
		si.setPostal(postal);
		Thread.sleep(2000);
		
		
		si.setContinue();
		
		Thread.sleep(2000);
		SwagLabOverView sv= new SwagLabOverView(driver);
		
		
		sv.setFinish();
		Thread.sleep(3000);
	
	}
	@Test()
	public void mroductCheck() {
	
		Reporter.log("ProductOrder class ka 2nd method",true);
	}
	
	

}
