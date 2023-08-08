package cucumber1;


import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class LoginStepDemo {
	
	WebDriver driver;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
	    options.addArguments("disable-notifications");
	     driver =new ChromeDriver(options);
	     driver.manage().window().maximize();
		}
	@And("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		 driver.get("https://www.irctc.co.in/nget/train-search");
		 driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.cssSelector("i[class='fa fa-align-justify']")).click();
         driver.findElement(By.cssSelector("button[class='search_btn']")).click();
         Boolean result=driver.findElement(By.xpath( "//*[@id='exampleModalLabel']/strong")).isDisplayed();
         System.out.println(result);
         
	    }

	@When("user enter the username and password")
	public void user_enter_the_username_and_password() throws InterruptedException {
		 driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("Rajkumar");
         driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456");
         Thread.sleep(2000);
	   	}
	@And("click on signin button")
	public void click_on_signin_button() throws InterruptedException, IOException {
		Actions a=new Actions(driver);
        WebElement move = driver.findElement(By.xpath("//*[@id='login_header_disable']/div//div[2]/form/span/button"));
       a.moveToElement(move).click().build().perform();
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.xpath("//div[@class='loginError']")).getText());
        WebElement  error=driver.findElement(By.xpath("//div[@class='loginError']"));
        a.moveToElement(error).build().perform();
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 	    FileUtils.copyFile(src,new File("D:\\sel\\screenshot1.jpg"));
 	  
	   	}
	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	    
	}



}
