package com.comcast.ofd.objectrepsositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewOrderPage {
	WebDriver driver;
	
	public ViewOrderPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//button[text()='View User Detials']")
	private WebElement viewuserdetailsbutton;

	public WebElement getViewuserdetailsbutton() {
		return viewuserdetailsbutton;
	}
	
	@FindBy(name="Submit2")
	private WebElement closewindow;

	public WebElement getClosewindow() {
		return closewindow;
	}

}
