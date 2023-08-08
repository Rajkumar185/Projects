package RbtAssignment;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Textbox {
	
		
		WebDriver driver;
		
		public Textbox(WebDriver driver) {
			super();
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(id="item-0")
		WebElement TextboxElement;
		@FindBy(id="userName")
		WebElement Username;
		@FindBy(id="userEmail")
		WebElement Email;
		@FindBy(id="currentAddress")
		WebElement CurrentAddress;
		@FindBy(id="permanentAddress")
		WebElement PermanentAddress;
		@FindBy(id="submit")
		WebElement Submit;
		@FindBy(xpath="//*[@id='output']/div")
		WebElement Message;
		
		@Test
		public void textinfo() {
			
		try{
			if(TextboxElement.isDisplayed()) {
				TextboxElement.click();;
				System.out.println("Textbox button is Clicked");
			}
			else
			{
				System.out.println("Textbox button is not Clicked");
			}
			
			if(Username.isDisplayed()) {
				Username.sendKeys("Rajkumar");
				System.out.println("Entered the Username Sucessfully");
			}
			else
			{
				System.out.println("UserName is not Entered");
			}
			
			if(Email.isDisplayed()) {
				Email.sendKeys("rajkumarraj@gmail.com");
				System.out.println("Entered the Email Sucessfully");
			}
			else
			{
				System.out.println("Email is not Entered");
			}
			if(CurrentAddress.isDisplayed()) {
				CurrentAddress.sendKeys("1-2-3,karimabad,warangal,telangana 506002");
				System.out.println("Entered the CurrentAddress Sucessfully");
			}
			else
			{
				System.out.println("CurrentAddress is not Entered");
			}
			if(PermanentAddress.isDisplayed()) {
				PermanentAddress.sendKeys("1-2-3,karimabad,warangal,telangana 506002");
				System.out.println("Entered the PermanentAddress Sucessfully");
			}
			else
			{
				System.out.println("PermanentAddress is not Entered");
			}

			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,300)");
			//Thread.sleep(2000);
			if(Submit.isDisplayed()) {
				Submit.click();
				System.out.println("Submit button is Enabled");
			}else {
				System.out.println("Submit button is Not Enabled");
			}
			if(Message.isDisplayed()) {
				System.out.println(Message.getText());
				System.out.println("Entered TextBox details is Displayed");
			}
			else
			{
				System.out.println("Entered TextBox details is Not Displayed");
			}
			System.out.println("Textbox Element Executed Sucessfully");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception raised in Textbox:"+e);
		}
}
}
