package Exam;

import java.util.HashMap;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGSc3 {
	
	//WebDriver driver;
	 public String username = "pittalarajkumar185";
	    public String accesskey = "C9q1cIR8z7mOluiV4807WWZmBU6kzMgJyvlK6p0a97xt5hbhdF";
	    public static RemoteWebDriver driver = null;
	    public String gridURL = "@hub.lambdatest.com/wd/hub";
	    boolean status = false;
	
	
	@Parameters({"browser","url"})
	@BeforeClass()
	public void setUp(String browser,String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
			ChromeOptions browserOptions = new ChromeOptions();
			browserOptions.setPlatformName("Windows 10");
			browserOptions.setBrowserVersion("114.0");
			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			ltOptions.put("username", "pittalarajkumar185");
			ltOptions.put("accessKey", "C9q1cIR8z7mOluiV4807WWZmBU6kzMgJyvlK6p0a97xt5hbhdF");
			ltOptions.put("visual", true);
			ltOptions.put("video", true);
			ltOptions.put("project", "Untitled");
			ltOptions.put("w3c", true);
			ltOptions.put("plugin", "java-testNG");
			browserOptions.setCapability("LT:Options", ltOptions);
	}
	}
	@Test()
	public void test() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[contains(text(),'Javascript Alerts')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button)[7]")).click();
		Thread.sleep(1000);
		String AlertMsg=driver.switchTo().alert().getText();
		System.out.println(AlertMsg);
		Assert.assertEquals(AlertMsg,"Alert box!");
		driver.switchTo().alert().accept();
		
	}
	@AfterClass()
	public void tearDown() {
		driver.close();
	}
	
	

}
