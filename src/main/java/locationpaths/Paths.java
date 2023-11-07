package locationpaths;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paths {
	
	WebDriver driver;

	public Paths(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	public
	WebElement Alert;
	
	@FindBy(xpath="//*[@id='launcherClose']")
	public
	WebElement Advertise;
	
	@FindBy(xpath="//i[@class='fa fa-align-justify']")
	public
	WebElement Menubar;
	
	@FindBy(xpath="//button[@class='search_btn']")
	public
	WebElement LoginButton;
	
	@FindBy(xpath="//input[@placeholder='User Name']")
	public
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	public
	WebElement password;
	
	
	@FindBy(xpath="//*[@id='login_header_disable']/div//div[2]/form/span/button")
	public
	WebElement Signinbutton;

	@FindBy(xpath="//div[@class='loginError']")
	public
	WebElement errortext;
	
	@FindBy(xpath="//div[@class='loginError']")
	public
	WebElement mouseovertoerrormsg;
	
	@FindBy(id="dFooter")
	public
	//protected
	WebElement checkingfooter;
	
	
	@FindBy(xpath = "//*[@id='nav-flyout-ya-signin']/a/span")
	public
	WebElement clickonbutton;

	@FindBy(xpath = "//*[@id='ap_email']")
	public
	WebElement emailorphoneno;

	@FindBy(xpath = "//*[@id='continue']")
	public
	WebElement continues;

	@FindBy(xpath = "//*[@id='ap_password']")
	public
	WebElement passwordele;

	@FindBy(xpath = "//*[@id='signInSubmit']")
	public
	WebElement Signin;

	@FindBy(xpath = "//*[@id='nav-link-accountList']")
	public
	WebElement Signin1;
	
	@FindBy(xpath="//*[@id='icp-flyout-mkt-change']/span/div")
	public
	WebElement movedropdown;
	
	@FindBy(xpath="//*[@id='icp-dropdown']/span/span")
	public
	WebElement clickon;
	
	@FindBy(xpath="//*[@id='icp-dropdown_8']")
	public
	WebElement clicked;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	public
	WebElement gotowebsite;
	
	@FindBy(xpath="//*[@id='icp-nav-flyout']/span")
	public
	WebElement moveover;
	
	@FindBy(xpath="//a[@class='nav-link nav-item']")
	public
	List<WebElement> Listallurl;
	
	

}