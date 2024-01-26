package com.SwagLab.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabPage {

	

	WebDriver driver;
	
	
	public  SwagLabPage(WebDriver driver) {
	this.driver=driver;
    PageFactory.initElements( driver,this);
	
	}


	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement add1 ;
	
	
	public void setAdd1() {
		add1.click();
	}
	
	
	

	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	private WebElement add2 ;
	
	
	public void setAdd2() {
		add2.click();
	}
	
	
	
	
	
	
	


	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement add3 ;
	
	
	public void setAdd3() {
		add3.click();
	}	
	
	
	
	

	@FindBy(id="add-to-cart-sauce-labs-fleece-jacket")
	private WebElement add4;
	
	
	public void setAdd4() {
		add4.click();
	}	
	
	
	
	
	

	@FindBy(id="add-to-cart-sauce-labs-onesie")
	private WebElement add5 ;
	
	
	public void setAdd5() {
		add5.click();
	}	
	
	
	@FindBy(id="add-to-cart-test.allthethings()-t-shirt-(red)")
	private WebElement add6 ;
	
	
	public void setAdd6() {
		add6.click();
	}	
	
	
	
	
	
	
	@FindBy(className="shopping_cart_link")
	private WebElement cart ;
	
	
	public void setCart() {
		cart.click();
	}	
	
}
