package com.comcast.ofd.User;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.comcast.ofd.BaseTest.BaseClass;
import com.comcast.ofd.generic.webdriverutility.JavaUtility;
import com.comcast.ofd.objectrepsositoryutility.UserAddToCartPage;
import com.comcast.ofd.objectrepsositoryutility.UserHomePage;
import com.comcast.ofd.objectrepsositoryutility.UserLoginPage;
import com.comcast.ofd.objectrepsositoryutility.UserRegistrationPage;
import com.comcast.ofd.objectrepsositoryutility.UserWelcomePage;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUser extends BaseClass {
	
	@Test
	
	public void CreateUser() throws EncryptedDocumentException, IOException, InterruptedException  {
		 String phoneNumber = jlib.generatePhoneNumber();
		 System.out.println(phoneNumber);
		 int ran = jlib.getRandomNumber();
		UserWelcomePage up=new UserWelcomePage(driver);
		Thread.sleep(3000);
		up.getRegisterlink().click();
		UserRegistrationPage urp= new UserRegistrationPage(driver);
		
		 String Username = elib.getDataFromExcel("sheet1", 1, 0);
		 urp.getUsername().sendKeys(Username);
		 
		 String Firstname= elib.getDataFromExcel("sheet1", 1, 1);
		 urp.getFirstname().sendKeys(Firstname);
		 
		 String Lastname= elib.getDataFromExcel("sheet1", 1, 2);
		 urp.getLastname().sendKeys(Lastname);
		 
		 
		 urp.getEmailid().sendKeys(Username+ran+"@gmail.com");
		 
		 String Password=elib.getDataFromExcel("sheet1", 1, 4);
		 urp.getPassword().sendKeys(Password);
		 urp.getConfirmpassword().sendKeys(Password);
		 urp.getPhonenumber().sendKeys(phoneNumber);
		String Address = elib.getDataFromExcel("sheet1", 1, 5);
		 urp.getDeliveryAddress().sendKeys(Address);
		 
		
	
	}
	
	
	@Test
	public void UserLogin() throws IOException, InterruptedException {
		UserWelcomePage uwp= new UserWelcomePage(driver);
		uwp.getLoginbuton().click();
		
		//String URL=flib.getDataFromPropertiesFile("Url"); 
		String USERNAME=flib.getDataFromPropertiesFile("Username"); 
		String  PASSWORD=flib.getDataFromPropertiesFile("Password");
	 UserLoginPage ulp= new UserLoginPage(driver);
		  ulp.UserLogin(USERNAME, PASSWORD);
		  ulp.getLoginbutton().click();
		  Thread.sleep(2000);
		  UserHomePage uhp= new UserHomePage(driver);
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		String xpath=("//a[contains(text(),'Yorkshire Lamb Patties')]/../..//a[contains(text(),'Order Now')]");
         WebElement orderNowLink = driver.findElement(By.xpath(xpath));
         js.executeScript("arguments[0].click();", orderNowLink);
         try {
             Thread.sleep(2000); // Just to wait for 2 seconds, you can use WebDriverWait for better synchronization
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
		 
	}
	
	@Test
	public void Placeorder() throws IOException, InterruptedException {
		UserWelcomePage uwp= new UserWelcomePage(driver);
		driver.manage().window().maximize();
		uwp.getLoginbuton().click();
 
		String USERNAME=flib.getDataFromPropertiesFile("Username"); 
		String  PASSWORD=flib.getDataFromPropertiesFile("Password");
	 UserLoginPage ulp= new UserLoginPage(driver);
		  ulp.UserLogin(USERNAME, PASSWORD);
		  ulp.getLoginbutton().click();
		  Thread.sleep(2000);
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		String xpath=("//a[contains(text(),'Yorkshire Lamb Patties')]/../..//a[contains(text(),'Order Now')]");
         WebElement orderNowLink = driver.findElement(By.xpath(xpath));
         js.executeScript("arguments[0].click();", orderNowLink);
         try {
             Thread.sleep(2000); // Just to wait for 2 seconds, you can use WebDriverWait for better synchronization
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         
         UserAddToCartPage uac= new UserAddToCartPage();
         //Actions action= new Actions(driver);
        // action.scrollToElement(uac.getAddToCartbutton()).build().perform();
         uac.getAddToCartbutton().click();
         Thread.sleep(2000);
         uac.getCheckoutbutton().click();
         
		
	}
	 
	
	
	
}
