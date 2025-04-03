package com.comcast.ofd.objectrepsositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserRegistrationPage {
	WebDriver driver;
	public UserRegistrationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="example-text-input")
	private WebElement username;
	
	@FindBy(name="firstname")
	private WebElement firstname;
	
	@FindBy(name="lastname")
	private WebElement lastname;
	
	@FindBy(id="exampleInputEmail1")
	private WebElement emailid;
	
	@FindBy(id="example-tel-input-3")
	private WebElement  phonenumber;
	
	@FindBy(id="exampleInputPassword1")
	private WebElement password;
	
	public WebElement getUsername() {
		return username;
	}


	public WebElement getFirstname() {
		return firstname;
	}


	public WebElement getLastname() {
		return lastname;
	}


	public WebElement getEmailid() {
		return emailid;
	}


	public WebElement getPhonenumber() {
		return phonenumber;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getConfirmpassword() {
		return confirmpassword;
	}


	public WebElement getDeliveryAddress() {
		return DeliveryAddress;
	}


	public WebElement getRegister() {
		return register;
	}


	@FindBy(id="exampleInputPassword2")
	private WebElement confirmpassword;
	
	
	@FindBy(id="exampleTextarea")
	private WebElement DeliveryAddress;
	
	
	@FindBy(name="submit")
	private WebElement register;
	
	
	
}
