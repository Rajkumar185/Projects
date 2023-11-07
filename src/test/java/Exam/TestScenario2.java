package Exam;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class TestScenario2 {
	
	WebDriver driver;
	
	@BeforeTest()
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
	       driver =new ChromeDriver(); 
	       driver.get("https://www.lambdatest.com/selenium-playground/"); 
	       driver.manage().window().maximize();
	}
	@Test()
	public void test() throws InterruptedException {
		//click “Drag & Drop Sliders” 
		driver.findElement(By.xpath("//a[contains(text(),'Drag & Drop Sliders')]")).click();
		Thread.sleep(2000);
		//Progress Bars & Sliders
	WebElement progressbar=driver.findElement(By.xpath("//input[@value='15']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	Actions act = new Actions(driver);  
	act.dragAndDropBy(progressbar,215,15).build().perform();
	Thread.sleep(2000);
	//Select the slider “Default value 15” and drag the bar to make it 95 by validating whether the range value shows 95.
	String val=driver.findElement(By.id("rangeSuccess")).getText();
	Assert.assertEquals(val,"95");
	}
	@AfterTest()
	public void tearDown() {
		driver.close();
		
	}


}
