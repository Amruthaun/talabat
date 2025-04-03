package com.comcast.ofd.Admin;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.comcast.ofd.BaseTest.BaseClass;
import com.comcast.ofd.objectrepsositoryutility.AddRestaurantCategoryPage;
import com.comcast.ofd.objectrepsositoryutility.AdminHomePage;
import com.comcast.ofd.objectrepsositoryutility.AdminLoginPage;
import com.comcast.ofd.objectrepsositoryutility.AllMenuPage;
import com.comcast.ofd.objectrepsositoryutility.AllOrdersPage;
import com.comcast.ofd.objectrepsositoryutility.UserLoginPage;
import com.comcast.ofd.objectrepsositoryutility.ViewOrderPage;

public class AdminLogin extends BaseClass {
	
	@Test(groups="Smoke Test")
	
	public void AdminLogin() throws InterruptedException{
		WebDriver driver= new ChromeDriver();
		driver.get("http://49.249.28.218:8081/AppServer/Online_Food_Ordering_System/admin/");
		AdminLoginPage alp= new AdminLoginPage(driver);
		alp.AdminLogin("admin", "codeastro");
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement submitButton = alp.getSubmitbutton();
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", submitButton);
		submitButton.click();
		Thread.sleep(2000);
		AdminHomePage ahp= new AdminHomePage(driver);
		ahp.getSignout().click();
		  Thread.sleep(2000);
		  ahp.getLogoutdropdown().click();
		 
	}
	 
	@Test (groups="IntegrationTest")
	public void AddCateogry() throws InterruptedException {
		
		 int ran = jlib.getRandomNumber();
		WebDriver driver= new ChromeDriver();
		driver.get("http://49.249.28.218:8081/AppServer/Online_Food_Ordering_System/admin/");
		driver.manage().window().maximize();
		AdminLoginPage alp= new AdminLoginPage(driver);
		alp.AdminLogin("admin", "codeastro");
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement submitButton = alp.getSubmitbutton();
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", submitButton);
		submitButton.click(); 
		Thread.sleep(2000);
		AdminHomePage ahp= new AdminHomePage(driver);
		ahp.getRestaurants().click();
		Thread.sleep(2000);
		ahp.getAddCategorylink().click();
		AddRestaurantCategoryPage ac= new AddRestaurantCategoryPage(driver);
		ac.getAddcategorytext().sendKeys("Deserts"+ran);
		ac.getSavebutton().click();
		
		 ahp.getSignout().click();
		  Thread.sleep(2000);
		  ahp.getLogoutdropdown().click();
		 

		
		
	}
	
	@Test(groups="System Test")
	public void CreateResturant() throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://49.249.28.218:8081/AppServer/Online_Food_Ordering_System/admin/");
		driver.manage().window().maximize();
		AdminLoginPage alp= new AdminLoginPage(driver);
		alp.AdminLogin("admin", "codeastro");
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement submitButton = alp.getSubmitbutton();
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", submitButton);
		submitButton.click(); 
		Thread.sleep(2000);
		AdminHomePage ahp= new AdminHomePage(driver);
		ahp.getMenu().click();
		Thread.sleep(2000);
		ahp.getAllmenus().click();
		Thread.sleep(2000);
		AllMenuPage am= new AllMenuPage(driver);
		am.getDeletebutton().click();
		 ahp.getSignout().click();
		  Thread.sleep(2000);
		  ahp.getLogoutdropdown().click();
		 
	}
	
	@Test (groups="System Test")
	
	public void DeleteOrder() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://49.249.28.218:8081/AppServer/Online_Food_Ordering_System/admin/");
		driver.manage().window().maximize();
		AdminLoginPage alp= new AdminLoginPage(driver);
		alp.AdminLogin("admin", "codeastro");
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement submitButton = alp.getSubmitbutton();
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", submitButton);
		submitButton.click(); 
		Thread.sleep(2000);
		AdminHomePage ahp= new AdminHomePage(driver);
		ahp.getOrders().click();
		AllOrdersPage aop= new AllOrdersPage(driver);
		aop.getDeletebutton().click();
		Thread.sleep(3000);
		Alert ale= driver.switchTo().alert();
		Thread.sleep(2000);
		ale.accept();
		 ahp.getSignout().click(); 
		 Thread.sleep(2000);
		  ahp.getLogoutdropdown().click();
		 
			
	}
	
	
	@Test (groups="System Test")
	
	public void ViewOrderDetails() throws InterruptedException, IOException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://49.249.28.218:8081/AppServer/Online_Food_Ordering_System/admin/");
		driver.manage().window().maximize();
		AdminLoginPage alp= new AdminLoginPage(driver);
		alp.AdminLogin("admin", "codeastro");
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement submitButton = alp.getSubmitbutton();
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", submitButton);
		submitButton.click(); 
		Thread.sleep(2000);
		AdminHomePage ahp= new AdminHomePage(driver);
		ahp.getOrders().click();
		AllOrdersPage aop= new AllOrdersPage(driver);
		Thread.sleep(2000);
		
		aop.getEditButton().click();
		ViewOrderPage vop= new ViewOrderPage(driver);
		vop.getViewuserdetailsbutton().click();
		wlib.switchToTabOnUrl(driver, "Online_Food_Ordering_System/login.php");
		String USERNAME=flib.getDataFromPropertiesFile("Username"); 
		String  PASSWORD=flib.getDataFromPropertiesFile("Password");
	 UserLoginPage ulp= new UserLoginPage(driver);
		  ulp.UserLogin(USERNAME, PASSWORD);
		  ulp.getLoginbutton().click();
		  wlib.switchToTabOnUrl(driver, "Online_Food_Ordering_System/admin/view_order");
		  vop.getViewuserdetailsbutton().click();
		  wlib.switchToTabOnUrl(driver, "/admin/userprofile.");
	
		String title = driver.getTitle();
		Assert.assertEquals(title, "User Profile");
		vop.getClosewindow().click();
		wlib.switchToTabOnUrl(driver, "Online_Food_Ordering_System/admin/view_order");
		Thread.sleep(2000);
		
		  ahp.getSignout().click();
		  Thread.sleep(2000);
		  ahp.getLogoutdropdown().click();
		 

		
		
		
	}
	
	
	
	
	
	
	
}
