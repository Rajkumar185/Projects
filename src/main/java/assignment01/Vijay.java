package assignment01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Vijay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
       driver =new ChromeDriver(); // Conected webdriver object to the chrome driver.
        driver.get("https:www.amazon.com"); // here we are get the Url
        driver.manage().window().maximize(); //here we get maximize the window
        System.out.println(driver.getTitle()); // here we get title of the landing url
        String a=driver.getCurrentUrl(); // here we get current url
       System.out.println(a);
       //driver.switchTo().newWindow(WindowType.TAB); // here we can move to the next tab
       driver.switchTo().newWindow(WindowType.WINDOW); // here we can move to the next window
       driver.navigate().to("https://www.javatpoint.com/selenium-webdriver"); // in next window we get this url
       // driver.close(); // only close the presented url
       driver.quit(); // here we got closed all the tabs in the window
        
	}

}
