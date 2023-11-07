package assignment01;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import locationpaths.Paths;

public class Signin extends Paths{
	WebDriver driver;
	 
	public Signin(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void beforeSignin() throws InterruptedException {
		try {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		if(Alert.isEnabled()) {
	     js.executeScript("arguments[0].click();", Alert);
	     System.out.println(Alert.getText()+  "Button is Enabled");
		}else {
			 System.out.println(Alert.getText()+  "Button is not Enabled");
		}
	    // Thread.sleep(2000);
	     if(Advertise.isEnabled()) {
		     js.executeScript("arguments[0].click();", Advertise);
		     System.out.println(Advertise.getText()+  " Advertise Button is Enabled");
		     }else {
		    	 System.out.println(Advertise.getText()+  " Advertise Button is not Enabled");
		     }
		   
		    
	     if(Menubar.isEnabled()) {
	     js.executeScript("arguments[0].click();", Menubar);
	     System.out.println(Menubar.getText()+  " Menubar Button is Enabled");
	     }else {
	    	 System.out.println(Menubar.getText()+  " Menubar Button is not Enabled");
	     }
	     Thread.sleep(2000);
	     if(LoginButton.isEnabled()) {
	     js.executeScript("arguments[0].click();", LoginButton);
	     System.out.println(LoginButton.getText()+  " LoginButton Button is Enabled");
	     }else {
	    	 System.out.println(LoginButton.getText()+  " LoginButton Button is not Enabled");
	     }
	     
	}catch(Exception e){
		System.out.println("Error in the beforeSigin method" + e.getMessage());
	}
	}
	
	public void SignInApp(String name,String pass) throws InterruptedException {
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
				  //  Thread.sleep(2000);
				 if(Signinbutton.isEnabled()) {
					 Actions a=new Actions(driver);
			       a.moveToElement(Signinbutton).click().build().perform();
			       System.out.println(Signinbutton.getText() +"Signin button is Enabled");
				 }else {
					 System.out.println(Signinbutton.getText() +"Signin button is not Enabled");
				 }
				 
		         
			}
		catch(Exception e){
			System.out.println("Error in the SignInApp mathod");	
		}
	}
	public void Screenshotas() throws InterruptedException, IOException {
		
		try {
			if(mouseovertoerrormsg.isDisplayed()) {
				Actions a=new Actions(driver);
			 a.moveToElement(mouseovertoerrormsg).build().perform();
			 System.out.println(mouseovertoerrormsg.getText() +  "   Error message is Display");
			}else {
				 System.out.println(mouseovertoerrormsg.getText() +"Error message is not Display");
			}
			
		 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 	     FileUtils.copyFile(src,new File("C:\\Users\\pittala_rajkumar\\Pictures\\Saved Pictures\\screenshot1.jpg"));
 	     driver.close();//close the browser
		}catch(Exception e) {
			
			System.out.println("Error in ScreenShotas Method");
			
		}
	
	}

	
	

}
