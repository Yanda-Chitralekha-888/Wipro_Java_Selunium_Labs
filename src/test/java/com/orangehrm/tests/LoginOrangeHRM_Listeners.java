package com.orangehrm.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.orangehrm.base.BaseTest;
import com.orangehrm.pages.Login_PageFactory;
import com.orangehrm.utilities.ExcelUtilities;
import com.orangehrm.utilities.Screenshot;


@Listeners(com.orangehrm.listeners.TestListener.class)
public class LoginOrangeHRM_Listeners extends BaseTest {
	static String projectpath=System.getProperty("user.dir")  ;
  @Test(dataProvider="logindata")
  public void verifylogin(String username, String password) throws IOException {
	 navigateurl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 
	// test=extent.createTest("Login with the user:"+username);
	 

	 Login_PageFactory obj = PageFactory.initElements(driver, Login_PageFactory.class);

	  obj.enterusername(username);
	  obj.enterpassword(password);
	  obj.clickonlogin();
	  
	  String actualtitle=driver.getTitle();
			  if(actualtitle.equalsIgnoreCase("OrangeHR"))
			  {
				  test.pass("Login Successfull and title is matched:"+actualtitle);
			  }
			  else
			  {
				  String screenpath=Screenshot.Capture(driver, "Login_Failed:"+username);
				  test.fail("Login unSuccessfull and title is not matched:"+actualtitle)
				  .addScreenCaptureFromPath(screenpath);
				  
			  }
  }
  
  @Test
  public void question1_google() throws IOException
  {
	  navigateurl("https://www.google.com/"); 
	  test=extent.createTest("Verify the title of the google page");
	  String actualtitle=driver.getTitle();
	  if(actualtitle.equalsIgnoreCase("Google"))
	  {
		  test.pass("Google title is matched");
	  }
	  else
	  {
		  String screenpath=Screenshot.Capture(driver, "Title mismatched");
		  test.fail("Google title is not matched:"+actualtitle)
		  .addScreenCaptureFromPath(screenpath);
		  
	  }
	  
  }
  
  @DataProvider
  public Object[][] logindata() throws IOException {
	  
		  String excelpath=projectpath+"\\src\\test\\resources\\Testdata\\data.xlsx";
	 
		return ExcelUtilities.getdata(excelpath,"Sheet1");
	
  
}
}