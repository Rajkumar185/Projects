/**TestNG program pass all the test data  using data providers */
package testngAssignment02;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	@Test(dataProvider="SigninTestData")
	public void Signin(String Phoneno,String password ) throws InterruptedException
	{
		try {
		 System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https:www.amazon.com");
		 driver.navigate().refresh();
		//using actions class
		 Actions a=new Actions(driver);
		 WebElement move=driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		 a.moveToElement(move).build().perform();
		 Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']/a/span")).click();
		 driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys(Phoneno);
		 driver.findElement(By.xpath("//*[@id='continue']")).click();
		 driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys(password);
		 driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
		 Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']")).isDisplayed());
		 Thread.sleep(2000);
		//String errormessage= driver.findElement(By.xpath("//*[@id='auth-error-message-box']/div/div/ul/li/span")).getText();
	   // System.out.println(errormessage);
		driver.quit();
		}catch(Exception e)
		{
			System.out.println("Exception is raised"+e.getMessage());
		}
		finally{
			System.out.println("Sucessfully signed in");
		}
	}
	
	@DataProvider(name="SigninTestData")
	public Object[][] signinData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="9182014723";
		data[0][1]="Rajkumar";
		
		
		data[1][0]="9182014723";
		data[1][1]="rajkumar";
		
		return data;
	}
	}
