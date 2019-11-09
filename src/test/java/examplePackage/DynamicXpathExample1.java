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
import org.testng.annotations.AfterTest;

public class DynamicXpathExample1 {
	WebDriver driver;
	
 
	
  
	@Test
	  public void f3() throws InterruptedException {
		  driver.get("http://demo.guru99.com/v1/");
		  Thread.sleep(3000);
		  //And
		  WebElement userId=driver.findElement(By.xpath("//input[@type='text' and @name='uid']"));
		  //contains
		  WebElement passWord=driver.findElement(By.xpath("//input[contains(@name,'passw')]"));
		  //starts-with
		  WebElement loginButton=driver.findElement(By.xpath("//input[starts-with(@name,'btnL')]"));
		 
		  userId.sendKeys("mgr123");
		  passWord.sendKeys("mgr!23");
		  loginButton.click();
		  //contains(text(),'')
		  WebElement gptlBankHeader=driver.findElement(By.xpath("//h2[contains(text(),'Gtpl Bank')]"));
		  if(gptlBankHeader.isDisplayed())
		  {
			  System.out.println("Moved to homePage");
		  }
		  else
		  {
			  System.out.println("Login is not Succesfull");
		  }
		  //text()
		  WebElement newCustomerLink=driver.findElement(By.xpath("//a[text()='New Customer']"));
		  newCustomerLink.click();
		  
		  //following to select Female radio button from Male radio button
		  WebElement gender=driver.findElement(By.xpath("//input[@type='radio']//following::input[1]"));
		  //ancestor to select City from telephone Number
		  WebElement city=driver.findElement(By.xpath("//input[@name='telephoneno']//ancestor::tr//input[@name='city']"));
		  
		  //Child to select New Account Link
		  WebElement newAccountLink=driver.findElement(By.xpath("//ul[@class='menusubnav']//child::li[5]//a[text()='New Account']"));
		  
		 //preceding to select emailId
		  WebElement emailField=driver.findElement(By.xpath("//input[@type='reset']//preceding::input[2]"));
		  
		  //following-sibling to select reset button from submit button
		  WebElement resetButton=driver.findElement(By.xpath("//input[@type='submit']//following-sibling::input"));
		  
		  //parent to select delete Account li  from delete Account a 
		  WebElement deleteAccount=driver.findElement(By.xpath("//a[text()='Delete Account']//parent::li")); 
	  }	
	
	
	
	
  @BeforeTest
  public void beforeTest() {
	  //System.setProperty("webdriver.gecko.driver","F:\\Selenium downloads\\Selenium Practice\\geckodriver.exe");
	  System.setProperty("webdriver.chrome.driver","F:\\Selenium downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	 //F:\Selenium downloads\chromedriver_win32
	  System.out.println("Property set");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
