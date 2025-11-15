package MyPack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Browser {
	WebDriver dr;
	
	public void f()
	{
		WebDriver wd=new ChromeDriver();
		  JavascriptExecutor js=(JavascriptExecutor)wd;
		  js.executeScript("window.scrollBy(0,580)");
		  js.executeScript("window.scrollBy(0,-580)");
	}
  @Test
  public void f1() throws Exception {
      Thread.sleep(1000);
         
      WebElement ment = dr.findElement(By.name("username"));
      ment.click();
      ment.sendKeys("Admin");
    
      WebElement indi = dr.findElement(By.name("password"));
      indi.click();
      indi.sendKeys("admin123");
    
      WebElement ll = dr.findElement(By.xpath("//button[@type='submit']"));
      ll.click();
}

@AfterTest
public void afterTest1() throws InterruptedException {
   
   Thread.sleep(5000);
   dr.close();
}
  @BeforeTest
  public void beforeTest() {
  
  dr = new ChromeDriver();
  dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  dr.manage().window().maximize();
}

  @AfterTest
  public void afterTest() throws InterruptedException {
      
      Thread.sleep(5000);
      dr.close();
  }

}
