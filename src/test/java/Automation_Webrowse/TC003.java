package Automation_Webrowse;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC003 {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("http://www.automationpractice.pl/index.php?");
	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
	List<WebElement> ll=driver.findElements(By.xpath("//input[@type='text']"));
	System.out.println("Total count:" + ll.size());
}

}
