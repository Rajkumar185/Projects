package assignment01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Footervalues {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();	
		ChromeOptions options =new ChromeOptions();
	    options.addArguments("disable-notifications");
      	WebDriver driver=new ChromeDriver(options);
      	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("https://www.irctc.co.in/nget/train-search");//launching the IRCTC website
	    Values val=new Values(driver);
	    val.footer();

	}
	

}
