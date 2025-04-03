package com.comcast.ofd.objectrepsositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllOrdersPage {
	WebDriver driver;
	public AllOrdersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// for Delete Button
	@FindBy(xpath="//i[@style='font-size:16px']")
	private WebElement Deletebutton;
	
	
	//for Edit button
	@FindBy(xpath="(//*[contains(@class, 'btn-info') and contains(@class, 'btn-flat')])[5]")
	private WebElement EditButton;
	
	
	

}
