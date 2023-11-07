package assignment02;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import locationpaths.Paths;

public class Landingpage extends Paths {

	WebDriver driver;

	public Landingpage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public void beforeApp() throws InterruptedException {
		try {
	    if(Signin1.isEnabled()) {
		Actions a = new Actions(driver);
		a.moveToElement(Signin1).build().perform();
		System.out.println(Signin1.getText() +" Signin Button is Enabled");
			}else {
				System.out.println(Signin1.getText() +" Signin Button is not Enabled");
			}
	   // Thread.sleep(5000);
	    if(clickonbutton.isEnabled()) {
			System.out.println(clickonbutton.getText()+"button is enabled");
			clickonbutton.click();
	    }
			else
			{
			System.out.println(clickonbutton.getText()+"button is not enabled");
		     }
		//Thread.sleep(2000);
	 }catch(Exception e){
			System.out.println("Error in beforeApp Method" +e.getMessage());
		}
		
	}
	

	public void signApplication(String phoneno, String password) {
		try{
		if(emailorphoneno.isEnabled()) {
		emailorphoneno.sendKeys(phoneno);
		System.out.println(emailorphoneno.getText() +"Phoneno Textbox is Displayed");
			}else {
				System.out.println(emailorphoneno.getText() +"Phoneno Textbox is not Displayed");
			}
		//Thread.sleep(2000);
		if(continues.isEnabled()) {
		continues.click();
		System.out.println(continues.getText()+"button is enabled");
		}
		else
		{
			System.out.println(continues.getText()+"button is not enabled");
		}
		if(passwordele.isDisplayed()) {
			passwordele.sendKeys(password);
			System.out.println(passwordele.getText() +"Password Textbox is Displayed");
				}else {
					System.out.println(passwordele.getText() +"Password Textbox is not Displayed");
				}
		//Thread.sleep(5000);
		if (Signin.isEnabled()) {
			System.out.println(Signin.getText()+"button is  enabled");
			Signin.click();
		}
		else
		{
			System.out.println(Signin.getText()+"button is not enabled");
		}
		
		//Thread.sleep(2000);
		}
		catch(Exception e) {
		System.out.println("Error in signApplication Method" +e.getMessage());
	
	}
}
	  public void windowHandles() {
		  try {
		String parent = driver.getWindowHandle();// it will return the parent window names
		Set<String> s = driver.getWindowHandles();
		Iterator<String> I1 = s.iterator();
		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(parent);// switch to parent window
		  }catch(Exception e) {
			  System.out.println("Error in windowHandles method " +e.getMessage());
		  }

	}

}
