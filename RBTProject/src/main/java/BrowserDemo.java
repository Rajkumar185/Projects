import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDemo {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","D:\\BrowserDrivers\\chromedriver_win32\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		ChromeDriver driver = new ChromeDriver(options);
		//WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		//for firefox driver
//		    System.setProperty("webdriver.gecko.driver","D:\\sel\\geckodriver-v0.31.0-win32\\geckodriver.exe");
			//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver= new FirefoxDriver();
		//for edge driver
		//System.setProperty("webdriver.edge.driver","D:\\BrowserDrivers\\edgedriver_win64\\msedgedriver.exe");
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver= new EdgeDriver();
//	
		driver.get("https:google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();


	}

}
