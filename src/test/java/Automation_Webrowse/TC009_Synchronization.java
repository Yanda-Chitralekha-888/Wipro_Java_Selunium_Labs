package Automation_Webrowse;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC009_Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// WebElement username=driver.findElement(By.name("username"));/
		/*
		 * driver.findElement(By.name("username")).sendKeys("Admin");
		 * driver.findElement(By.name("username")).sendKeys(Keys.TAB);
		 * driver.findElement(By.name("password")).sendKeys(" admin123");
		 * driver.findElement(By.name("password")).sendKeys(Keys.TAB);
		 */
		WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
		username.sendKeys("Admin");

		WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
		password.sendKeys("admin123");
	}

}
