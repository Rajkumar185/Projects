package Ekart;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import LocationPaths.Paths;

public class LandingPage extends Paths {
	
	WebDriver driver;

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void homePageScrollDown() {
		try {
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			//js.executeScript("window.scrollBy(0,500)","");
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			//js.executeScript("window.scrollBy(0,document.body.scrollWidth)");
			js.executeScript("window.scrollBy(0,-1000)","");
			
		}catch(Exception e) {
			System.out.println("Error in homePageScrollDown method"+e.getMessage());
		}
	}
	public void categories() {
		try {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			if(Categories.isEnabled()) {
				Categories.click();
			}
			else {
				System.out.println("Error in Categories");
			}
			if(Accessories.isEnabled()) {
				Accessories.click();
			}else {
				System.out.println("Error in Accessories");
			}
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,800)","");
			Thread.sleep(2000);
			if(Watch.isEnabled())
				Watch.click();
			else {
				System.out.println("Error in Watch");
			}
			Thread.sleep(2000);
			Increase.click();
			Thread.sleep(2000);
			decrease.click();
			Thread.sleep(2000);
			if(AddToCart.isEnabled())
				AddToCart.click();
			else {
				System.out.println("Error in AddToCart");
			}		
	}catch(Exception e) {
		
		System.out.println("Error in categories Method"+e.getMessage());
	}
	
	}
	public void Login() {
		try {
			if(Login.isEnabled())
				Login.click();
			else {
				System.out.println("Error in Login");
			}
			
		}catch(Exception e) {
			System.out.println("Error in Login"+e.getMessage());
		}
	}
}
