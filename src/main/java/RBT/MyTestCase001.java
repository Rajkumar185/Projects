package RBT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTestCase001 {
	static WebDriver driver;
	static String baseUrl ="https://www.google.com/";
	static String pathToChromeexe ="D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe";
	
	public static void main(String[] args) throws InterruptedException {
		/*    Browser is opened.
		 * 	1. Open Google Page.
			2. Enter the keyword.
			3. Click on the search icon.
		 */
//	    Pre-requiste
		System.setProperty("webdriver.chrome.driver",pathToChromeexe );
		driver = new ChromeDriver();
		
//		Step1:
		driver.get(baseUrl);
		
//		Step2:
		driver.findElement(By.name("q")).sendKeys("Australia");
		Thread.sleep(2000);
		
//		Step3:
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		
//		Close the browser
		driver.close();		
		
	}

}
