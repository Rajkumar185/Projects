/** Write a program to launch a new tab in chrome browser and then close the new tab */
package seleniumassignment1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment05 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https:www.google.com");
	     driver.switchTo().newWindow(WindowType.TAB);//opening the new tab in window 
	     Thread.sleep(2000);
	     driver.close();//closing the opened tab in browser
	     driver.quit();//closing the browser 
	    
		

	}

}
