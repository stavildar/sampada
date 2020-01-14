package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOM {
	
	public HomePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='dropdown-toggle']")
	private WebElement logout;
	
	@FindBy(xpath = "//a[@id='logout_button']")
	private WebElement logoutBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Edit profile')]")
	private WebElement EditProfileLnk;
	
	@FindBy(id= "profile_password0")
	private WebElement prflepassword;
	
	@FindBy(id= "password1")
	private WebElement Newprflepassword;
	
	@FindBy(id ="profile_password2")
	private WebElement Cnfrmpassword;
	
	@FindBy(id = "profile_apply_change" )
	private WebElement ApplyChgBtn;
	
	public void clickLogout()
	{
		this.logout.click();
	
	}
	
	public void clicklogoutBtn()
	{
		this.logoutBtn.click();
	}
	
	public void EditProfileLnk()
	{
		this.EditProfileLnk.click();
	
	}
	
	public void orgprflepassword(String orgpassword)
	{
		this.prflepassword.sendKeys(orgpassword);
	}
	public void newprflepassword(String orgpassword)
	{
		this.Newprflepassword.sendKeys(orgpassword);
	}
	public void Cnfrmpassword(String orgpassword)
	{
		this.Cnfrmpassword.sendKeys(orgpassword);
	}

	public void ApplyChgBtn()
	{
		this.ApplyChgBtn.click();
	
	}

}
