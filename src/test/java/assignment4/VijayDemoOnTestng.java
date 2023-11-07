package assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class VijayDemoOnTestng {
	WebDriver driver;

	@BeforeTest
	public void Connection() {
		System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https:www.amazon.com");
		driver.manage().window().maximize();
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Flowers");
	}
	
	    @Test(priority=0)
		public void actionPerform() {
			
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Flowers");	
		
		
	}
	    @Test(priority=1)
	    public void secondAction() {
	    	Actions a=new Actions(driver);
	    	a.moveToElement(driver.findElement(By.id("nav-search-submit-button"))).click().build().perform();;
	    	
	    	//driver.findElement(By.id("nav-search-submit-button")).click();
	    }
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
