package cucumber1;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

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
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefi {
	
	WebDriver driver;
	
 	@Given("Launch IRCTC Website")
	public void Launch_IRCTC_Website() throws InterruptedException{
		
		//System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
 		WebDriverManager.chromedriver().setup();
		ChromeOptions options =new ChromeOptions();
	    options.addArguments("disable-notifications");
	    driver =new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.get("https://www.irctc.co.in/nget/train-search");
	    Thread.sleep(5000);
	  	}

	@Given("check alerts and click on menubar")
	public void check_alerts_and_click_on_menubar() throws InterruptedException {
//		 driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
//	     Thread.sleep(5000);
	     driver.findElement(By.cssSelector("i[class='fa fa-align-justify']")).click();
	     Thread.sleep(5000);
	   	}

	@And("click on Login Button")
	public void click_on_Login_Button() throws InterruptedException {
		driver.findElement(By.xpath( "//button[@class='search_btn']")).click();
       Thread.sleep(5000);
	   	}
	@When("^Enter valid name (.+) and invalid password(.+)$")
	public void Enter_valid_name_and_invalid_password(String name,String password) throws InterruptedException {
	
		 driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys(name);
         driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
         Thread.sleep(5000);
	}

	@Then("click on the siginButton")
	public void click_on_the_siginButton() throws InterruptedException {
		
		Actions a=new Actions(driver);
        WebElement move = driver.findElement(By.xpath("//*[@id='login_header_disable']/div//div[2]/form/span/button"));
        a.moveToElement(move).click().build().perform();
        Thread.sleep(5000);
        
		
	}

	@Then("Error msg should be displayed")
	public void Error_msg_should_be_displayed() {
		  System.out.println(driver.findElement(By.xpath("//div[@class='loginError']")).getText());
		
	   	}

	@Then("Take error screenshot")
	public void Take_error_screenshot() throws IOException {
		
		    WebElement  error=driver.findElement(By.xpath("//div[@class='loginError']"));
		    Actions a=new Actions(driver);
	        a.moveToElement(error).build().perform();
	        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 	    FileUtils.copyFile(src,new File("C:\\Users\\pittala_rajkumar\\Pictures\\Saved Pictures\\screenshot1.jpg"));
	  	}
	
	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	}

	



}
