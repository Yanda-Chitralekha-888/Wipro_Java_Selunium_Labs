package Automation_Webrowse;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC12_JavaScript_Executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//js.executeScript("window.scrollBy(0,1500)");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//for scroll
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("alert('Hello');");
		
	}

}
