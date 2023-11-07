/** Launching IRCTC Website and checking login homepage */
package seleniumassignment1;
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

public class Assignment01 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		 ChromeOptions options =new ChromeOptions();  //handling the permission popups in chrome browser
	     options.addArguments("disable-notifications");
		 WebDriver driver=new ChromeDriver(options);
	     driver.manage().window().maximize();
	     driver.get("https://www.irctc.co.in/nget/train-search"); //lauching the IRCTC website
	     driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//*[@id='launcherClose']")).click();
	     driver.findElement(By.cssSelector("i[class='fa fa-align-justify']")).click();//clicking on menu bar
         driver.findElement(By.cssSelector("button[class='search_btn']")).click();//clicking on Login button
         Boolean result=driver.findElement(By.xpath( "//*[@id='exampleModalLabel']/strong")).isDisplayed();//checking the Login page
         System.out.println(result);
         driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("Rajkumar");//entering the username in Login page
         driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Raj@7824");//entering the password
         Thread.sleep(2000);
         Actions a=new Actions(driver);
         WebElement move = driver.findElement(By.xpath("//*[@id='login_header_disable']/div//div[2]/form/span/button"));//clicking on Signin button
         a.moveToElement(move).click().build().perform();
         Thread.sleep(5000);
         System.out.println(driver.findElement(By.xpath("//div[@class='loginError']")).getText());//after clicking the SignIn button if any failure then the error will display
         WebElement  error=driver.findElement(By.xpath("//div[@class='loginError']"));
         a.moveToElement(error).build().perform();
         //it takes Screenshot if any failure 
         File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 	     FileUtils.copyFile(src,new File("C:\\Users\\pittala_rajkumar\\Pictures\\Saved Pictures\\screenshot1.jpg"));
 	     driver.close();//close the browser
	}

}

