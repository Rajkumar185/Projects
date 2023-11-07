package RBT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTestCase001_Verification {
	static WebDriver driver;
	static String baseUrl ="https://www.google.com/";
	static String pathToChromeexe ="D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe";
	static String ExpTitle1 = "Google";
	static String ExpTitle2 = "Australia - Google Search";
	static String ActTitle1;
	static String ActTitle2;
	
	public static void main(String[] args) throws InterruptedException {
		/*    Browser is opened.
		 * 	1. Open Google Page.
			2. Enter the keyword.
			3. Click on the search icon.
			
		Expected Output -
			1. Title changes to 'Google'.
			2. The entered keyword is displayed.
			3. Search Page with relavent title is displayed.
		 */
//	    Pre-requiste
		System.setProperty("webdriver.chrome.driver",pathToChromeexe );
		driver = new ChromeDriver();
		
//		Step1:
		driver.get(baseUrl);
		
//		VP - Expected Title
		ActTitle1=driver.getTitle();
		System.out.println("The Actual Title is "+ActTitle1);
		
		if (ActTitle1.equalsIgnoreCase(ExpTitle1)) {
//			Step2:
			driver.findElement(By.name("q")).sendKeys("Australia");
			Thread.sleep(2000);
			
//			Step3:
			driver.findElement(By.name("btnK")).click();
			Thread.sleep(2000);
			
			ActTitle2=driver.getTitle();
			System.out.println("The Actual Title is "+ActTitle2);

			if (ActTitle2.equalsIgnoreCase(ExpTitle2)) {
				System.out.println("Test Case Passed!.");
			}
			else {
				System.out.println("Test Case Failed!.");
			}
			
//			Close the browser
			driver.close();		
			

		}
		else {
			System.out.println("Google Page was not loaded!");
		}
		
	}

}
