package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Lab11_3Page_object {
	WebDriver driver;

	public Lab11_3Page_object(WebDriver driver2) {
		this.driver = driver2;
	}

	By DeskLink = By.linkText("Desktops");
	By macLink = By.linkText("Mac (1)");
	By sort = By.id("input-sort");
	By addtocart = By.xpath(("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]"));
	{

	}

	public void ClickDesktop() {
		driver.findElement(DeskLink).click();
	}

	public void ClickMac() {
		driver.findElement(macLink).click();
	}

	/*
	 * public void sortbyIndex() throws InterruptedException { WebElement
	 * sort=driver.findElement(By.id("input-sort")); /////For INdex Select sle=new
	 * Select(sort); Thread.sleep(3000); sle.selectByIndex(2);//A-Z
	 */
	public void sort() {
		Select srt = new Select(driver.findElement(sort));
		srt.selectByVisibleText("Name (A - Z)");
	}

	public void addtocart() {
		driver.findElement(addtocart).click();
		;
	}
}
