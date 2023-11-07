package interviewQuestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.get("https:www.amazon.com");
		driver.get("https://www.javatpoint.com/selenium-interview-questions");
		//How to refresh a webpage
		driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());
		driver.navigate().to(driver.getCurrentUrl());
		driver.findElement(By.id("")).sendKeys(Keys.F5);
		driver.findElement(By.id("")).sendKeys("\uE035");  

		
//		Actions a=new Actions(driver);
//		WebElement ele=driver.findElement(By.id("searchDropdownBox"));
//		a.contextClick(ele).perform();

	}

}
