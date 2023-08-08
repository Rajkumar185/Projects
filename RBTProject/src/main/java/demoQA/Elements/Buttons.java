package demoQA.Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      	Actions a=new Actions(driver);
		WebElement doubleClick=driver.findElement(By.id("doubleClickBtn"));
		a.doubleClick(doubleClick).build().perform();
		WebElement RightClick=driver.findElement(By.id("rightClickBtn"));
		a.contextClick(RightClick).build().perform();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(2000);
		WebElement clickm=driver.findElement(By.xpath("(//button)[4]"));
		a.click(clickm).build().perform();
		WebElement message=driver.findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']"));
	    System.out.println(message.getText());
		
		
		driver.close();

		}

}
