package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.FinalTestCases;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTestData {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private FinalTestCases finaltest;
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
		finaltest = new FinalTestCases(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test(dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
	//TC67 - To verify whether application allows admin to add multiple new user as a trainer by entering valid credentials in mandatory fields only
	public void loginDBTest(String FirstName, String LastName, String eMail, String Phone, String Login, String Password) 
	{
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn();
		finaltest.AddUser();
		finaltest.AddFirstName(FirstName);
		finaltest.AddLastName(LastName);
		finaltest.EmailID(eMail);
		finaltest.UserPhonNo(Phone);
		finaltest.NewUserName(Login);
		finaltest.NewUserPassowrd(Password);
		finaltest.AddNewUser();
		//screenShot.captureScreenShot(userName);

	}
	
	

}
