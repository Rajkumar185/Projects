package assignment02;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 //System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 driver.manage().window().maximize();
		 driver.get("https:www.amazon.com");
		 List<String>window=new ArrayList<String>(driver.getWindowHandles());
	     System.out.println("Total windows open:"+window.size());
		 Landingpage lp=new Landingpage(driver);
		 lp.beforeApp();
		 lp.signApplication("9182014723","Rajkumar");
		 lp.windowHandles();
		 Dropdownpage drop=new Dropdownpage(driver);
		 drop.moveover();
		 drop.moveoverdropdown();
	}

}
