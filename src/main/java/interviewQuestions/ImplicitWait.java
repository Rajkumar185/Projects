package interviewQuestions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String args[]) {

	WebDriver driver;

	
	System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	String eTitle = "IRCTC Next Generation eTicketing System";
	String aTitle = "" ;
	driver.get("https://www.irctc.co.in/nget/train-search" );
	System.out.println(driver.getTitle());
	driver.manage().window().maximize() ;
	aTitle = driver.getTitle();
	if (aTitle.equals(eTitle))
	{
	System.out.println( "Test Passed") ;
	}
	else {
	System.out.println( "Test Failed" );
	}

	driver.close();
}

}
