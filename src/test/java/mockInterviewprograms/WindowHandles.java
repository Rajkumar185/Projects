/**How can we handle windows popup in selenium - getwindowhandles() method */
package mockInterviewprograms;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandles {
	
	@Test
	   public void windowHandle() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get("https://www.irctc.co.in/nget/train-search");
	      // getting the current window handle id
	      String currentwindow = driver.getWindowHandle();
	      // getting all the window handles in Set data structure
	      Set<String> allWindows = driver.getWindowHandles();
	      Iterator<String> i = allWindows.iterator();
	      //Iterating through the window handle ids
	      while(i.hasNext()){
	         String childwindow = i.next();
	         if(!childwindow.equalsIgnoreCase(currentwindow)){
	            driver.switchTo().window(childwindow);
	            System.out.println("The child window is "+childwindow);
	         } else {
	            System.out.println("There are no children");
	         }
	      }
	      driver.quit();
	   
	}

}
