package MyPack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class PracticeDemo {
	WebDriver m=new ChromeDriver();
	@Test
	public void f()
	{
		WebDriver wd=new ChromeDriver();
		  JavascriptExecutor js=(JavascriptExecutor)wd;
		  js.executeScript("window.scrollBy(0,580)");
		  js.executeScript("window.scrollBy(0,-580)");
		  
		 
	}
  @Parameters({"Username","Password"})
  @Test
  public void login(String Username,String Password ) {
	  
WebElement w= m.findElement(By.id("Username"));
	  
	  w.sendKeys(Username);


	  WebElement u=m.findElement(By.id("Password"));

	  u.sendKeys(Password);


	  WebElement p=m.findElement(By.id("submit"));
	 p.click();
}


  @BeforeTest
  public void beforeTest() {
  
  
  m.get("https://practice.expandtesting.com/login");

}

  @AfterTest
  public void afterTest() throws InterruptedException {
      
	  
		  Thread.sleep(2000);
		  m.close();
  }

  
	  
  }

