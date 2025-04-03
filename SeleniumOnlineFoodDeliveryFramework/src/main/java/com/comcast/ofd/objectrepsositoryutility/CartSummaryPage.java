package com.comcast.ofd.objectrepsositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartSummaryPage {
	WebDriver driver;
	public CartSummaryPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="submit")
	private WebElement Submitbutton;
	public WebElement getSubmitbutton() {
		return Submitbutton;
	}
	
	
	
	

}
