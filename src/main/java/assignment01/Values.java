package assignment01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import locationpaths.Paths;

public class Values extends Paths{
	
	WebDriver driver;

	public Values(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void footer() throws InterruptedException {
		try {
//		if(Alert.isDisplayed()) {
//		Alert.click();
//		System.out.println(Alert.getText() +  "  button is Displayed");
//		}else {
//			System.out.println(Alert.getText() +"button is not Displayed");
//		}
//		    Thread.sleep(2000);
//		
		if(checkingfooter.isDisplayed()) {
			System.out.println(checkingfooter.getText() +"printing the Footer values");
		}else {
			System.out.println(checkingfooter.getText() +" Not printing the Footer values");
		}
		}catch(Exception e) {
			System.out.println("Error in footer method" +e.getMessage());
		}
	
		driver.close();
	}


}
