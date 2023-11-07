/**Cucumber program pass all the test data from feature file using parameters.  */

package cucumber2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinationimpl {
	
	WebDriver driver;
	@Given("I landed on Amazon Website")
	public void I_landed_on_Amazon_Website() throws InterruptedException
	{		
		//System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup(); 
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https:www.amazon.com");
		 driver.navigate().refresh();
		 Actions a=new Actions(driver);
		 WebElement move=driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		 a.moveToElement(move).build().perform();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']/a/span")).click();

		
	}

	@Given("^Signin with emailorphonenumber (.+)  and click on continue$")
	 public void Signin_with_emailorphonenumber_and_click_on_continue(String phoneno)
	 {
		 driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys(phoneno);
		 driver.findElement(By.xpath("//*[@id='continue']")).click();
		
	 }		
	@And("^enter the password  (.+) and click on signin button$")
	public void enter_the_password_and_click_on_signin_button(String password) {
		 driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys(password);
		 driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
		
		
		
	    	}

	@Then("It redirecting to homepage")
	 public void it_redirecting_to_homepage() {
	  	}

	@When("cursor move  dropdown")
	public void cursor_move_dropdown() throws InterruptedException {
		Actions a1=new Actions(driver);
		 WebElement move1=driver.findElement(By.xpath("//*[@id='icp-nav-flyout']/span"));
		 a1.moveToElement(move1).build().perform();
		 Thread.sleep(2000);
		
	   }

	@Then("click on dropdown")
	public void click_on_dropdown() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id='icp-flyout-mkt-change']/span/div")).click();
		 Thread.sleep(2000);
		
	   }

	@And("change the country name in dropdown")
	public void change_the_country_name_in_dropdown() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='icp-dropdown']/span/span")).click();
		Actions a=new Actions(driver);
		WebElement dropdown=driver.findElement(By.xpath("//a[@id='icp-dropdown_7']"));
		 a.moveToElement(dropdown).click().build().perform();
		 Thread.sleep(2000);
	  	}

	@Then("It redirecting to home page")
	public void it_redirecting_to_home_page() throws InterruptedException {
		 driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		 Thread.sleep(2000);
		 driver.quit();
	
	 }


}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	 
