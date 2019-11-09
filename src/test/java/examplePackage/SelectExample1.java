package examplePackage;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class SelectExample1 {
	WebDriver driver;
	

	
 
	
	
	@Test
	  public void f3() throws InterruptedException {
		  driver.get("http://toolsqa.com/automation-practice-form/");
		  Thread.sleep(3000);
		  WebElement dropdown=driver.findElement(By.xpath("//select[@id='continents']"));
		  Select s=new Select(dropdown);
		  
		  WebElement selected=s.getFirstSelectedOption();
		  System.out.println("selected:"+selected.getText());
		  List<WebElement> allValues=s.getOptions();
		  for (int i = 0; i < allValues.size(); i++) 
		  {
			System.out.println("Available Value:"+allValues.get(i).getText());
		  }
		  
		  s.selectByVisibleText("Australia");
		  
		 
	  }	
	
	
	
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","F:\\Selenium downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	 
	  System.out.println("Property set");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	  
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
