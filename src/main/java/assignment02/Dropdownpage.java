package assignment02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import locationpaths.Paths;

public class Dropdownpage extends Paths{
	
WebDriver driver;
	
	public Dropdownpage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void moveover() throws InterruptedException
	{
		try {
			if(moveover.isEnabled()) {
				Actions a = new Actions(driver);
				a.moveToElement(moveover).build().perform();
				System.out.println(moveover.getText() +" moveover Button is Enabled");
					}else {
						System.out.println(moveover.getText() +" moveover Button is not Enabled");
					}
		
		}catch(Exception e) {
			System.out.println("Error in moveover method" +e.getMessage());
		}
		
	}
	
	public void moveoverdropdown() throws InterruptedException {
		try {
		if(movedropdown.isEnabled()) {
		System.out.println(movedropdown.getText() +"  movedropdown button is Enabled");
		movedropdown.click();
			}else {
				System.out.println(movedropdown.getText() +"movedropdown button is not Enabled");
			}
		
		if(clickon.isEnabled()) {
			System.out.println(clickon.getText() +"  clickon button is Enabled");
			clickon.click();
				}else {
					System.out.println(clickon.getText() +"clickon button is not Enabled");
				}
			
		
		if(clicked.isEnabled()) {
			System.out.println(clicked.getText() +"  clicked button is Enabled");
			clicked.click();
				}else {
					System.out.println(clicked.getText() +"clicked button is not Enabled");
				}
		
		
		if(gotowebsite.isEnabled()) {
			System.out.println(gotowebsite.getText() +"  gotowebsite button is Enabled");
			gotowebsite.click();
				}else {
					System.out.println(gotowebsite.getText() +"gotowebsite button is not Enabled");
				}
		
		
		driver.quit();
		}catch(Exception e) {
			System.out.println("Error in moveoverdropdown method" +e.getMessage());
		}
	}
	}
