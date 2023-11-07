package assignment4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicXpath {
	
	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 Thread.sleep(2000);
		// driver.findElement(By.xpath("(//input)[2]")).sendKeys("Admin");
		 /*//input[@name='username'],
		 input[@placeholder='Username'],
		 (//input)[2],
		 (//*)[41],
		 //input[@*='Username'],
		  //input[@placeholder='Username' and  @name="username" ],
		   //input[@placeholder='Username'  or  @name="username" ],
		    //input[@placeholder='Username'  and not(name="sample") ],
		     //input[starts-with(@name,"user")],
		      //input[contains(@placeholder,'me')],
		       //*/
		 	
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'me')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[starts-with(@name,'pass')]")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit'   or @name='Reset']")).click();
		driver.close();

	}

}
