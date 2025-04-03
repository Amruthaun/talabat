package com.comcast.ofd.objectrepsositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage {
	WebDriver driver;
	public AdminHomePage(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//img[@alt='user']")
	private WebElement signout;
	
	@FindBy(xpath="//a[@href='logout.php']")
	private WebElement Logoutdropdown;
	
	
	public WebElement getLogoutdropdown() {
		return Logoutdropdown;
	}

	@FindBy(xpath="//span[text()='Dashboard']")
	private WebElement Dashboard;
	
	@FindBy(xpath="//span[text()='Users']")
	private WebElement users;
	
	
	public WebElement getSignout() {
		return signout;
	}

	public WebElement getDashboard() {
		return Dashboard;
	}

	public WebElement getUsers() {
		return users;
	}

	public WebElement getRestaurants() {
		return restaurants;
	}

	public WebElement getMenu() {
		return menu;
	}

	public WebElement getAllmenus() {
		return allmenus;
	}

	public WebElement getAddmenu() {
		return Addmenu;
	}

	public WebElement getOrders() {
		return orders;
	}

	@FindBy(xpath="//span[text()='Restaurant']")
	private WebElement restaurants;
	
	
	@FindBy(xpath="//span[text()='Menu']")
	private WebElement menu;
	
	
	
	@FindBy(partialLinkText="All Menues")
	private WebElement allmenus;
	
	@FindBy(partialLinkText="Add Menu")
	private WebElement Addmenu;
	
	@FindBy(xpath="//span[text()='Orders']")
	private WebElement orders;
	
	
	
	@FindBy(partialLinkText="Add Category")
	private WebElement AddCategorylink;
	public WebElement getAddCategorylink() {
		return AddCategorylink;
	}
	
	
}
