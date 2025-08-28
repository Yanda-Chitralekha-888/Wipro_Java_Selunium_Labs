package Practice_Questions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Q4_Dropdown {
	WebDriver driver;
  @Test()
  public void Dropdown() {
	  WebElement sort=driver.findElement(By.name("my-select"));
	  Select sle=new Select(sort);
	  sle.selectByIndex(1);
	  String selectedText=sle.getFirstSelectedOption().getText();
	  WebElement verify=driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/label[1]/select/option[2]"));
	if(verify.getText().equals(selectedText))
	  System.out.println("correct option is selected");
	else
	{
		System.out.println("selected option is incorrect");
	}
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://www.selenium.dev/selenium/web/web-form.html");
  
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
  
    
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
