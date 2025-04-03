package com.comcast.ofd.objectrepsositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAddToCartPage{
	WebDriver driver;
	public void AddToCartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	  
	@FindBy(xpath="(//input[@value='Add To Cart'])")
	private WebElement AddToCartbutton;
	public WebElement getAddToCartbutton() {
		return AddToCartbutton;
	}

	
	@FindBy(partialLinkText="Checkout")
	private WebElement Checkoutbutton;
	public WebElement getCheckoutbutton() {
		return Checkoutbutton;
	}

	
	
}
