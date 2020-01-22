package com.training.bean;

public class LoginBean {
	private String userName;
	private String password;
	private String newuserfrstname;
	private String newuserlstname;
	private String newuseremail;
	private int newuserphoneno;
	private String newusername;
	private String newuserpwd;
	private String newuserprofile;

	public LoginBean() {
	}

	public LoginBean(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserFirstName()
	{
		return newuserfrstname;
	}
	
	public void setUserFirstName(String newuserfrstname)
	{
		this.newuserfrstname = newuserfrstname;
	}
	public String getUserLastName()
	{
		
		return newuserlstname;
	}
	public void setUserLastName(String newuserlstname)
	{
		this.newuserlstname = newuserlstname;
	}
	
	public String getUserEmailId()
	{
		return newuseremail;
	}

	public void setUserEmailId(String newuseremail )
	{
		this.newuseremail = newuseremail;
		
	}
	
	public int getUserPhoneno()
	{
		return newuserphoneno;
	}
	public void setUserPhoneno(int newuserphoneno)
	{
		this.newuserphoneno = newuserphoneno;
	}
	
	public String getUserNewName()
	{
		return newusername;
	}
	
	public void setUserNewName(String newusername)
	{
		this.newusername = newusername;
	}
	
	public String getUserNewPwd()
	{
		return newuserpwd;
	}
	
	public void setUserNewPwd(String newuserpwd)
	{
		this.newuserpwd = newuserpwd;
	}
	
	public String getUserProfile()
	{
		return newuserprofile;
	}
	public void setUserProfile(String newuserprofile)
	{
		this.newuserprofile = newuserprofile;
	}
	
	@Override
	public String toString() {
		return "LoginBean [userName=" + userName + ", password=" + password + "]";
	}

}
