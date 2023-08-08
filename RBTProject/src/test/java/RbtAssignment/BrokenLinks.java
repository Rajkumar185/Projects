package RbtAssignment;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrokenLinks {

	WebDriver driver;
		
		public BrokenLinks(WebDriver driver) {
			super();
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(id="item-6")
		WebElement BrokenLinkElement;
		@FindBy(linkText="Click Here for Valid Link")
		WebElement Validlink;
		@FindBy(linkText="Click Here for Broken Link")
		WebElement Brokenlink;
		@FindBy(id="content")
		WebElement LinkContent;
		public void brokenLinkInfo() {
			try{
				if(BrokenLinkElement.isDisplayed()) {
					BrokenLinkElement.click();
					System.out.println("BrokenLinkElement button is Clicked");
				}
				else
				{
					System.out.println("BrokenLinkElement button is not Clicked");
				}
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				JavascriptExecutor js= (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,400)");
				Thread.sleep(2000);
				if(Validlink.isDisplayed()) {
					Validlink.click();
					System.out.println("Validlink is Clicked");
				}
				else
				{
					System.out.println("Validlink is not Clicked");
				}
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				driver.navigate().back();
				if(Brokenlink.isDisplayed()) {
					Brokenlink.click();
					System.out.println("Brokenlink is Clicked");
				}
				else
				{
					System.out.println("Brokenlink is not Clicked");
				}
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				driver.navigate().back();
				
					if(LinkContent.isDisplayed()) {
						LinkContent.getText();
						System.out.println(driver.getCurrentUrl());
						System.out.println(driver.getTitle());
						driver.navigate().back();
						System.out.println("LinkContent is Retreived");
						driver.close();
					}
					else
					{
						System.out.println("LinkContent is not Retreived");
					}
					
					System.out.println("BrokenLinkElement Executed Sucessfully");

						}
				catch(Exception e) {
					e.printStackTrace();
					System.out.println("Exception raised in BrokenLinks:"+e);
				}


	}

}
//System.out.println(driver.getCurrentUrl());
//System.out.println(driver.getTitle());
//JavascriptExecutor js= (JavascriptExecutor)driver;
//js.executeScript("window.scrollBy(0,400)");
//Thread.sleep(2000);
//WebElement validlink=driver.findElement(By.linkText("Click Here for Valid Link"));
//validlink.click();
//System.out.println(driver.getCurrentUrl());
//System.out.println(driver.getTitle());
//driver.navigate().back();
//WebElement brokenlink=driver.findElement(By.linkText("Click Here for Broken Link"));
//brokenlink.click();
//System.out.println(driver.findElement(By.id("content")).getText());
//System.out.println(driver.getCurrentUrl());
//System.out.println(driver.getTitle());
//driver.navigate().back();
//
//driver.close();
