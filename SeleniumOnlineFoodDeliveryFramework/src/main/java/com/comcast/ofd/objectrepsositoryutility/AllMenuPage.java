package com.comcast.ofd.objectrepsositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllMenuPage {
	WebDriver driver;
	public AllMenuPage(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);	
	}

	@FindBy(xpath="//a[contains(@class, 'btn-danger')]")
	private WebElement Deletebutton;
	public WebElement getDeletebutton() {
		return Deletebutton;
	}
	
	
}
