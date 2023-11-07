package Assignment;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScenario1 {
	WebDriver driver;
	public TestScenario1(WebDriver driver) {
		this.driver=driver;
		
	}
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
	       driver =new ChromeDriver(); 
	       //Open LambdaTest’s Selenium Playground from
	       driver.get("https://www.lambdatest.com/selenium-playground/"); 
	       driver.manage().window().maximize();
	}
	public void test() throws InterruptedException {
		//Click “Simple Form Demo” under Input Forms
		driver.findElement(By.xpath("//a[contains(text(),'Simple Form Demo')]")).click();
		Thread.sleep(2000);
		//Validate that the URL contains “simple-form-demo”
		String Expected=driver.getCurrentUrl();
		String Actual="https://www.lambdatest.com/selenium-playground/simple-form-demo";
		Assert.assertEquals(Expected, Actual);
		//Create a variable for a string value E.g: “Welcome to LambdaTest”
		String name="Welcome to LambdaTest";
		//Use this variable to enter values in the “Enter Message” text box.
		driver.findElement(By.id("user-message")).sendKeys(name);
		Thread.sleep(2000);
		//Click “Get Checked Value”.
		driver.findElement(By.id("showInput")).click();
		Thread.sleep(2000);
		//Validate whether the same text message is displayed in the right-hand panel under the “Your Message:” section
		String Message=driver.findElement(By.id("message")).getText();
		Assert.assertEquals(Message, "Welcome to LambdaTest");
		
		
	}
	public void tearDown() {
		driver.close();
	}
	

}
