package com.comcast.ofd.objectrepsositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserHomePage {
	WebDriver driver;
	public UserHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText="Home ")
	private WebElement HomePage;
	
	@FindBy(partialLinkText="Restaurants ")
	private WebElement RestaurantsPage;
	
	public WebElement getHomePage() {
		return HomePage;
	}


	public WebElement getRestaurantsPage() {
		return RestaurantsPage;
	}


	public WebElement getMyordersPage() {
		return myordersPage;
	}


	public WebElement getLogoutButton() {
		return LogoutButton;
	}
	   

	
	@FindBy(partialLinkText="My Orders")
	private WebElement myordersPage;
	
	
	@FindBy(linkText="Logout")
	private WebElement LogoutButton;	
	
	@FindBy(xpath="//a[contains(text(),'Yorkshire Lamb Patties')]/../..//a[contains(text(),'Order Now')]")
	private WebElement ordernow;
	public WebElement getOrdernow() {
		return ordernow;
	}


	
}
