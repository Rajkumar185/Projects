package assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeOfWindow {

	public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	        driver.get("https://www.google.com/");
	        driver.findElement(By.xpath("//input[contains(@title,'Search')]")).sendKeys("MvnRepository");
	        driver.findElement(By.xpath("(//input)[2]")).click();
	        driver.switchTo().newWindow(WindowType.TAB);
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        driver.findElement(By.xpath("//input[contains(@placeholder,'me')]")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[starts-with(@name,'pass')]")).sendKeys("admin123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@type='submit'   or @name='Reset']")).click();
			
	      List<String>window=new ArrayList<String>(driver.getWindowHandles());
	      System.out.println("Total windows open:"+window.size());
	      driver.quit();

	}

}
