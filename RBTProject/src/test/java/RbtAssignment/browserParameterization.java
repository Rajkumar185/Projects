package RbtAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserParameterization {
	
	WebDriver driver;
	String url="https:google.com";

	
	@Parameters("browser")
	public void parametersetup(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			driver.get(url);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("Executing the chromeDriver");	
		}else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
			driver.get(url);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("Executing the edgeDriver");
		}else {
			System.out.println("Executing in another browser");
		}
		
	}
	

}
