package assignment4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ScrollUpDownPage {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	     driver.manage().window().maximize();
	     driver.get("https:www.amazon.com"); 
	    //using Action class
	     /* Actions a=new Actions(driver);
	     a.sendKeys(Keys.PAGE_DOWN).build().perform();
	     Thread.sleep(2000);
	     a.sendKeys(Keys.PAGE_UP).build().perform();*/
	    //using javascriptExecutor
	     JavascriptExecutor js= (JavascriptExecutor)driver;
	    // js.executeScript("window.scrollBy(0,350)", "");
	     System.out.println("window moved to down ");
	     
	    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");//scroll down to the bottom of the webpage
	    js.executeScript("window.scrollBy(0,document.body.)");
	    Thread.sleep(5000);
	    // js.executeScript("window.scrollBy(0,-350)", "");
	     System.out.println("window moved to up");
	    //driver.close();

	}

}
