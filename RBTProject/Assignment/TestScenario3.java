package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TestScenario3 {
	WebDriver driver;
	public TestScenario3(WebDriver driver) {
		this.driver=driver;
		
	}
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
	       driver =new ChromeDriver(); 
	       driver.get("https://www.lambdatest.com/selenium-playground/"); 
	       driver.manage().window().maximize();
	}
	public void test() throws InterruptedException {
		//click “Input Form Submit” under “Input Forms”
		driver.findElement(By.xpath("//a[contains(text(),'Input Form Submit')]")).click();
		//Thread.sleep(2000);
		//Click “Submit” without filling in any information in the form
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		//Thread.sleep(2000);
		//Assert “Please fill in the fields” error message
		String msg=driver.findElement(By.id("name")).getAttribute("validationMessage");
		Assert.assertEquals(msg,"Please fill out this field.");
		//Thread.sleep(2000);
		//Fill in Name, Email, and other fields.
		driver.findElement(By.id("name")).sendKeys("Rajkumar");
		//Thread.sleep(2000);
		driver.findElement(By.id("inputEmail4")).sendKeys("Rajkumar@gmail.com");
		//Thread.sleep(2000);
		driver.findElement(By.id("inputPassword4")).sendKeys("Rajkumar");
		//Thread.sleep(2000);
		driver.findElement(By.id("company")).sendKeys("persistent");
		//Thread.sleep(2000);
		driver.findElement(By.id("websitename")).sendKeys("Lambdatest");
		//Thread.sleep(2000);
		//From the Country drop-down, select “United States” using the text property
		Select dropdown=new Select(driver.findElement(By.xpath("//select[@name='country']")));
		dropdown.selectByVisibleText("United States");
		//Thread.sleep(2000);
		driver.findElement(By.id("inputCity")).sendKeys("Hyderabad");
		//Thread.sleep(2000);
		driver.findElement(By.id("inputAddress1")).sendKeys("Hi-tech city");
		//Thread.sleep(2000);
		driver.findElement(By.id("inputAddress2")).sendKeys("madhapur");
	//	Thread.sleep(2000);
		driver.findElement(By.id("inputState")).sendKeys("Telangana");
		//Thread.sleep(2000);
		driver.findElement(By.id("inputZip")).sendKeys("50018");
		//Thread.sleep(2000);
		//Fill all fields and click “Submit”.
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		//Once submitted, validate the success message “Thanks for contacting us, we will get back to you shortly.” on the screen.
		String SuccessfullMsg="Thanks for contacting us, we will get back to you shortly.";
		Assert.assertEquals(SuccessfullMsg, "Thanks for contacting us, we will get back to you shortly.");
		
	}
	public void tearDown() {
		driver.close();
	}

}
