package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalTestCases {
	public FinalTestCases(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'Add a user')]")
	private WebElement AddUserLink;
	@FindBy(xpath = "//input[@id='firstname']")
	private WebElement FirstName;
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement LastName;
	@FindBy(xpath ="//input[@id='email']")
	private WebElement emailID;
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phoneNo;
	@FindBy(xpath="//input[@id='username']")
	private WebElement NewName;
	@FindBy(xpath = "//div[@id='password-group']//input[@type='radio' and @value='0']")
	private WebElement SelectEnterPassword;
	@FindBy(xpath ="//input[@id='password']")
	private WebElement NewPassword;
	@FindBy(xpath ="//button[@name='submit']")
	private WebElement AddUser;
	@FindBy(xpath="//div[@class = 'filter-option-inner-inner']")
	private WebElement UserProfile;
	
	
	public void AddUser()
	{
		this.AddUserLink.click();
	}
	
	public void AddFirstName(String AddAnotherUser)
	{
		this.FirstName.sendKeys(AddAnotherUser);
	}
	
	public void AddLastName(String AddAnotherLastName)
	{
		this.LastName.sendKeys(AddAnotherLastName);
		
	}
	public void EmailID(String UserEmailID)
	{
		this.emailID.sendKeys(UserEmailID);
	}
	public void UserPhonNo(String Number)
	{
		this.phoneNo.sendKeys(Number);
	}
	
	public void NewUserName(String UserNewName)
	{
		this.NewName.sendKeys(UserNewName);
	}
	
	public void NewUserPassowrd(String UserNewPassword)
	{	
		this.SelectEnterPassword.click();
		this.NewPassword.sendKeys(UserNewPassword);
	}
	 public void AddNewUser()
	 {
		 this.AddUser.click();
	 }
	 public void SelectUserProfile(String ProfileName)
	 {
		 this.UserProfile.sendKeys(ProfileName);
	 }
	
}

