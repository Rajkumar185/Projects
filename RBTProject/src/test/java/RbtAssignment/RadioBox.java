package RbtAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RadioBox {

WebDriver driver;
	
	public RadioBox(WebDriver driver) {
		super();
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="item-2")
	WebElement RadioBoxElement;
	@FindBy(xpath="//label[contains(text(),'Yes')]")
	WebElement yes;
	@FindBy(xpath="//*[@id='app']/div/div/div[2]/div[2]/div[2]/p")
	WebElement ResultMessage;
	
	@Test
	public void radioBoxInfo() {
		try{
			if(RadioBoxElement.isDisplayed()) {
				RadioBoxElement.click();;
				System.out.println("RadioBoxElement button is Clicked");
			}
			else
			{
				System.out.println("RadioBoxElement button is not Clicked");
			}
			
			if(yes.isEnabled()) {
				yes.click();
				System.out.println("yesRadiobox is selected");
			}
			else
			{
				System.out.println("yesRadiobox is not selected");
			}
			
			if(ResultMessage.isDisplayed()) {
				System.out.println(ResultMessage.getText());
				System.out.println("ResultMessage is displayed");
			}
			else
			{
				System.out.println("ResultMessage is not displayed");
			}
						System.out.println("RadioBox Element Executed Sucessfully");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception raised in RadioBox:"+e);
		}	
		}
}
