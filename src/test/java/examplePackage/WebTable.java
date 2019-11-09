package examplePackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class WebTable {
	WebDriver driver;
  
  @Test
  public void f3() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.abhibus.com/");
	  Thread.sleep(4000);
	  WebElement t1=driver.findElement(By.xpath("//*[@id='datepicker1']"));
	  t1.click();
	  
	  List<WebElement> dates=driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/div[2]/table/tbody/tr/td"));
	  int totalDates=dates.size();
	  for(int i=0;i<totalDates;i++)
	  {
		  String k=dates.get(i).getText();
		  System.out.println("k value:"+k);
		  if(k.equalsIgnoreCase("14"))
		  {
			  dates.get(i).click();
		  }
	  }
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","F:\\Selenium downloads\\Selenium Practice\\geckodriver.exe");
	  System.out.println("Property set");
	  driver= new FirefoxDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}
