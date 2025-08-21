package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Lab9_4q {
	WebDriver driver;
	
  @Test()
  public void f() throws InterruptedException {
	  //title verification
	  Assert.assertEquals(driver.getTitle(),"Your Store");
	  if(driver.getTitle().equals("Your Store"))
		{
	System.out.println("titele is matched");
	Assert.assertTrue(true);
		}
else
{
	System.out.println("titele is nt matched");
	Assert.assertFalse(true);
	
		}
	  /*
Go to 'Desktops' tab
Click on 'Mac'
Select 'Name(A-Z)' from the 'Sort By' dropdown
Click on 'Add to Cart' button
*/
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("alert('helloo')");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	  driver.findElement(By.linkText("Desktops")).click();
		 driver.findElement(By.linkText("Mac (1)")).click();

		 WebElement sort=driver.findElement(By.id("input-sort"));
			Select sle=new Select(sort);
			sle.selectByVisibleText("Name (A - Z)");
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]")).click();
			//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
			//Enter ‘Mobile’ in ‘Search’ text box and click on ‘Search’ button
			driver.findElement(By.name("search")).sendKeys("Mobile");
			driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
			Thread.sleep(2000);
			//Clear the text from ‘Search Criteria’ text box
			//Click on ‘Search in product descriptions’ check box and click on ‘Search’ button
			driver.findElement(By.id("input-search")).clear();
			driver.findElement(By.name("description")).click();
			driver.findElement(By.id("button-search")).click();
			
			driver.findElement(By.name("search")).sendKeys("Monitor");
			driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
			
			//Add the step after Click on 'Mac' where verify the 'Mac' heading

			 String title1= driver.getTitle();
			  if(title1.equals("Mac")) {
				  System.out.println("Mac is verified");
			  }
			  else {
				  System.out.println("Mac is not verified");
			  }
			
  }
 
  @BeforeMethod
  @Parameters("browser")
  public void beforeMethod(String browser) {
		
	  if(browser.equalsIgnoreCase("chrome")) {
		  System.out.println("This is test 1");
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.get("https://tutorialsninja.com/demo/index.php");
		  }
		  else if(browser.equalsIgnoreCase("firefox")) {
		  System.out.println("This is test 2");
		  WebDriverManager.firefoxdriver().setup();
	 driver=new FirefoxDriver();
		  driver.get("https://tutorialsninja.com/demo/index.php");
		  }
		  else if(browser.equalsIgnoreCase("edge")) {
			  System.out.println("This is test 2");
			  WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
			  driver.get("https://tutorialsninja.com/demo/index.php");
			  }
	  
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }

}