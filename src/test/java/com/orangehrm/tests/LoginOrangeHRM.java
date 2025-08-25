package com.orangehrm.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangehrm.base.BaseTest;
import com.orangehrm.utilities.ExcelUtilities;
import com.orangehrm.utilities.Screenshot;

import TestNG.login_pagefactory;

public class LoginOrangeHRM extends BaseTest {
	WebDriver driver;
	static String projectpath = System.getProperty("user.dir");

	@Test(dataProvider = "logindate")
	public void verifylogin(String username, String password) throws IOException {
		test = extent.createTest("Login with the user:" + username);
		login_pagefactory obj = new login_pagefactory(driver);
		obj.enterusername(username);
		obj.enterusername(password);
		obj.clickonlogin();
		String actualtitle = driver.getTitle();
		if (actualtitle.equalsIgnoreCase("OrangeHRM")) {
			test.pass("Lpgin Successful and title is matched:" + actualtitle);
		} else {
			String screenpath = Screenshot.Capture(driver, "Login_Failed:" + username);
			test.fail("Login UnSuccessful and title is not matched:" + actualtitle)
					.addScreenCaptureFromPath(screenpath);

		}
	}

	@DataProvider
	public Object[][] logindata() throws IOException {

		String excelpath = projectpath + "\\src\\test\\resources\\Testdata\\data.xlsx";

		return ExcelUtilities.getdata(excelpath, "Sheet1");

	}
}
