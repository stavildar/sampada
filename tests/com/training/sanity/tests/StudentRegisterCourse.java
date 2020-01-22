package com.training.sanity.tests;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

public class StudentRegisterCourse {
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
//	@Test (priority =1)
//	//To verify whether application allows student to subscribe for the course & take the authored test
//	public void StudentSubscribe() throws InterruptedException
//	{
//	loginPOM.sendUserName("selenium");
//	loginPOM.sendPassword("mehadi");
//	loginPOM.clickLoginBtn();
//	homepom.CourseCataloglnk();
//	homepom.SearchCourse("Selenium_Final");
//	Thread.sleep(5000);
//	homepom.SearchClick();
//	Thread.sleep(5000);
//	homepom.testSelect("Selenium_Final");
//	Thread.sleep(5000);
//	homepom.subScribBtn();
//	homepom.testLink();
//	homepom.SelectExam("Mock Questions");
//	Thread.sleep(5000);
//	homepom.StartTest();
//	Thread.sleep(5000);
//	homepom.radioSelect("XML");
//	homepom.NextQuestion();
//	Thread.sleep(5000);
//	homepom.radioSelect("are commands that allow you to store values to a variable");
//	homepom.NextQuestion();
//	Thread.sleep(5000);
//	homepom.radioSelect("verifyTable");
//	homepom.NextQuestion();
//	Thread.sleep(5000);
//	homepom.radioSelect("display");
//	homepom.NextQuestion();
//	homepom.radioSelect("Grid");
//	homepom.saveButton();
//	
//	}
//	@Test (priority =2)
//	//To verify whether application allows student to subscribe for the course & take the authored assessment
//		public void StudentAssesment() throws InterruptedException
//		{
//			loginPOM.sendUserName("selenium");
//			loginPOM.sendPassword("mehadi");
//			loginPOM.clickLoginBtn();
//			homepom.CourseCataloglnk();
//			homepom.SearchCourse("Selenium_Final");
//			Thread.sleep(5000);
//			homepom.SearchClick();
//			Thread.sleep(5000);
//			homepom.testSelect("Selenium_Final");
//			Thread.sleep(5000);
//			homepom.subScribBtn();
//			homepom.SelectAssesment();
//			homepom.AssesmentTest("Mock Questions");
//			Thread.sleep(5000);
//			homepom.StartTest();
//			Thread.sleep(5000);
//			homepom.radioSelect("XML");
//			homepom.NextQuestion();
//			Thread.sleep(5000);
//			homepom.radioSelect("are commands that allow you to store values to a variable");
//			homepom.NextQuestion();
//			Thread.sleep(5000);
//			homepom.radioSelect("verifyTable");
//			homepom.NextQuestion();
//			Thread.sleep(5000);
//			homepom.radioSelect("display");
//			homepom.NextQuestion();
//			homepom.radioSelect("Grid");
//			homepom.saveButton();
//		}
//	
//	@Test (priority =3)
//	//TC043 -To verify whether application allows student to complete the assignments
//	public void UploadAssignment() throws InterruptedException
//		{
//		loginPOM.sendUserName("selenium");
//		loginPOM.sendPassword("mehadi");
//		loginPOM.clickLoginBtn();
//		homepom.CourseCataloglnk();
//		homepom.SearchCourse("Selenium_Final");
//		Thread.sleep(5000);
//		homepom.SearchClick();
//		Thread.sleep(5000);
//		homepom.testSelect("Selenium_Final");
//		Thread.sleep(5000);
//		homepom.subScribBtn();
//		homepom.AssignmentLink();
//		homepom.AssignmentName("Upload");
//		homepom.AssignmentUpload();
//		homepom.AssignmentUploadFile();
//		}
//	@Test (priority =4)
//	//TC044- TO verify whether application allows student to discuss in the forum
//	public void ForumReply() throws InterruptedException
//	{
//		loginPOM.sendUserName("selenium");
//		loginPOM.sendPassword("mehadi");
//		loginPOM.clickLoginBtn();
//		homepom.CourseCataloglnk();
//		homepom.SearchCourse("Selenium_Final");
//		Thread.sleep(5000);
//		homepom.SearchClick();
//		Thread.sleep(5000);
//		homepom.testSelect("Selenium_Final");
//		Thread.sleep(5000);
//		homepom.subScribBtn();
//		homepom.ForumLink("Selenium");
//	}
	@Test (priority =5)
	//TC045 - To verify whether application allows student to chat in group
	public void GroupChat() throws InterruptedException
	{
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn();
		homepom.AdminFunc("Selenium_Final");
		Thread.sleep(5000);
		homepom.AdminCourse("Selenium");
		Thread.sleep(5000);
		homepom.AdminGroup("Group");
		String ChatWindow = driver.getWindowHandle();
		homepom.ChatButtonClick();
		for(String ChatHandle : driver.getWindowHandles())
		{
			driver.switchTo().window(ChatHandle);
			
		}
		homepom.EnterChatMessage("Take Google Help");
		driver.switchTo().window(ChatWindow);
		//driver.close();
	}
}
	

