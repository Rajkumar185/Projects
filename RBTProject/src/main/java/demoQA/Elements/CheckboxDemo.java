package demoQA.Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckboxDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//this path for selecting all checkboxes
//		driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/span/label/span[3]")).click();
//		WebElement result=driver.findElement(By.id("result"));
//		System.out.println(result.getText());//for getting the selected message
//		
		//this path for clicking the checkbox options
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/button[1]")).click();
		//slecting only document checkbox
		driver.findElement(By.xpath("//span[contains(text(),'Documents')]")).click();
		WebElement result=driver.findElement(By.id("result"));
		System.out.println(result.getText());//for getting the selected message

		driver.close();
		
		}

}
