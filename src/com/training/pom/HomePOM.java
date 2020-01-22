package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
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
	
	@FindBy(xpath = "//a[contains(text(),'Course catalog')]")
	private WebElement CourseCatalog;
	
	@FindBy(xpath = "//input[@name='search_term']")
	private WebElement SearchCourse;
		
	@FindBy(xpath = "//div[@class='input-group']//button[1]")
	private WebElement Srchclcik;
	
	@FindBy(xpath  = "//h4/a")
	private WebElement testSelect;
	
		
	@FindBy(xpath = "//a[@class='btn btn-lg btn-success btn-block']")
	private WebElement subScribBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Tests')]")
	private WebElement TestLink;
	
@FindBy(xpath ="//table[@class = 'table table-striped table-hover']/tbody/tr/td")
	private WebElement selectexam;

@FindBy(xpath = "//a[@class='btn btn-success btn-large']")
private WebElement startTestBtn;

@FindBy(xpath = "//p")
private WebElement radioBtn;

@FindBy(xpath = "//button[@name='save_now']")
private WebElement nxtQuestnBtn;

@FindBy(xpath = "//button[@name='save_now']")
private WebElement saveBtn;

@FindBy(xpath = "//span[@class = 'score_exercise']")
private WebElement resultDisp;

@FindBy(xpath="//a[contains(text(),'Assessments')]")
private WebElement clickAssesment;

@FindBy(xpath ="//table[@class='table table-bordered data_table']/tbody/tr[2]/td[2]/a")
private WebElement AssesTest;

@FindBy(xpath = "//a[contains(text(),'Assignments')]")
private WebElement AssignLink;
@FindBy(xpath ="//table[@id='workList']/tbody/tr[2]/td[2]/a")
private WebElement AssignName;
@FindBy(xpath = "//a[@class='btn-toolbar']")
private WebElement UploadBtn;
@FindBy(xpath = "//a[@id='tabs2']")
private WebElement UploadSimpleFile;
@FindBy(xpath ="//input[@id='file_upload']")
private WebElement UploadSimpleTitle;
@FindBy(xpath = "//input[@id='form-work_file']")
private WebElement ChoseFile;
@FindBy(xpath = "//button[@id='form-work_submitWork']")
private WebElement UploadFileBtn;
@FindBy(xpath = "//a[contains(text(),'Forums')]")
private WebElement ForumClick;
@FindBy(xpath = "//div[@class = 'col-xs-8 col-md-9']/h3/a")
private WebElement ForumSelect;
@FindBy(xpath = "//div[@class = 'col-md-10']/h3/a")
private WebElement ForumReplySelect;
@FindBy(xpath = "//input[@id='thread_post_title']")
private WebElement ForumTitle;
@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
private WebElement ForumTextReply;
@FindBy(xpath = "//button[@id='thread_SubmitPost']")
private WebElement ForumReplyButton;
@FindBy(xpath="//a[contains(text(),'Groups')]")
private WebElement GroupClick;
@FindBy(xpath ="//table[@class='table table-bordered data_table']/tbody/tr[2]/td/a")
private WebElement GroupName;
@FindBy(xpath ="//li/a/img[@title='Chat']")
private WebElement ChatButton;
@FindBy(xpath ="//div[@class='panel panel-default block-admin-courses']//div[@class='panel-body']//div//input[@name='keyword']")
private WebElement AdminCourSeSearch;
@FindBy(xpath ="//div[@id='tabs-2']//div[@class='panel-body']//button[1]")
private WebElement AdminSrchButton;
@FindBy(xpath ="//td[@class='title']/a")
private WebElement CourseSelect;
@FindBy(xpath ="//ul[@class='nav nav-pills']/li[7]/a")
private WebElement AdminChatMessage;
@FindBy(xpath="//div[@class='col-sm-9']/div[@class='emoji-wysiwyg-editor']")
private WebElement ChatEnterMessage;
@FindBy(xpath="//button[@id='chat-send-message']")
private WebElement SendChatMessaegBtn;

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
	
	public void CourseCataloglnk()
	{
		this.CourseCatalog.click();
	}
	
	public void SearchCourse(String CourseName)
	{
		this.SearchCourse.sendKeys(CourseName);
		
	}
	
	public void SearchClick()
	{
		this.Srchclcik.click();
	}
	
	
	public void subScribBtn()
	{
		this.subScribBtn.click();
	}
	
	public void TestLnk()
	{
		this.TestLink.click();
				
	}
	
	public void testSelect(String testName)
	{
		//String testName = "Testing_Classes";
		this.testSelect.findElement(By.xpath("//h4/a[@title = '"+testName+ "']")).click();
		
		
	}
	
	public void testLink()
	{
		this.TestLink.click();
	}
	
