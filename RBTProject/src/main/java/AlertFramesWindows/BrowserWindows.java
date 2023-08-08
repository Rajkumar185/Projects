package AlertFramesWindows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserWindows {

	public static void main(String[] args) throws InterruptedException {
	
//		System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe" );
//		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.edge.driver","D:\\sel\\temp\\edgedriver_win64\\msedgedriver.exe" );
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("tabButton")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().to("https://demoqa.com/browser-windows");
		//Thread.sleep(2000);
		//WebElement newTab=driver.findElement(By.xpath("//*[contains(text(),'This is a sample page')]"));
	//	WebElement newTab=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
//		WebElement newTab=driver.findElement(By.xpath("//*[@id='sampleHeading']"));
//		
//		System.out.println(newTab.getText());
		//driver.switchTo().
	//	driver.findElement(By.cssSelector("#sampleHeading"));
        
        driver.findElement(By.id("windowButton")).click();
		driver.navigate().back();
        driver.findElement(By.id("messageWindowButton")).click();
        //driver.close();
        //driver.quit();

	}

}
