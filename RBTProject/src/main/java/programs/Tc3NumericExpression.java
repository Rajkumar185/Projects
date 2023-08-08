package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc3NumericExpression {

	
	static WebDriver driver;
	static String baseUrl ="https://www.google.com/";
	static String pathToChromeexe ="D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe";
	static String ExpTitle1 = "Google";
	static String ExpTitle2 = "2+5+10-5 - Google Search";
	static String ActTitle1;
	static String ActTitle2;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",pathToChromeexe );
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		ActTitle1=driver.getTitle();
		System.out.println("The Actual Title is "+ActTitle1);
	
		if (ActTitle1.equalsIgnoreCase(ExpTitle1)) {
			driver.findElement(By.name("q")).sendKeys("2+5+10-5");
			Thread.sleep(2000);
	
			driver.findElement(By.name("btnK")).click();
			Thread.sleep(2000);
			
			ActTitle2=driver.getTitle();
			System.out.println("The Actual Title is "+ActTitle2);
			
			Thread.sleep(2000);
			WebElement result=driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/div[1]/div[2]"));
			System.out.println(result.getText());
			

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
