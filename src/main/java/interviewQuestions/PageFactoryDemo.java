package interviewQuestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pagefactorydemo.Login;
import pagefactorydemo.Profile;

public class PageFactoryDemo {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
			
		
	     	System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/login");
			
			//Instantiating Login & Profile page using initElements()
			Login loginPg = PageFactory.initElements(driver, Login.class);
			Profile profilePg = PageFactory.initElements(driver, Profile.class);
			 
			//Using the methods created in pages class to perform actions
			loginPg.LogIn_Action("pages", "pages12345");
			//profilePg.verifyUser("pages");
			Login.loginBtn.click();
			profilePg.logout_Action();
			 
			driver.quit();		
							}


}
