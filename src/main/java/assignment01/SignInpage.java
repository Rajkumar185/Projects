package assignment01;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import locationpaths.Paths;

public class SignInpage extends Paths{
	
	WebDriver driver;
	public SignInpage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void SignIn(String name,String pass) throws InterruptedException {
		try {
			if(username.isDisplayed()) {
		       username.sendKeys(name);
		       System.out.println(username.getText() +"Username Textbox is displayed");
			}else {
				System.out.println(username.getText()+"Username Textbox is not  displayed");
			}
			if(password.isDisplayed()) {
		    password.sendKeys(pass);
		    System.out.println(password.getText()+"Password Textbox is displayed");
			}else {
				 System.out.println(password.getText()+"Password Textbox is not displayed");
			}
		   // Thread.sleep(2000);
		 if(Signinbutton.isEnabled()) {
			 Actions a=new Actions(driver);
	       a.moveToElement(Signinbutton).click().build().perform();
	       System.out.println(Signinbutton.getText() +"Signin button is Enabled");
		 }else {
			 System.out.println(Signinbutton.getText() +"Signin button is not Enabled");
		 }
		 
        // Thread.sleep(2000);
	}
	catch(Exception e)
	{
		System.out.println("Error in Signin method" + e.getMessage());
	}
	}
	public void Screenshot() throws InterruptedException, IOException {
		try {
		if(mouseovertoerrormsg.isDisplayed()) {
			Actions a=new Actions(driver);
		 a.moveToElement(mouseovertoerrormsg).build().perform();
		 System.out.println(mouseovertoerrormsg.getText() +  "   Error message is Display");
		}else {
			 System.out.println(mouseovertoerrormsg.getText() +"Error message is not Display");
		}
		// Thread.sleep(2000);
		 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 	     FileUtils.copyFile(src,new File("C:\\Users\\pittala_rajkumar\\Pictures\\Saved Pictures\\screenshot10.jpg"));
 	     driver.close();//close the browser
		}
		catch(Exception e){
			System.out.println("Error in Screenshotmethod" + e.getMessage());
		}
	
	}
}
