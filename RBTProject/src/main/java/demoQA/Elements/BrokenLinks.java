package demoQA.Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/broken");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		WebElement validlink=driver.findElement(By.linkText("Click Here for Valid Link"));
		validlink.click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().back();
		WebElement brokenlink=driver.findElement(By.linkText("Click Here for Broken Link"));
		brokenlink.click();
		System.out.println(driver.findElement(By.id("content")).getText());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		driver.close();
		

	}

}
