package com.SwagLab.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabInfo {

	
	
	
	

WebDriver driver;
	
	
	public  SwagLabInfo(WebDriver driver) {
	this.driver=driver;
    PageFactory.initElements( driver,this);
	
	}


	@FindBy(id="first-name")
	private WebElement fn ;
	
	
	public void setFistName(String fname) {
	fn.sendKeys(fname);
	
	}
	

	@FindBy(id="last-name")
	private WebElement ln ;
	
	
	public void setLastName(String lname) {
	ln.sendKeys(lname);
	
	}
	

	@FindBy(id="postal-code")
	private WebElement pstl ;
	
	
	public void setPostal(String pname) {
pstl.sendKeys(pname);


	}

	@FindBy(id="continue")
	private WebElement cont;
	
	public void setContinue() {
		cont.click();
	}
	
	
}
