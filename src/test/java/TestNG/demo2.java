package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class demo2 {
WebDriver driver;
  @Test(priority=3)
  public void test1() {
	  System.out.println("This is test 1");
	  WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.get("https://www.amazon.com/");
       //Assert.asserEquals(driver.getTitle(),"Online shopping in India");
       if(driver.getTitle().equals("Amazon"))
    		   {
    	   System.out.println("title is matched");
    	   Assert.assertTrue(true);
    		   }
       else
       {
    	   System.out.println("title is not matched");
    	   Assert.assertFalse(true);     
    	   }
  }
  @Test(priority=1)
  public void test2() {
	  System.out.println("This is test 1");
	  WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.get("https://www.yahoo.com/");
  }
  @Test(priority=2)
  public void test3() {
	  System.out.println("This is test 1");
	  WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.get("https://www.myntra.com/");
       
  }

/*@Test(priority=4)
public void test4() {
	  System.out.println("This is test 1");
	  WebDriverManager.chromedriver().setup();
     driver=new ChromeDriver();
     driver.get("https://www.ajio.com/");*/
}

