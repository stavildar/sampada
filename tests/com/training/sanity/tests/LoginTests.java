package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.HomePOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private HomePOM homepom;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		homepom = new HomePOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	//TC016 -- To verify whether application allows student to get log out from the application
	@Test (priority=1)
	public void validStudentLoginTest() {
		loginPOM.sendUserName("selenium");
		loginPOM.sendPassword("selenium");
		screenShot.captureScreenShot("TC016Username_Password");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("TC016UserLoggedIn");
		homepom.clickLogout();
		screenShot.captureScreenShot("TC016UserLogoutButton");
		homepom.clicklogoutBtn();
		screenShot.captureScreenShot("TC016Userloggedout");
	}
	//TC017 -- To verify whether application allows admin to get login into application
	@Test (priority=2)
	public void validAdminLoginTest() {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		screenShot.captureScreenShot("TC017Login");
		loginPOM.clickLoginBtn(); 
	screenShot.captureScreenShot("TC017Adminloginsuccesful");
	}
	//TC018  -- To verify whether application allows student to change the password in Edit Profile page
	@Test (priority=3)
	public void validEditProfile() throws InterruptedException {
		loginPOM.sendUserName("selenium");
		loginPOM.sendPassword("selenium");
		screenShot.captureScreenShot("TC018Username_Password");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("TC018UserLoggedIn");
		homepom.EditProfileLnk();
		screenShot.captureScreenShot("TC018ClickEditProfile");
		Thread.sleep(5000);
		homepom.orgprflepassword("selenium");
		screenShot.captureScreenShot("TC018Oldpwd");
		Thread.sleep(5000);
		homepom.newprflepassword("mehadi");
		screenShot.captureScreenShot("TC018Newpwd");
		Thread.sleep(5000);
		homepom.Cnfrmpassword("mehadi");
		homepom.ApplyChgBtn();
		screenShot.captureScreenShot("TC018Applychgclick");

	}
	
	
}
