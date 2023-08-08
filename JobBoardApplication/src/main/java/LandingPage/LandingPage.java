package LandingPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LandingPage {

	public static void main(String[] args) {
		
	//	WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","D:\\BrowserDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jobportalclient.vercel.app/");
		

	}

}
