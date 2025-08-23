package Automation_Webrowse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab5_selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.opencart.com/");
		String title = Driver.getTitle();
		if (title.equals("OpenCart - Open Source Shopping Cart Solution")) {
			System.out.println("The Title is matched");
		} else {
			System.out.println("The Title is not matched");
		}
		Driver.navigate().to("https://www.yahoo.com/");
		System.out.println("title is:" + Driver.getCurrentUrl());
		Driver.navigate().back();
		System.out.println("title is:" + Driver.getCurrentUrl());
		Driver.navigate().forward();
		Driver.navigate().refresh();
		System.out.println("title is:" + Driver.getCurrentUrl());

	}
}
