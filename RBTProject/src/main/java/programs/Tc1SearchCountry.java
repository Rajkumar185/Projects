package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc1SearchCountry {
	
	static WebDriver driver;
	static String baseUrl ="https://www.google.com/";
	static String pathToChromeexe ="D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe";
	static String ExpTitle1 = "Google";
	static String ExpTitle2 = "India - Google Search";
	static String ActTitle1;
	static String ActTitle2;
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",pathToChromeexe );
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		ActTitle1=driver.getTitle();
		System.out.println("The Actual Title is "+ActTitle1);
	
		if (ActTitle1.equalsIgnoreCase(ExpTitle1)) {
			driver.findElement(By.name("q")).sendKeys("India");
			Thread.sleep(2000);
	
			driver.findElement(By.name("btnK")).click();
			Thread.sleep(2000);
			
			ActTitle2=driver.getTitle();
			System.out.println("The Actual Title is "+ActTitle2);
			
			WebElement india=driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/a"));
			System.out.println(india.getText());
			india.click();
			

			if (ActTitle2.equalsIgnoreCase(ExpTitle2)) {
				System.out.println("Test Case Passed!.");
			}
			else {
				System.out.println("Test Case Failed!.");
			}
			

			driver.close();		
		}
		else {
			System.out.println("Google Page was not loaded!");
		}
		
	}

}		




