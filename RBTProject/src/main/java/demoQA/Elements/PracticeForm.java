package demoQA.Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PracticeForm {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("firstName")).sendKeys("Rajkumar");
		driver.findElement(By.id("lastName")).sendKeys("Raj");
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("rajkumarraj@gmail.com");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.cssSelector("label[for='gender-radio-1']")).click();
		driver.findElement(By.cssSelector("#userNumber")).sendKeys("9876543210");
		
		WebElement datepicker=driver.findElement(By.id("dateOfBirthInput"));
		datepicker.click();
		
		Select Month= new Select(driver.findElement(By.cssSelector(".react-datepicker__month-select")));
		Month.selectByVisibleText("January");
	   // Month.selectByValue("0");
	    //Month.selectByIndex(0);
		Select year= new Select(driver.findElement(By.cssSelector(".react-datepicker__year-select")));
		year.selectByVisibleText("2000");
		
		driver.findElement(By.cssSelector("div[aria-label='Choose Sunday, January 9th, 2000']")).click();
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		WebElement spec=driver.findElement(By.xpath("//*[@id='subjectsContainer']/div/div[1]"));
		a.sendKeys(spec, "NA").perform();
//		
		Thread.sleep(2000);
		WebElement sports=driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
		sports.click();
		Thread.sleep(2000);
		
		WebElement upload=driver.findElement(By.cssSelector("#uploadPicture"));
		//a.click(upload).perform();
		upload.sendKeys("D:\\sel\\details.properties");
		
		driver.findElement(By.id("currentAddress")).sendKeys("karimabad,warangal");
		
		WebElement submit=driver.findElement(By.id("submit"));
		a.click(submit);
		
	}

	
}
