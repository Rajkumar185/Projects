/**5.	Where do we use Java script executor */
package mockInterviewprograms;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptDemo {
	
	
	   @Test		
	    public void Login() 					
	    {		
		   System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
			
	        //Creating the JavascriptExecutor interface object by Type casting		
	        JavascriptExecutor js = (JavascriptExecutor)driver;		
	        		
	        //Launching the Site.		
	        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S302856685%3A1669295539398191&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=ARgdvAvkC380jxHcXniA44u2PCwgxYQRxQSI04Bt5_fmeTcUmt2ewc54BN9BCLdyLhtxVru8mQ3hIg");			
	        		
	        WebElement button =driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/span"));			
	        		
	       
	        driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("Rajkumarraj@gmail.com");					
	      				
	        		
	        //Perform Click on LOGIN button using JavascriptExecutor		
	        js.executeScript("arguments[0].click();", button);
	                                
	        //To generate Alert window using JavascriptExecutor. Display the alert message 			
	        js.executeScript("alert('please enter correct email ')");   
	    		
	 
	    }

}
