package RbtAssignment;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Links {
	
WebDriver driver;
String url="";
	
	public Links(WebDriver driver) {
		super();
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="item-5")
	WebElement LinkElement;
	@FindBy(tagName="a")
	List<WebElement> AllLinks;
	@FindBy(id="simpleLink")
	WebElement Home;
	public void linkInfo() {
		try{
			if(LinkElement.isDisplayed()) {
				LinkElement.click();
				System.out.println("LinkElement button is Clicked");
			}
			else
			{
				System.out.println("LinkElement button is not Clicked");
			}
				
				System.out.println("Total Links in the web page:" + AllLinks.size());
				Iterator<WebElement>iterator=AllLinks.iterator();//We will iterate Through the list and will check the elements in the list
				while(iterator.hasNext()) {
					 url=iterator.next().getText();
					 System.out.println(url);
					 
				}
				if(Home.isDisplayed()) {
					Home.click();
					System.out.println();
					System.out.println("Home Link is Clicked");
				}
				else
				{
					System.out.println("Home Link is not Clicked");
				}
				
				System.out.println("Link Element Executed Sucessfully");

					}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("Exception raised in Links:"+e);
			}
}
}
		
		
//String url="";

//List<WebElement>allUrls= driver.findElements(By.tagName("a"));
//System.out.println("Total Links in the web page:" + allUrls.size());
//Iterator<WebElement>iterator=allUrls.iterator();//We will iterate Through the list and will check the elements in the list
//while(iterator.hasNext()) {
//	 url=iterator.next().getText();
//	 System.out.println(url);
//	 
//}
//WebElement home= driver.findElement(By.id("simpleLink"));
//home.click();
//
//System.out.println();
//driver.close();
