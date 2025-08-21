package TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
Properties prob=new Properties();
FileInputStream fis=new FileInputStream("E:\\Eclipse\\Java_Selenium\\Lab_12.properties");
prob.load(fis);
String url=prob.getProperty("url");
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get(url);
String email=prob.getProperty("email");
String password=prob.getProperty("password");

driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
driver.findElement(By.linkText("Login")).click();
driver.findElement(By.id("input-email")).sendKeys(email);
driver.findElement(By.id("input-password")).sendKeys(password);
driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	}

}
