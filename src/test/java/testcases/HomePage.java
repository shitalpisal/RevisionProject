package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class HomePage {
  @Test
  public void test1() throws InterruptedException
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	  
	  driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
	  driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
	  
	  
	  Thread.sleep(3000);

	 String s1 = driver.getCurrentUrl();
	 System.out.println(s1);
	  Thread.sleep(3000);

	 driver.close();
	  

	  
	  
	  
  }
}
