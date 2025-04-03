package com.comcast.ofd.objectrepsositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRestaurantCategoryPage {
	WebDriver driver;
	public  AddRestaurantCategoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(name="c_name")
	private WebElement addcategorytext;
	
	@FindBy(xpath="//input[@value='Save']")
	private WebElement savebutton;
	
	@FindBy(xpath="//div[contains(@class, 'alert-success')]")
			private WebElement SuccessMessage;
	
	
	public WebElement getAddcategorytext() {
		return addcategorytext;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}

	public WebElement getSuccessMessage() {
		return SuccessMessage;
	}
	
	

}
