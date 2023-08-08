/** write a program to check and print all footers values */

package seleniumAssignment1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment06 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
	    options.addArguments("disable-notifications");
      	WebDriver driver=new ChromeDriver(options);
	     driver.manage().window().maximize();
	     driver.get("https://www.irctc.co.in/nget/train-search");//launching the IRCTC website
	    driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
	    Thread.sleep(2000);
	    Boolean display=driver.findElement(By.id("dFooter")).isDisplayed();//checking the whether footer is present or not 
	     System.out.println(display);
	       System.out.println(driver.findElement(By.id("dFooter")).getText());//capturing and printing the footer values in console
	     driver.close();//closing the browser
	    


	}

}
