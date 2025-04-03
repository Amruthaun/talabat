package com.comcast.ofd.Admin;

import static org.testng.Assert.assertEquals;

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

public class AdminLogin extends BaseClass {
	
	@Test
	
	public void AdminLogin(){
		WebDriver driver= new ChromeDriver();
		driver.get("http://49.249.28.218:8081/AppServer/Online_Food_Ordering_System/admin/");
		AdminLoginPage alp= new AdminLoginPage(driver);
		alp.AdminLogin("admin", "codeastro");
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement submitButton = alp.getSubmitbutton();
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", submitButton);
		submitButton.click();

	}
	 
	@Test
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
	
	@Test
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
	
	
	
	
	
}
