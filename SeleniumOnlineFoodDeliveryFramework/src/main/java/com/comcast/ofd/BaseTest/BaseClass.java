package com.comcast.ofd.BaseTest;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.genericfileutility.ExcelUtility;
import com.comcast.crm.genericfileutility.FileUtility;
import com.comcast.ofd.generic.webdriverutility.JavaUtility;
import com.comcast.ofd.objectrepsositoryutility.UserHomePage;

public class BaseClass {
	public JavaUtility jlib= new JavaUtility();
	public ExcelUtility elib=new ExcelUtility();
	public FileUtility flib= new FileUtility();
	public WebDriverUtility wlib=new WebDriverUtility();

	public WebDriver driver= null;
	public static WebDriver sdriver= null;

   
 
	@BeforeSuite  (groups={"Smoke Test", "Regression Test"})
		public void congifgBS() throws Throwable {
		System.out.println("===connect to the DB====");
	}

	
	//@Parameters("BROWSER")
	@BeforeClass (groups={"Smoke Test", "Regression Test"})
		public void configBC() throws Throwable {
			System.out.println("==Launch the browser==");
			String BROWSER=flib.getDataFromPropertiesFile("Browser");
		//	String BROWSER=browser;
			if(BROWSER.equals("chrome")) {
				driver= new ChromeDriver();
			}else if(BROWSER.equals("firefox")) {
					driver= new FirefoxDriver();
				}else if(BROWSER.equals("edge")) {
					driver= new EdgeDriver();
				}
				else {
					driver= new ChromeDriver();
				}
			sdriver= driver;
			UtilityClassObject.setDriver(driver);
		}
		
	@BeforeMethod (groups={"Smoke Test", "Regression Test"})
	public void configBM() throws IOException {
		System.out.println("===Login===");
		String URL = flib.getDataFromPropertiesFile("Url");
		driver.get(URL);
		//String USERNAME = flib.getDataFromPropertiesFile("Username");
		//String PASSWORD = flib.getDataFromPropertiesFile("Password");
		

	}
	
	
	@AfterMethod  (groups={"Smoke Test", "Regression Test"})
	public void configAM() {
		System.out.println("===Logout===");
		UserHomePage hp= new UserHomePage(driver);
		hp.getLogoutButton();
		
		
	}
	

	@AfterClass  (groups={"Smoke Test", "Regression Test"})
	public void configAC() {
		System.out.println("==close the browser==");
		//driver.quit();
		}
	
	
	@AfterSuite  (groups={"Smoke Test", "Regression Test"})
	public void congifgAS() throws SQLException {
	System.out.println("==close the connection====");
	
}


}
