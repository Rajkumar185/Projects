package Ekart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import LocationPaths.Paths;

public class Login extends Paths {
	
	WebDriver driver;

	public Login(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void signUp() {
		try {
			if(SignUp.isEnabled())
				SignUp.click();
			else {
				System.out.println("Error in SignUp");
			}
			Thread.sleep(2000);
			if(Username.isDisplayed())
				Username.sendKeys("Guptha");	
				else {
					System.out.println("Error in Username");
				}
			Thread.sleep(2000);
			if(FullName.isDisplayed())
				FullName.sendKeys("Talluri Guptha");	
				else {
					System.out.println("Error in FullName");
				}
			Thread.sleep(2000);
			
			if(Email.isDisplayed())
              Email.sendKeys("talluriguptha@gmail.com");	
			else {
				System.out.println("Error in Email");
			}
			Thread.sleep(2000);
			if(Password.isDisplayed())
				Password.sendKeys("Guptha@123");	
				else {
					System.out.println("Error in Password");
				}
			Thread.sleep(2000);
			if(ContactNumber.isDisplayed())
				ContactNumber.sendKeys("9876543210");	
				else {
					System.out.println("Error in ContactNumber");
				}
			Thread.sleep(2000);
			if(Register.isEnabled())
				Register.click();
			else {
				System.out.println("Error in Register");
			}
			Thread.sleep(2000);
			if(Back.isEnabled())
				Back.click();
			else {
				System.out.println("Error in Back");
			}
			Thread.sleep(2000);
			
			
		}catch(Exception e) {
			System.out.println("Error in createNewAccount"+e.getMessage());
		}
	}
	public void signIn() {
		try {
			if(Username.isDisplayed())
				Username.sendKeys("Guptha");	
				else {
					System.out.println("Error in Username");
				}
			Thread.sleep(2000);
			
			if(Password.isDisplayed())
				Password.sendKeys("Guptha@123");	
				else {
					System.out.println("Error in Password");
				}
			Thread.sleep(2000);
			if(LoginButton.isEnabled())
				LoginButton.click();
			else {
				System.out.println("Error in Login");
			}
			Thread.sleep(2000);
			
			
			
			
		}catch(Exception e) {
			System.out.println("Error in signIn Method"+e.getMessage());
		}
	}

}
