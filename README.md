# automation_testing_browing
—-------------------------------------------------------------------------------------------------
package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class openBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr = new ChromeDriver();
		WebDriver dr1 = new FirefoxDriver();
		//WebDriver dr = new EdgeDriver();
	//	WebDriver dr = new InternetExplorerDriver();
		dr.get("https://www.google.com");
		dr.manage().window().maximize();
      // Thread.sleep(3000);
       System.out.println(dr.getTitle());
		
		dr1.get("https://www.gmail.com");
		System.out.println(dr.getTitle().equalsIgnoreCase(dr1.getTitle()));
		
		dr1.manage().window().maximize();
		//Thread.sleep(4000);
		System.out.println(dr1.getCurrentUrl());
		
		
		
	}
}




—-------------------------------------------------------------------------------------------------


package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class openBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();//to open chrome browser
		dr.get("https://www.google.com/");
		Thread.sleep(3000);
		dr.navigate().forward();
		dr.get("https://www.gmail.com/");
		Thread.sleep(3000);
		dr.navigate().back();
		dr.navigate().refresh();
		System.out.println(dr.manage().window().getSize());
	}
}
—-------------------------------------------------------------------------------------------------
package com.test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class openBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();//to open chrome browser
		dr.get("https://www.google.com/");
		Thread.sleep(3000);
		dr.navigate().forward();
		dr.get("https://www.gmail.com/");
		Thread.sleep(3000);
		dr.navigate().back();
		Dimension d = new Dimension(500, 750);
		dr.manage().window().setSize(d);
		System.out.println(dr.manage().window().getSize());
	}
}
—-------------------------------------------------------------------------------------------------
package com.test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class openBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();//to open chrome browser
		dr.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(3000);
		dr.navigate().forward();
//		dr.get("https://www.gmail.com/");
//		Thread.sleep(3000);
//		dr.navigate().back();
//		Dimension d = new Dimension(500, 750);
//		dr.manage().window().setSize(d);
		System.out.println(dr.manage().window().getSize());
	}
}

—-------------------------------------------------------------------------------------------------
package com.test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class openBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(3000);
		dr.navigate().forward();
		dr.manage().window().fullscreen();
	}
}
—-------------------------------------------------------------------------------------------------
package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class openBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(3000);
		d.navigate().forward();
		d.manage().window().fullscreen();
		d.findElement(By.id("username")).sendKeys("Welcome");
		d.findElement(By.id("password")).sendKeys("!bvh7765Tyu");
		d.findElement(By.id("submit")).click();
	}
}
—-------------------------------------------------------------------------------------------------

package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class openBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(3000);
		d.navigate().forward();
		d.manage().window().fullscreen();
		d.findElement(By.id("username")).sendKeys("student");
		d.findElement(By.id("password")).sendKeys("Password123");
		d.findElement(By.id("submit")).click();
	}
}
—-------------------------------------------------------------------------------------------------
package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class openBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(3000);
		d.navigate().forward();
		d.manage().window().fullscreen();
		d.findElement(By.id("username")).click();
		d.findElement(By.id("username")).sendKeys("stubh899");
		d.findElement(By.id("username")).clear();
		d.findElement(By.id("username")).click();
		d.findElement(By.id("username")).sendKeys("student");
		d.findElement(By.id("password")).click();
		d.findElement(By.id("password")).sendKeys("Password123");
		d.findElement(By.id("submit")).click();
//		d.findElement(By.id("log out")).click();
	}
}
—-------------------------------------------------------------------------------------------------
package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class openBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(3000);
		d.navigate().forward();
		d.manage().window().fullscreen();
		d.findElement(By.id("username")).sendKeys("student");
		d.findElement(By.id("password")).click();
		d.findElement(By.id("password")).sendKeys("Password123");
		WebElement we=d.findElement(By.id("username"));
		we.click();
		we.sendKeys("asdad");
		we.clear();
		we.sendKeys("sdsad");
		String s=we.getAttribute("value");
		System.out.println(s);
		System.out.println(we.isDisplayed());
		System.out.println(we.isEnabled());
	}
}
—-------------------------------------------------------------------------------------------------
package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class openBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(3000);
		d.navigate().forward();
		d.manage().window().fullscreen();
		d.findElement(By.id("username")).sendKeys("student");
		d.findElement(By.id("password")).click();
		d.findElement(By.id("password")).sendKeys("Password123");
		WebElement we=d.findElement(By.id("username"));
		we.click();
		we.sendKeys("asdad");
		we.clear();
		we.sendKeys("sdsad");
		String s=we.getAttribute("value");
		System.out.println(s);
		System.out.println(we.isDisplayed());
		System.out.println(we.isEnabled());
		System.out.println(we.isSelected());
	}
}
—-------------------------------------------------------------------------------------------------
package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class openBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(3000);
		d.navigate().forward();
		d.manage().window().fullscreen();
		d.findElement(By.id("username")).sendKeys("student");
		d.findElement(By.id("password")).click();
		d.findElement(By.id("password")).sendKeys("Password123");
		WebElement we=d.findElement(By.id("username"));
		we.click();
		we.sendKeys("asdad");
		we.clear();
		we.sendKeys("sdsad");
		String s=we.getAttribute("value");
		System.out.println(s);
		System.out.println(we.isDisplayed());
		System.out.println(we.isEnabled());
		System.out.println(we.isSelected());
		System.out.println(we.getLocation());
	}
}
—-------------------------------------------------------------------------------------------------
package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class openBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(3000);
		d.navigate().forward();
		d.manage().window().fullscreen();
		d.findElement(By.id("username")).sendKeys("student");
		d.findElement(By.id("password")).click();
		d.findElement(By.id("password")).sendKeys("Password123");
		WebElement we=d.findElement(By.id("username"));
		we.click();
		we.sendKeys("asdad");
		we.clear();
		we.sendKeys("sdsad");
		String s=we.getAttribute("value");
		System.out.println(s);
		System.out.println(we.isDisplayed());
		System.out.println(we.isEnabled());
		System.out.println(we.isSelected());
		System.out.println(we.getLocation());
		System.out.println(we.getTagName());
	}
}
—-------------------------------------------------------------------------------------------------
package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class openBrowser {
	public static void main(String[] args) throws InterruptedException {
       WebDriver dr1=new ChromeDriver();
       dr1.get("https://practicetestautomation.com/practice-test-login/");
       dr1.manage().window().maximize();
       WebElement w=dr1.findElement(By.id("username"));
       w.click();
       w.sendKeys("sdfds");
       w.clear();
       w.sendKeys("sdfsksjhjssj");
       String d=w.getAttribute("value");
       System.out.println(d);
       System.out.println(w.isEnabled());
       System.out.println(w.isDisplayed());
       System.out.println(w.isSelected());
       System.out.println(w.getLocation());
       System.out.println(w.getSize());
       System.out.println(w.getTagName());
       System.out.println(w.getText());
       WebElement e=dr1.findElement(By.id("password"));
       e.sendKeys("1234343");
       dr1.findElement(By.id("submit")).click();
       Thread.sleep(2000);
       WebElement r=dr1.findElement(By.id("error"));
       System.out.println(r.getText());  
   }
}
—---------------------------------------------------------------------------------------------------------------


