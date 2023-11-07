package assignment01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import locationpaths.Paths;

public class Landingpage extends Paths{
	WebDriver driver;
	
	
	public Landingpage(WebDriver driver) {
		
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
		public void landingpageonwebsite() throws InterruptedException {
			// TODO Auto-generated method stub
//			try {
//				if(Alert.isEnabled()) {
//					Alert.click();
//					System.out.println(Alert.getText() +"button is Enabled");
//				}
//				else
//				{
//					System.out.println(Alert.getText() +" button is not Enabled");
//				}
//	
			//Thread.sleep(2000);
				
			if(Menubar.isEnabled()) {
			Menubar.click();
			System.out.println(Menubar.getText() +"Menubar button  is Enabled");
			}else {
				System.out.println(Menubar.getText() +"Menubar button is not  Enabled");
			}
			
			Thread.sleep(2000);
			if(LoginButton.isEnabled()) {
				LoginButton.click();
				System.out.println(LoginButton.getText() +"LoginButton button  is Enabled");
			}else {
				System.out.println(LoginButton.getText() +"LoginButton button  is  not Enabled");
			}
			
			//Thread.sleep(2000);
		}
        
//        catch(Exception e) {
//        	System.out.println("error in landingpage " + e.getMessage());
//        	
//        }
//		}

}

