package Ekart;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import LocationPaths.Paths;

public class Profile extends Paths{

	WebDriver driver;
	
	public Profile(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	public void profile(){
		try {
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			//js.executeScript("window.scrollBy(0,document.body.scrollWidth)");
			js.executeScript("window.scrollBy(0,-1000)","");
			Thread.sleep(2000);
			if(LoggedIn.isEnabled())
				LoggedIn.click();
			else {
				System.out.println("Error in LoggedIn");
			}
			Thread.sleep(2000);
			if(Profile.isEnabled())
				Profile.click();
			else {
				System.out.println("Error in Profile");
			}
			Thread.sleep(2000);
			if(ManageProfile.isEnabled())
				ManageProfile.click();
			else {
				System.out.println("Error in ManageProfile");
			}
			Thread.sleep(2000);
			if(EditProfile.isEnabled())
				EditProfile.click();
			else {
				System.out.println("Error in EditProfile");
			}
			Thread.sleep(2000);
			if(FullName.isDisplayed()) {
				FullName.clear();
			    Thread.sleep(2000);
				FullName.sendKeys("GUPTHA TALLURI");
			}
				else {
					System.out.println("Error in FullName");
				}
			Thread.sleep(2000);
			if(Email.isDisplayed()) {
				Email.clear();
			    Thread.sleep(2000);
              Email.sendKeys("gupthatalluri@gmail.com");
			}
			else {
				System.out.println("Error in Email");
			}
			Thread.sleep(2000);
			if(ContactNumber.isDisplayed())
			{
				ContactNumber.clear();
				Thread.sleep(2000);
				ContactNumber.sendKeys("0123456789");	
			}
				else {
					System.out.println("Error in ContactNumber");
				}
			Thread.sleep(2000);
			if(Save.isEnabled())
				Save.click();
				else {
					System.out.println("Error in Save");
				}
			Thread.sleep(2000);
			if(Changepassword.isEnabled())
				Changepassword.click();
				else {
					System.out.println("Error in Changepassword");
				}
			Thread.sleep(2000);
			if(NewPassword.isDisplayed())
				NewPassword.sendKeys("gupthatalluri123");	
				else {
					System.out.println("Error in NewPassword");
				}
			Thread.sleep(2000);
			if(ReenterNewPassword.isDisplayed())
				ReenterNewPassword.sendKeys("gupthatalluri123");	
				else {
					System.out.println("Error in ReenterNewPassword");
				}
			Thread.sleep(2000);
			if(Save.isEnabled())
				Save.click();
				else {
					System.out.println("Error in Save");
				}
			Thread.sleep(5000);
			if(CustomerLogout.isEnabled())
				CustomerLogout.click();
		
		}catch(Exception e) {
			System.out.println("Error in Profile Method"+e.getMessage());
		}
	}
	    
		public void logOut(){
			try {
				if(CustomerLogout.isEnabled())
					CustomerLogout.click();
				
			}catch(Exception e) {
				System.out.println("Error in Logout"+e.getMessage());
			}
			
			
		}
	}
	

	

