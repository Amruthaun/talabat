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
	
	public WebElement getDeletebutton() {
		return Deletebutton;
	}


	public WebElement getEditButton() {
		return EditButton;
	}

	// for Delete Button
	@FindBy(xpath="//i[@style='font-size:16px']")
	private WebElement Deletebutton;
	
	
	//for Edit button
	@FindBy(xpath="//a[i[contains(@class, 'fa-edit')]]")
	//a[contains(@class, 'btn-info')]

	private WebElement EditButton;
	
	
	

}
