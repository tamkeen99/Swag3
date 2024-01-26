package com.SwagLab.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabCheckOut {

	
	
	
	
	
WebDriver driver;
	
	
	public  SwagLabCheckOut(WebDriver driver) {
	this.driver=driver;
    PageFactory.initElements( driver,this);
	
	}


	@FindBy(id="checkout")
	private WebElement ch ;
	
	
	public void setCheck() {
		ch.click();
	}
	

	
}
