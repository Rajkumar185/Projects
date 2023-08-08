package demoQA.Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[contains(text(),'Yes')]")).click();
		
		WebElement message=driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/p"));
		System.out.println(message.getText());
		driver.close();
		
		}

}
