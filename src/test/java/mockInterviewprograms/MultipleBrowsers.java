package mockInterviewprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleBrowsers {
	
	@Test(priority=0)
	public void Chrome() {
	//System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	System.out.println("Executing TestCase in Chrome Browser");
	driver.manage().window().maximize();
	//driver.getTitle();
	System.out.println(driver.getTitle());
    driver.close();
	}
	@Test(priority=1)
	public void Edge() {
		System.setProperty("webdriver.edge.driver","D:\\sel\\temp\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		System.out.println("Executing TestCase in Edge Browser");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	    driver.close();
	}	
	
}
