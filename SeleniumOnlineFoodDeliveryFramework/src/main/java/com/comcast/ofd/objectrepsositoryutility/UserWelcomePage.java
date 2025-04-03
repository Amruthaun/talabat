package com.comcast.ofd.objectrepsositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserWelcomePage {
	WebDriver driver;
	public UserWelcomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(partialLinkText="Login")
	private WebElement loginbuton;
	
	@FindBy(partialLinkText="Restaurants ")
	private WebElement Restaurantslink;
	
	@FindBy(partialLinkText="Home")
	private WebElement Homelink;
	
	@FindBy(linkText="Register")
	private WebElement registerlink;
	
	public WebElement getLoginbuton() {
		return loginbuton;
	}

	public WebElement getRestaurantslink() {
		return Restaurantslink;
	}

	public WebElement getHomelink() {
		return Homelink;
	}

	public WebElement getRegisterlink() {
		return registerlink;
	}

	public WebElement getOrdernowbutton() {
		return ordernowbutton;
	}

	@FindBy(xpath="//a[text()='Order Now']")
	private WebElement ordernowbutton;
	
	
}
