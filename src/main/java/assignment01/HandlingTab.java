package assignment01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingTab {

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https:www.google.com");
	     //driver.switchTo().newWindow(WindowType.TAB);//opening the new tab in window 
	     driver.switchTo().newWindow(WindowType.WINDOW);//opening the new  window in the browser
	    System.out.println(driver.getTitle());
	     Thread.sleep(2000);
	     driver.close();//closing the opened tab in browser
	     driver.quit();//closing the browser 
	    

	}

}
