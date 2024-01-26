package com.SwagLab.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	

	WebDriver driver;
	
	
	public LogOutPage(WebDriver driver) {
	this.driver=driver;
    PageFactory.initElements( driver,this);
	
	}


	@FindBy(id="react-burger-menu-btn")
	private WebElement clic ;
	
	public void setClic() {
		clic.click();
	
	}
	
	
	@FindBy(id="logout_sidebar_link")
	private WebElement clicLog ;
public void setClicLog() {
		clicLog.click();
	}


@FindBy(xpath="//a[@id='about_sidebar_link']")

private WebElement about;


public void setClicAbout() {
	about.click();
}


}
