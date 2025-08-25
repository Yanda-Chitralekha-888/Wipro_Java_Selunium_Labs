package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Lab9_3q {
	WebDriver driver;

	@Test()
	public void f() throws InterruptedException {
		driver.findElement(By.linkText("Desktops")).click();
		driver.findElement(By.linkText("Mac (1)")).click();

		WebElement sort = driver.findElement(By.id("input-sort"));
		Select sle = new Select(sort);
		Thread.sleep(3000);
		sle.selectByVisibleText("Name (A - Z)");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]")).click();

	}

	@BeforeMethod
	@Parameters("browser")
	public void beforeMethod(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("This is test 1");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://tutorialsninja.com/demo/index.php");
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("This is test 2");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://tutorialsninja.com/demo/index.php");
		} else if (browser.equalsIgnoreCase("edge")) {
			System.out.println("This is test 2");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://tutorialsninja.com/demo/index.php");
		} else if (browser.equalsIgnoreCase("edge")) {
			System.out.println("This is test 2");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://tutorialsninja.com/demo/index.php");
		}
	}

	@AfterMethod
	public void afterMethod() {

	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
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