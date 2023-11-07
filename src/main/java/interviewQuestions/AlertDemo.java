package interviewQuestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
		
		System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);             		
       driver.get("http://demo.guru99.com/test/delete_customer.php");			
        driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).click();		     
        Alert alert = driver.switchTo().alert();		
        String alertMessage= driver.switchTo().alert().getText();			
        System.out.println(alertMessage);	
        Thread.sleep(5000);		
        alert.accept();		
        driver.close();
    }	

}