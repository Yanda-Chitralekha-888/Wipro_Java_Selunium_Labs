package TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login_pagefactory {
	private WebDriver driver;
	public login_pagefactory(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}


	//By uname=By.name("username");
	@FindBy(name="username")
	WebElement uname;
	//By pword=By.name("password");
	@FindBy(name="password")
	WebElement pword;
	//By loginbutton=By.xpath("//button[@type='submit']");
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbutton;
	;
	

	

	public void enterusername(String username)
	{
		uname.sendKeys(username);
	}
	
	
	public void enterpassword(String password)
	{
		pword.sendKeys(password);
	}
	
	
	public void clickonlogin()
	{
		loginbutton.click();
	}
	
}