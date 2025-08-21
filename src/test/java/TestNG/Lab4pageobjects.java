package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Lab4pageobjects {
    WebDriver driver;

    // Constructor
    public Lab4pageobjects(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By desktopsTab = By.linkText("Desktops");
    By macLink = By.linkText("Mac (1)");
    By sortDropdown = By.id("input-sort");
    By addToCartBtn = By.xpath("//*[@id='content']/div[2]/div/div/div[2]/div[2]/button[1]");
    By searchBox = By.name("search");
    By searchBtn1 = By.xpath("//*[@id='search']/span/button");
    By searchCriteriaBox = By.id("input-search");
    By descriptionCheckbox = By.name("description");
    By searchBtn2 = By.id("button-search");

    // Actions
    public void clickondesktop() {
        driver.findElement(desktopsTab).click();
    }

    public void clickonmac() {
        driver.findElement(macLink).click();
    }

    public void sort() throws InterruptedException {
        WebElement sortElement = driver.findElement(sortDropdown);
        Select sle = new Select(sortElement);
        Thread.sleep(2000);
        sle.selectByVisibleText("Name (A - Z)");
    }

    public void addtocart() {
        driver.findElement(addToCartBtn).click();
    }

    public void search1(String product) {
        driver.findElement(searchBox).sendKeys(product);
    }

    public void searchbutton1() {
        driver.findElement(searchBtn1).click();
    }

    public void searchcriteria() {
        driver.findElement(searchCriteriaBox).clear();
    }

    public void description() {
        driver.findElement(descriptionCheckbox).click();
    }

    public void searchbutton2() {
        driver.findElement(searchBtn2).click();
    }
}
