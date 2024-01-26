package com.SwagLab.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.SwagLab.pom.LogOutPage;
import com.SwagLab.pom.LoginPage;

public class BaseClass {


	static {
		System.setProperty("webdriver.chrome.driver", "/src/main/resources/driver/chromedriver.exe");
		
	}
		
	public static WebDriver driver;	
	
	
	

@BeforeTest
@Parameters({"browser"})
 public void openBrowser(String  fan) {
	if(fan.equalsIgnoreCase("firefox")) {
		
		driver=new FirefoxDriver();
	System.setProperty("geckodriver.chrome.driver", "./src/main/resources/driver/geckodriver.exe");
	}
	else if(fan.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	driver= new ChromeDriver();
	
	}
	
	
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
}

@BeforeMethod

public void logIn() throws IOException, InterruptedException {
	
	FileLib f= new FileLib();
	String acurl = f.getPropertyFile("url");
	String acuser = f.getPropertyFile("user");
	String acpass = f.getPropertyFile("pass");
	
	driver.get(acurl);
	LoginPage l= new LoginPage(driver);
	l.setUser(acuser);
	l.setPass(acpass);
     l.setLog();
	
}


@AfterMethod
 public void logOut() throws InterruptedException {
	
	LogOutPage lo= new LogOutPage(driver);
	Thread.sleep(2000);
	lo.setClic();
	Thread.sleep(2000);
	lo.setClicLog();
	
	
	
}

@AfterClass
public void closeBrowser() {
	
	driver.quit();
	
	
}


}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      