public void SelectExam(String eXamName)
{
	this.selectexam.findElement(By.xpath("//table[@class = 'table table-striped table-hover']/tbody/tr/td/a[contains(text(),'"+eXamName+"')]")).click();
}

public void StartTest()
{
	this.startTestBtn.click();
};

public void radioSelect(String AnswerOpt)
{ 
	this.radioBtn.findElement(By.xpath("//input[@type='radio']/following-sibling::p[contains(text(),'"+AnswerOpt+"')]")).click();
	}

public void NextQuestion()
{
	this.nxtQuestnBtn.click();
}

public void saveButton()
{
	this.saveBtn.click();
	
	System.out.println("Result is:" +resultDisp.getText());
}

public void SelectAssesment()
{
	this.clickAssesment.click();
}

public void AssesmentTest(String AssesExamName)
{
	this.AssesTest.findElement(By.xpath("//table[@class='table table-bordered data_table']/tbody/tr[2]/td[2]/a[contains(text(),'"+AssesExamName+"')]")).click();

}

public void AssignmentLink()
{
	this.AssignLink.click();
}

public void AssignmentName(String NameOfAssign)
{
	this.AssignName.findElement(By.xpath("//table[@id='workList']/tbody/tr[2]/td[2]/a[contains(text(),'"+NameOfAssign+"')]")).click();
}

public void AssignmentUpload()
{
	this.UploadBtn.click();
}
public void AssignmentUploadFile()
{
	this.UploadSimpleFile.click();
	this.UploadSimpleTitle.sendKeys("Test File");
	//this.ChoseFile.click();
	this.ChoseFile.sendKeys("C:\\Users\\SampadaTavildar\\Desktop\\Training\\Project\\UploadFile.txt");
	this.UploadFileBtn.click();
}
public void ForumLink(String ForumName)
{
	this.ForumClick.click();
	this.ForumSelect.findElement(By.xpath("//div[@class = 'col-xs-8 col-md-9']/h3/a[contains(text(),'"+ForumName+"')]")).click();
	this.ForumReplySelect.findElement(By.xpath("//div[@class = 'col-md-10']/h3/a[contains(text(),'"+ForumName+"')]")).click();
	this.ForumTitle.sendKeys("Test");
	this.ForumTextReply.click();
	this.ForumTextReply.sendKeys("take google help");
	//this.ForumReplyButton.click();
}

public void GroupChat(String NameOfGroup)
{
	this.GroupClick.click();
	this.GroupName.findElement(By.xpath("//table[@class='table table-bordered data_table']/tbody/tr[2]/td/a[contains(text(),'"+NameOfGroup+"')]")).click();
	
}
public void ChatButtonClick()
{
	this.ChatButton.click();
}

public void AdminFunc(String AdminCourseName)
{
	this.AdminCourSeSearch.sendKeys(AdminCourseName);
	this.AdminSrchButton.click();
}
public void AdminCourse(String NameOfCourse)
{
	this.CourseSelect.findElement(By.xpath("//td[@class='title']/a[contains(text(),'"+NameOfCourse+"')]")).click();
	this.GroupClick.click();
}

public void AdminGroup(String AdminGroupName)
{
	this.GroupName.findElement(By.xpath("//table[@class='table table-bordered data_table']/tbody/tr[2]/td/a[contains(text(),'"+AdminGroupName+"')]")).click();
	this.AdminChatMessage.click();
	}

public void EnterChatMessage(String ChatMessage)
{
	this.ChatEnterMessage.sendKeys(ChatMessage);
	this.SendChatMessaegBtn.click();
}

}


