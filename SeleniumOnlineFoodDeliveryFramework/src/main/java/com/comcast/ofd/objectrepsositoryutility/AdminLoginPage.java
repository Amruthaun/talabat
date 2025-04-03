package com.comcast.ofd.objectrepsositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.ofd.generic.webdriverutility.WebDriverUtlity;

public class AdminLoginPage extends WebDriverUtlity{
	
	WebDriver driver;
	public AdminLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	//Admin page username
	@FindBy(name="username")
	private WebElement usernameEdt;
	public WebElement getUsernameEdt() {
		return usernameEdt;
	}
	
	
	//Admin page password
	@FindBy(name="password")
	private WebElement passwordEdt;
	public WebElement getPassword() {
		return passwordEdt;
	}
	
	
	//Admin page submit button
	
	@FindBy(name="submit")
	private WebElement submitbutton;
	public WebElement getSubmitbutton() {
		return submitbutton;
	}

	//Admin login Method
	public void AdminLogin(String username,String password) {
		usernameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		//submitbutton.click();
		
	}

}
