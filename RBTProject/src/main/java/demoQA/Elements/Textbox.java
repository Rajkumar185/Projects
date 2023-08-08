package demoQA.Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Textbox {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		System.setProperty("webdriver.edge.driver","D:\\sel\\temp\\edgedriver_win64\\msedgedriver.exe");
//	    WebDriver driver=new EdgeDriver();
//	    
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		driver.findElement(By.id("userName")).sendKeys("Rajkumar");
		//driver.findElement(By.cssSelector("#userName")).sendKeys("Rajkumar");
		//driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Rajkumar");
		//driver.findElement(By.xpath("(//input)[1]")).sendKeys("Rajkumar");
		//driver.findElement(By.cssSelector("(input)[1]")).sendKeys("Rajkumar");
		//driver.findElement(By.cssSelector(". mr-sm-2 form-control")).sendKeys("Rajkumar");
		driver.findElement(By.id("userEmail")).sendKeys("rajkumarraj@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("1-2-3,karimabad,warangal,telangana 506002");
		driver.findElement(By.id("permanentAddress")).sendKeys("1-2-3,karimabad,warangal,telangana 506002");
		driver.findElement(By.id("submit")).click();
		//Thread.sleep(2000);
		WebElement details=driver.findElement(By.xpath("//*[@id='output']/div"));
		System.out.println(details.getText());
		driver.close();
		

	}

}
