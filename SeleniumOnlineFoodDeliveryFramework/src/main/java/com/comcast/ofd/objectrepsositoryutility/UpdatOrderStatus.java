package com.comcast.ofd.objectrepsositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdatOrderStatus {
	WebDriver driver;
	public void UpdateOrderStatus(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(name="update")
	private WebElement SubmitButton;
	
	@FindBy(name="Submit2")
	private WebElement ClosetheWindow;
	
	@FindBy(name="remark")
	private WebElement messagetextfield;
	
	
}
