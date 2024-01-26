package com.SwagLab.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {

	
	
	WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
	this.driver=driver;
    PageFactory.initElements( driver,this);
	
	}

	@FindBy(id="user-name")
	private WebElement user;
	
	public void setUser(String user1) {
		user.sendKeys(user1);
		
		
	}
	
	@FindBy(id="password")
	private WebElement password;
	
	public void setPass(String pass1) {
		password.sendKeys(pass1);
	
		
	}
	
	@FindBy(id="login-button")
	private WebElement logbutton;
	
	public void setLog() {
		 logbutton.click();
	
}
}