package TestngAssignments;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import locationpaths.Paths;

public class IRCTCWebsite  {

	WebDriver driver;
	Paths ip;
	
	
   @BeforeTest
	public  void websitelaunching() {

		//System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
	   WebDriverManager.chromedriver().setup(); 
	   ChromeOptions options =new ChromeOptions();  //handling the permission popups in chrome browser
	     options.addArguments("disable-notifications");
		 driver=new ChromeDriver(options);
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	     driver.manage().window().maximize();
	     driver.get("https://www.irctc.co.in/nget/train-search"); //lauching the IRCTC website
	     ip=PageFactory.initElements(driver,Paths.class);
	}
	  @Test(priority=0)
	public void homepage() throws InterruptedException
	{
		try {
//			if(ip.Alert.isEnabled()) {
//				ip.Alert.click();
//				System.out.println(ip.Alert.getText() +"button is Enabled");
//			}
//			else
//			{
//				System.out.println(ip.Alert.getText() +" button is not Enabled");
//			}

		//Thread.sleep(2000);
		
		if(ip.Menubar.isEnabled()) {
		ip.Menubar.click();
		System.out.println(ip.Menubar.getText() +"Menubar button  is Enabled");
		}else {
			System.out.println(ip.Menubar.getText() +"Menubar button is not  Enabled");
		}
		
		//Thread.sleep(2000);
		if(ip.LoginButton.isEnabled()) {
			ip.LoginButton.click();
			System.out.println(ip.LoginButton.getText() +"LoginButton button  is Enabled");
		}else {
			System.out.println(ip.LoginButton.getText() +"LoginButton button  is  not Enabled");
		}
		
		//Thread.sleep(2000);
	}
  
  catch(Exception e) {
  	System.out.println("Exception raised  in  homepage" + e.getMessage());
  	
  }	
	}
	@Test(priority=2)
	public void signinpage() throws InterruptedException, IOException {
		try {
			if(ip.username.isDisplayed()) {
			       ip.username.sendKeys("Rajkumar");
			       System.out.println(ip.username.getText() +"Username Textbox is displayed");
				}else {
					System.out.println(ip.username.getText()+"Username Textbox is not  displayed");
				}
				if(ip.password.isDisplayed()) {
			    ip.password.sendKeys("Rajkumar185");
			    System.out.println(ip.password.getText()+"Password Textbox is displayed");
				}else {
					 System.out.println(ip.password.getText()+"Password Textbox is not displayed");
				}
			   // Thread.sleep(2000);
			 if(ip.Signinbutton.isEnabled()) {
				 Actions a=new Actions(driver);
		       a.moveToElement(ip.Signinbutton).click().build().perform();
		       System.out.println(ip.Signinbutton.getText() +"Signin button is Enabled");
			 }else {
				 System.out.println(ip.Signinbutton.getText() +"Signin button is not Enabled");
			 }
			 
	         //Thread.sleep(2000);
		
			}catch(Exception e)
		{
		System.out.println("Exception raised in signinpage"+e.getMessage());
		}
	}
	@Test(priority=3)
	public void Screenshot() {
		try {
			if(ip.mouseovertoerrormsg.isDisplayed()) {
				Actions a=new Actions(driver);
			 a.moveToElement(ip.mouseovertoerrormsg).build().perform();
			 System.out.println(ip.mouseovertoerrormsg.getText() +  "   Error message is Display");
			}else {
				 System.out.println(ip.mouseovertoerrormsg.getText() +"Error message is not Display");
			}
			// Thread.sleep(2000);
			 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 	     FileUtils.copyFile(src,new File("C:\\Users\\pittala_rajkumar\\Pictures\\Saved Pictures\\screenshot1.jpg"));
	 	     driver.close();//close the browser

			}
			catch(Exception e){
				System.out.println("Exception raised  in Screenshotmethod" + e.getMessage());
			}
	}
	@AfterTest
	public void closebrowser() {
	driver.quit();
		
	}
}
  



