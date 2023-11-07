/**How to launch different browsers using selenium  */
package mockInterviewprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.v104.browser.Browser;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class diffBrowserusingparameters {
	WebDriver driver;
	String url="https://www.gmail.com";
	
	@Parameters("browser")
	@Test(priority=0)
	public void launchingbrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("Executing Chrome");
			//System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} else if(browser.equalsIgnoreCase("edge")){
			
			System.out.println("Executing Edge");
			//System.setProperty("webdriver.edge.driver","D:\\sel\\temp\\edgedriver_win64\\msedgedriver.exe");
		    WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		    driver.get(url);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} else {
			throw new IllegalArgumentException("the Browser is undefined");
		
		}
	}
		@Test(priority=1)
		public void closeBrowser() {
			driver.close();
			
		}
	}

	


