package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			driver.findElement(By.id("inputUsername")).sendKeys("Raj");
			driver.findElement(By.name("inputPassword")).sendKeys("Raj123");
			driver.findElement(By.className("signInBtn")).click();
			System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
			driver.findElement(By.linkText("Forgot your password?")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rajkumar");
			driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rajkumarraj123@rsa.com");
			driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
			driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("rajkumarraj123@gmail.com.com");
			driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234566789");
			driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
			System.out.println(driver.findElement(By.xpath("//form/p")).getText());
			System.out.println(driver.findElement(By.cssSelector("form p")).getText()); //using cssSelector 
			driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Raj");
			driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
			driver.findElement(By.id("chkboxOne")).click();
			driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
			driver.close();


	}

}
