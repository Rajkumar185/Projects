package RbtAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CheckboxDemo {
	
	WebDriver driver;
	
	public CheckboxDemo(WebDriver driver) {
		super();
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="item-1")
	WebElement CheckBoxElement;
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/button[1]")
	WebElement CheckBox;
	@FindBy(xpath="//span[contains(text(),'Documents')]")
	WebElement DocumentCheckBox;
	@FindBy(id="result")
	WebElement ResultMessage;
	
	@Test
	public void checkBoxInfo() {
		try{
			if(CheckBoxElement.isDisplayed()) {
				CheckBoxElement.click();;
				System.out.println("CheckBoxElement button is Clicked");
			}
			else
			{
				System.out.println("CheckBoxElement button is not Clicked");
			}
			
			if(CheckBox.isEnabled()) {
				CheckBox.click();
				System.out.println("CheckBox is selected");
			}
			else
			{
				System.out.println("CheckBox is not selected");
			}
			
			if(DocumentCheckBox.isEnabled()) {
				DocumentCheckBox.click();
				System.out.println("DocumentCheckBox is Selected");
			}
			else
			{
				System.out.println("DocumentCheckBox is not Selected");
			}
			if(ResultMessage.isDisplayed()) {
				System.out.println(ResultMessage.getText());
				System.out.println("ResultMessage is displayed");
			}
			else
			{
				System.out.println("ResultMessage is not displayed");
			}
						System.out.println("CheckBox Element Executed Sucessfully");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception raised in CheckboxDemo:"+e);
		}
	}	
	
		}


