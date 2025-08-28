package Practice_Questions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Q7 {
	WebDriver driver;
  @Test()
  public void f() {
List<WebElement> data= driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
for(int i=0;i<data.size();i++) {
	WebElement row=data.get(i);
	String firstName = row.findElement(By.xpath("./td[2]")).getText();
	String lastName = row.findElement(By.xpath("./td[1]")).getText();
	System.out.println(firstName+""+lastName);
	if(firstName.equalsIgnoreCase("Jason")){
		String email = row.findElement(By.xpath("./td[3]")).getText();
		System.out.println("Email of Json:" + email);
	}
}
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/tables");
  }
  

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      //new Object[] { 2, "b" },
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
