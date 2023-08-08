package RbtAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicProperty {

	WebDriver driver;

	
	public DynamicProperty(WebDriver driver) {
		super();
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="item-8")
	WebElement DynamicPropertyElement;
	@FindBy(tagName="p")
	WebElement Text;
	@FindBy(id="enableAfter")
	WebElement EnableAfter;
	@FindBy(id="colorChange")
	WebElement ColorChange;
	@FindBy(id="visibleAfter")
	WebElement VisibleAfter;
	
	public void dynamicPropertyInfo() {
		Actions a=new Actions(driver);
		try{
			
			if(DynamicPropertyElement.isDisplayed()) {
				DynamicPropertyElement.click();
				System.out.println("DynamicPropertyElement button is Clicked");
			}
			else
			{
				System.out.println("DynamicPropertyElement button is not Clicked");
			}
			if(Text.isDisplayed()) {
				System.out.println(Text.getText());
				System.out.println("Text is retrived");
			}
			else
			{
				System.out.println("Text is not retrived");
			}
			Thread.sleep(5000);
			if(EnableAfter.isDisplayed()) {
				EnableAfter.click();
				System.out.println(EnableAfter.getText());
				System.out.println("button is Clicked and Text is retrived");
			}
			else
			{
				System.out.println("button is not Clicked and Text is not retrived");
			}
			Thread.sleep(2000);
			if(ColorChange.isDisplayed()) {
				System.out.println(ColorChange.getText());
				ColorChange.click();
				System.out.println("Text is retrived");
			}
			else
			{
				System.out.println("Text is not retrived");
			}
			Thread.sleep(5000);
			if(VisibleAfter.isDisplayed()) {
				System.out.println(VisibleAfter.getText());
				VisibleAfter.click();
				System.out.println("Text is retrived");
			}
			else
			{
				System.out.println("Text is not retrived");
			}
			System.out.println("DynamicPropertyElement Executed Sucessfully");

		}
catch(Exception e) {
	e.printStackTrace();
	System.out.println("Exception raised in DynamicProperty:"+e);
}


	}
}
//WebElement text=driver.findElement(By.tagName("p"));
////WebElement text=driver.findElement(By.xpath("//p[@id='eoe34']"));
//System.out.println(text.getText());
//Thread.sleep(5000);
//WebElement enableAfter=driver.findElement(By.id("enableAfter"));
//enableAfter.click();
//System.out.println(enableAfter.getText());
////Thread.sleep(5000);
//WebElement colorChange=driver.findElement(By.id("colorChange"));
////colorChange.click();
//System.out.println(colorChange.getText());
//
////Thread.sleep(5000);
//WebElement visibleAfter=driver.findElement(By.id("visibleAfter"));
////visibleAfter.click();
//System.out.println(visibleAfter.getText());
//
//	////*[contains(text(),'This text has random Id ')]
//
//driver.close();

