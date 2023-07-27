package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
  @Test
  public void test1 () throws InterruptedException 
  {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  Thread.sleep(3000);
	  driver.close();
  }
  
}
