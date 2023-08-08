package RbtAssignment;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Buttons {
	
WebDriver driver;
	
	public Buttons(WebDriver driver) {
		super();
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="item-4")
	WebElement ButtonElement;
	@FindBy(id="doubleClickBtn")
	WebElement DoubleClick;
	@FindBy(id="rightClickBtn")
	WebElement RightClick;
	@FindBy(xpath="(//button)[4]")
	WebElement ClickMe;
	@FindBy(xpath="//div[@class='col-12 mt-4 col-md-6']")
	WebElement ResultMessage;
	

	@Test
	public void buttonInfo() {
		try{
		
			if(ButtonElement.isDisplayed()) {
				ButtonElement.click();
				//a.click(ButtonElement).build().perform();
				System.out.println("ButtonElement button is Clicked");
			}
			else
			{
				System.out.println("ButtonElement button is not Clicked");
			}
			
			if(DoubleClick.isDisplayed()) {
				Actions a=new Actions(driver);

				a.doubleClick(DoubleClick).build().perform();
				System.out.println("DoubleClick button is Clicked");
			}
			else
			{
				System.out.println("DoubleClick button is not Clicked");
			}
			
			if(RightClick.isDisplayed()) {
				Actions a=new Actions(driver);

				a.contextClick(RightClick).build().perform();
				System.out.println("RightClick button is Clicked");
			}
			else
			{
				System.out.println("RightClick button is not Clicked");
			}
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,400)");
			Thread.sleep(2000);

			if(ClickMe.isDisplayed()) {
				Actions a=new Actions(driver);

				a.click(ClickMe).build().perform();
				System.out.println("ClickMe button is Clicked");
			}
			else
			{
				System.out.println("ClickMe button is not Clicked");
			}
			if(ResultMessage.isDisplayed()) {
				System.out.println(ResultMessage.getText());
				System.out.println("ResultMessage is retrived");
			}
			else
			{
				System.out.println("ResultMessage  is not retrived");
			}
			
			
		System.out.println("Button Element Executed Sucessfully");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception raised in Button:"+e);

		}
	  
		}
}
//	Actions a=new Actions(driver);
//WebElement doubleClick=driver.findElement(By.id("doubleClickBtn"));
//a.doubleClick(doubleClick).build().perform();
//WebElement RightClick=driver.findElement(By.id("rightClickBtn"));
//a.contextClick(RightClick).build().perform();
//Thread.sleep(2000);
//JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("window.scrollBy(0,400)");
//
//Thread.sleep(2000);
//WebElement clickm=driver.findElement(By.xpath("(//button)[4]"));
//a.click(clickm).build().perform();
//WebElement message=driver.findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']"));
//System.out.println(message.getText());
//
//
//driver.close();
//
