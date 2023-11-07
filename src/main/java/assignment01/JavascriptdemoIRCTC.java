package assignment01;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptdemoIRCTC {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 //System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		 ChromeOptions options =new ChromeOptions();  //handling the permission popups in chrome browser
	     options.addArguments("disable-notifications");
		 WebDriver driver=new ChromeDriver(options);
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	     driver.manage().window().maximize();
	     driver.get("https://www.irctc.co.in/nget/train-search"); //lauching the IRCTC website
	     Signin sig=new Signin(driver);
	     sig.beforeSignin();
	     sig.SignInApp("Rajkumar","Raj@7824");
	     sig.Screenshotas();

	    
	    

	}

}
