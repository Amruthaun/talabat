package com.comcast.ofd.objectrepsositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminViewOrderPage {
	WebDriver driver;
	public void ViewOrder(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//button[text()='View User Detials']")
	private WebElement ViewOrderDetails;
	
	
	@FindBy(xpath="//button[text()='Update Order Status']")
	private WebElement UpdateOrderStatus;
	
	
	
}
