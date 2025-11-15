package MyPack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class data {
	 WebDriver dr=new ChromeDriver();
  @Test
  public void f() {
	  WebDriver wd=new ChromeDriver();
	  JavascriptExecutor js=(JavascriptExecutor)wd;
	  js.executeScript("window.scrollBy(056)");
	  
	  WebElement w1= dr.findElement(By.xpath("arguments[0].scrollInto View(true),-,li"));
  }
  public class LoginTest {
	  WebDriver dr=new ChromeDriver();
	   @Test
	   public void login()   {
	  

	  WebElement wb=dr.findElement(By.id("username"));
	  
	  wb.sendKeys("student");


	  WebElement wb1=dr.findElement(By.id("password"));

	  wb1.sendKeys("Password123");


	  WebElement wb2=dr.findElement(By.id("submit"));
	  wb2.click();
	  

	  
	  
	   }
  @BeforeTest
  public void beforeTest() {
	  dr.get("https://practicetestautomation.com/practice-test-login/");
	  dr.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(2000);
	  dr.close();

  }
  
  }

  
}