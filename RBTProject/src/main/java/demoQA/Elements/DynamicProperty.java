package demoQA.Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicProperty {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement text=driver.findElement(By.tagName("p"));
		//WebElement text=driver.findElement(By.xpath("//p[@id='eoe34']"));
		System.out.println(text.getText());
		Thread.sleep(5000);
		WebElement enableAfter=driver.findElement(By.id("enableAfter"));
		enableAfter.click();
		System.out.println(enableAfter.getText());
		Thread.sleep(5000);
		WebElement colorChange=driver.findElement(By.id("colorChange"));
		colorChange.click();
		System.out.println(colorChange.getText());
		
		Thread.sleep(5000);
		WebElement visibleAfter=driver.findElement(By.id("visibleAfter"));
		visibleAfter.click();
		System.out.println(visibleAfter.getText());
		
      	////*[contains(text(),'This text has random Id ')]
		
		driver.close();

		}

}
