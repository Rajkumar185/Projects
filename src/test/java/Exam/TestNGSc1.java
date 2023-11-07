package Exam;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;

import javax.print.DocFlavor.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGSc1 {
	
//	public String username = "pittalarajkumar185";
//    public String accesskey = "C9q1cIR8z7mOluiV4807WWZmBU6kzMgJyvlK6p0a97xt5hbhdF";
	
	 public String username = "pittalarajkumar185";
	    public String accesskey = "C9q1cIR8z7mOluiV4807WWZmBU6kzMgJyvlK6p0a97xt5hbhdF";
	   // public static RemoteWebDriver driver = null;
	    public String gridURL = "@hub.lambdatest.com/wd/hub";
	    boolean status = false;

	WebDriver driver;
	
	@Parameters({"browser","url"})
	@BeforeClass()
	public void setUp(String browser,String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
//			ChromeOptions browserOptions = new ChromeOptions();
//			browserOptions.setPlatformName("Windows 10");
//			browserOptions.setBrowserVersion("114.0");
//			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
//			ltOptions.put("username", "pittalarajkumar185");
//			ltOptions.put("accessKey", "C9q1cIR8z7mOluiV4807WWZmBU6kzMgJyvlK6p0a97xt5hbhdF");
//			ltOptions.put("visual", true);
//			ltOptions.put("video", true);
//			ltOptions.put("project", "Untitled");
//			ltOptions.put("w3c", true);
//			ltOptions.put("plugin", "java-testNG");
//			browserOptions.setCapability("LT:Options", ltOptions);
			DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("browserName", "chrome");
	        capabilities.setCapability("version", "114.0");
	        capabilities.setCapability("platform", "win10"); // If this cap isn't specified, it will just get the any available one
	        capabilities.setCapability("build", "LambdaTestSampleApp");
	        capabilities.setCapability("name", "LambdaTestJavaSample");
	        capabilities.setCapability("network", "true");
	        capabilities.setCapability("visual", "true");
	        capabilities.setCapability("video", "true");
	        capabilities.setCapability("console", "true");
//	        try {
//	           // driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
//	        } catch (MalformedURLException e) {
//	            System.out.println("Invalid grid URL");
//	        } catch (Exception e) {
//	            System.out.println(e.getMessage());
//	}
		}
	}
	@Test()
	public void test() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("__next")));
		SoftAssert softassert=new SoftAssert();
	   String Title=driver.getTitle();
	   softassert.assertEquals(Title, "LambdaTest");
	  // softassert.assertNotEquals(Title,"LambdaTest");
	   softassert.assertAll();
	   
	   
	}
	
	@AfterClass()
	public void tearDown() {
		driver.close();
	}
	
	

}
