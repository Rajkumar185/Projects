package assignment02;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jsAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 //System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 driver.manage().window().maximize();
		 driver.get("https:www.amazon.com");
		 driver.navigate().refresh();
		 Homepage hp=new Homepage(driver);
		 hp.DropDown();
		 hp.WindowHandling();
		 hp.listUrl();
	}

}
