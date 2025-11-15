package MyPack;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test(priority=2)
  public void reg() {
	  System.out.println("i am in reg testcase");
	  
  }
  @Test (priority=1)
  public void login() {
	  System.out.println("i am in login testcase");
	  
  }
  @Test(priority=3)
  public void home() {
	  System.out.println("i am in home");
  }
  @Test(priority=4)
  public void logout() {
	  throw new SkipException("we are working");
	  //System.out.println("i am in logout");
	  
  }
  @Test(priority=5)
  public void abc() {
	  System.out.println("i am in abc");
  }
 
  
}