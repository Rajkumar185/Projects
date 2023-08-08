package demoQA.Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("searchBox")).sendKeys("Rajkumar");
		driver.findElement(By.id("addNewRecordButton")).click();
	   
	   driver.findElement(By.cssSelector("#firstName")).sendKeys("Rajkumar");
	   driver.findElement(By.cssSelector("#lastName")).sendKeys("Raj");
	   driver.findElement(By.cssSelector("#userEmail")).sendKeys("rajkumarraj@gmail.com");
	   driver.findElement(By.cssSelector("#age")).sendKeys("24");
	   driver.findElement(By.cssSelector("#salary")).sendKeys("30000");
	   driver.findElement(By.cssSelector("#department")).sendKeys("BCM");
	   driver.findElement(By.cssSelector("#submit")).click();
	   
	   driver.findElement(By.id("searchBox")).clear();
	   Thread.sleep(2000);
		driver.findElement(By.id("searchBox")).sendKeys("Rajkumar");
		WebElement table=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]"));
		System.out.print(table.getText());
	   driver.close();
		
		}

}
