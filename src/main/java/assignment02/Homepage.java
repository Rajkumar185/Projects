package assignment02;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import locationpaths.Paths;

public class Homepage extends Paths {
	
	WebDriver driver;

	public Homepage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public void DropDown() throws InterruptedException {
		
		try {
			if(moveover.isEnabled()) {
				Actions a=new Actions(driver);
		 a.moveToElement(moveover).build().perform();
		 System.out.println(moveover.getText() +" moveover button is Enabled");
			}else {
				 System.out.println(moveover.getText() +" moveover button is not Enabled");
			}
		
		 if(movedropdown.isEnabled()) {
		 System.out.println(movedropdown.getText() +" movedropdown button is Enabled ");
		 JavascriptExecutor js =(JavascriptExecutor)driver;
	     js.executeScript("arguments[0].click();",movedropdown);
		 }else {
			 System.out.println(movedropdown.getText() +" movedropdown button is not Enabled "); 
		 }
		
		 if(clickon.isEnabled()) {
		 System.out.println(clickon.getText() +" clickon button is Enabled ");
		 JavascriptExecutor js =(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", clickon);
		 }else {
			 System.out.println(clickon.getText() +" clickon button is not Enabled "); 
		 }
		 
		 if(clicked.isEnabled()) {
		 System.out.println(clicked.getText() +" clicked button is Enabled "); 
		 Actions a=new Actions(driver);
		 a.moveToElement(clicked).click().build().perform();
		 }else {
			 System.out.println(clicked.getText() +" clicked button is not Enabled "); 
		 }
		 //Thread.sleep(2000);
		 if(gotowebsite.isEnabled()) {
		 System.out.println(gotowebsite.getText() +" gotowebsite button is Enabled ");
		 JavascriptExecutor js =(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();",gotowebsite);
		 }else {
			 System.out.println(gotowebsite.getText() +" gotowebsite button is not Enabled "); 
		 }

	}catch(Exception e) {
		System.out.println("Error in DropDown Method" +e.getMessage());
	}
	}
	public void WindowHandling() {
		
		try {
		String parent =driver.getWindowHandle();//it will return the parent window names
		 Set<String > s=driver.getWindowHandles();
				 Iterator<String>I1=s.iterator();
				 while(I1.hasNext())
				 {
					 String child_window=I1.next();
					 if(!parent.equals(child_window))
					 {
						 driver.switchTo().window(child_window);
						 System.out.println(driver.switchTo().window(child_window).getTitle());
						 driver.close();
					 }
				 }
		 driver.switchTo().window(parent);//switch to parent window
		}catch(Exception e) {
			System.out.println("Error in WindowHandling Method" +e.getMessage());
		}
		
	}
	
	public void listUrl() throws InterruptedException {
		
		try {
		 String url="";
		 Actions a=new Actions(driver);
		 if(Signin1.isEnabled()) {
		 a.moveToElement(Signin1).build().perform();
		 System.out.println(Signin1.getText() +" Signin1 button is Enabled ");
		 }else {
			 System.out.println(Signin1.getText() +" Signin1 button is not Enabled ");
		 }
		
		 List<WebElement>allUrls= Listallurl;
		 System.out.println("Total Links in the web page:" + allUrls.size());
		 Iterator<WebElement>iterator=allUrls.iterator();//We will iterate Through the list and will check the elements in the list
		 while(iterator.hasNext()) {
			 url=iterator.next().getText();
			 System.out.println(url);
		 }
		}catch(Exception e) {
			System.out.println("Error in listUrl Method" +e.getMessage());
		}
		 driver.close();	
	}
}
