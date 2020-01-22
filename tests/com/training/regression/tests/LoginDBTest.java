package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.dataproviders.LoginDataProviders;
import com.training.generics.GenericMethods;
import com.training.generics.ScreenShot;
import com.training.pom.FinalTestCases;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginDBTest {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private FinalTestCases finaltest;
	private static Properties properties;
	private ScreenShot screenShot;
	private GenericMethods genericMethods; 
	
	
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
		genericMethods = new GenericMethods(driver); 
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}


	@Test(dataProvider = "db-inputs", dataProviderClass = LoginDataProviders.class)
	//TC68-To verify whether application displays details of added user as trainer by admin in database
	public void loginDBTest(String userName, String password, String newuserfrstname, String newuserlstname, String newuseremail, int newuserphoneno, String newusername, String newuserpwd, String  newuserprofile) {
		// for demonstration 
//		genericMethods.getElement("login", "id"); 
				
		loginPOM.sendUserName(userName);
		
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn();
		finaltest.AddUser();
		finaltest.AddFirstName(newuserfrstname);
		finaltest.AddLastName(newuserlstname);
		finaltest.EmailID(newuseremail);
		finaltest.UserPhonNo(newuserphoneno);
		finaltest.NewUserName(newusername);
		finaltest.NewUserPassowrd(newuserpwd);
		finaltest.SelectUserProfile(newuserprofile);
		finaltest.AddNewUser();
		//screenShot.captureScreenShot(userName);

	}

}