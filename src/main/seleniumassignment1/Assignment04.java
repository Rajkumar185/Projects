/** Write a program to handle window popups and alerts in selenium */
package seleniumassignment1;
import java.util.HashMap;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment04 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe"); 
		 HashMap<String,Integer> contentSetting=new HashMap<String,Integer>();//handling the the window popups 
		 HashMap<String,Object> profile=new HashMap<String,Object>();
		 HashMap<String,Object> prefs=new HashMap<String,Object>();
		 contentSetting.put("notification", 2);
		 profile.put("managed_default_content_setting", contentSetting);
		 prefs.put("profile", profile);
		 ChromeOptions options =new ChromeOptions();
		 options.setExperimentalOption("prefs", prefs);
		 WebDriver driver=new ChromeDriver(options);
	     driver.manage().window().maximize();
	     driver.get("https://www.irctc.co.in/nget/train-search");//launching the IRCTC website
	     driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();   
	     driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");//redirecting to another site for handling alert
	     driver.findElement(By.name("cusid")).sendKeys("53920");
	     Thread.sleep(2000);
	     driver.findElement(By.name("submit")).submit();
	     Alert alert =driver.switchTo().alert();//switching to alert
	     String alertMessage=driver.switchTo().alert().getText();//capturing alertMessage
	     System.out.println(alertMessage);//displaying alert in console
	     Thread.sleep(2000);
	     alert.accept();
	     driver.close(); 


	}

}
