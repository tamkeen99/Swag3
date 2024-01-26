package com.SwagLab.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabOverView {
	


WebDriver driver;
	
	
	public  SwagLabOverView(WebDriver driver) {
	this.driver=driver;
    PageFactory.initElements( driver,this);
	
	}

	

	@FindBy(id="finish")
	private WebElement fin ;
	
	
	public void setFinish() {
	fin.click();
	
	}
	
	
	

}
