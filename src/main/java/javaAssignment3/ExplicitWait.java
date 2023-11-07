package javaAssignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	public static void  main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    
		//WebDriverWait wait= new WebDriverWait(driver, 20);
		String eTitle = "IRCTC Next Generation eTicketing System";
		String aTitle = "" ;
		driver.get("https://www.irctc.co.in/nget/train-search" );
		driver.manage().window().maximize() ;
		aTitle = driver.getTitle();
		if (aTitle.contentEquals(eTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
		}
//		WebElement guru99seleniumlink;
//		guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
//		guru99seleniumlink.click();
		}
		
	}


