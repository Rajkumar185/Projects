package TestngAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import locationpaths.Paths;

public class AmazonWebsite {

	WebDriver driver;
	Paths p;

	
	
	@BeforeTest
	public void beforeSignin() throws InterruptedException {
		try {
		
		//System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 driver.manage().window().maximize();
		 driver.get("https:www.amazon.com");
		p=PageFactory.initElements(driver,Paths.class);
		// Thread.sleep(2000);
		 if(p.Signin1.isEnabled()) {
				Actions a = new Actions(driver);
				a.moveToElement(p.Signin1).build().perform();
				System.out.println(p.Signin1.getText() +" Signin Button is Enabled");
					}else {
						System.out.println(p.Signin1.getText() +" Signin Button is not Enabled");
					}
			   // Thread.sleep(5000);
			    if(p.clickonbutton.isEnabled()) {
					System.out.println(p.clickonbutton.getText()+"button is enabled");
					p.clickonbutton.click();
			    }
					else
					{
					System.out.println(p.clickonbutton.getText()+"button is not enabled");
				     }
				//Thread.sleep(2000);
			 
		}catch(Exception e) {
			System.out.println("Exception raised in beforeSigin method"+e.getMessage());
		}
		
	}
	@Test(dataProvider="SigninTestData")
	public void Signin(String username,String password) {
		try {
		
			if(p.emailorphoneno.isEnabled()) {
				p.emailorphoneno.sendKeys(username);
				System.out.println(p.emailorphoneno.getText() +"Phoneno Textbox is Displayed");
				}else {
				System.out.println(p.emailorphoneno.getText() +"Phoneno Textbox is not Displayed");
				}
				//Thread.sleep(2000);
				if(p.continues.isEnabled()) {
				p.continues.click();
				System.out.println(p.continues.getText()+"button is enabled");
				}
				else
				{
				System.out.println(p.continues.getText()+"button is not enabled");
				}
				if(p.passwordele.isDisplayed()) {
				p.passwordele.sendKeys(password);
				System.out.println(p.passwordele.getText() +"Password Textbox is Displayed");
      			}else {
				System.out.println(p.passwordele.getText() +"Password Textbox is not Displayed");
				}
				//Thread.sleep(5000);
				if (p.Signin.isEnabled()) {
					System.out.println(p.Signin.getText()+"button is  enabled");
					p.Signin.click();
				}
				else
				{
					System.out.println(p.Signin.getText()+"button is not enabled");
				}
		
		}catch(Exception e) {
			System.out.println("Exception raised in Signin method"+e.getMessage());
		}

	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
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
