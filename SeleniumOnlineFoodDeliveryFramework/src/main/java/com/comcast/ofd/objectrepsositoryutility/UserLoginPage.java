
package com.comcast.ofd.objectrepsositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.ofd.generic.webdriverutility.WebDriverUtlity;

public class UserLoginPage extends WebDriverUtlity
{
	 WebDriver driver;
	 public UserLoginPage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 

	//user user name
	 @FindBy(name="username")
	 private WebElement usernameEdit;
	 public WebElement getUsernameEdit() {
			return usernameEdit;
		}
	 
	//user password
	 @FindBy(name="password")
	 private WebElement passwordEdit;
	 public WebElement getPasswordEdit() {
			return passwordEdit;
		}
	 
	
	//user login button
	@FindBy(id="buttn")
	 private WebElement Loginbutton;
	public WebElement getLoginbutton() {
		return Loginbutton;
	}

	 
	 public void UserLogin(String username, String password) {
		 usernameEdit.sendKeys(username);
		 passwordEdit.sendKeys(password);
		 
	 }
 
	 
}
