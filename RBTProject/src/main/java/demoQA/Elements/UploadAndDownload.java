package demoQA.Elements;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadAndDownload {

	public static void main(String[] args) throws InterruptedException {
		
		
	
		System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//driver.findElement(By.id("downloadButton")).click();
		Actions a=new Actions(driver);
		//WebElement upload=driver.findElement(By.tagName("input"));
		WebElement upload=driver.findElement(By.cssSelector("#uploadFile"));
		a.click(upload).build().perform();
		Thread.sleep(2000);
		upload.sendKeys("D:\\sel\\newhtml.html");
		
      	
	    // driver.close();

		}

}
