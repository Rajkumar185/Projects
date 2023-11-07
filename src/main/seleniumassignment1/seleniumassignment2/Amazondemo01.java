package seleniumassignment2;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazondemo01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		 System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https:www.amazon.com");
		 
		 Actions a=new Actions(driver);
		 WebElement move=driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		 a.moveToElement(move).build().perform();
		 Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']/a/span")).click();
		 driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("9182014723");
		 driver.findElement(By.xpath("//*[@id='continue']")).click();
		 driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("Rajkumar");
		 driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
		 Thread.sleep(2000);
		
		 Actions a1=new Actions(driver);
		 WebElement move1=driver.findElement(By.xpath("//*[@id='icp-nav-flyout']/span"));
		 a1.moveToElement(move1).build().perform();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//*[@id='icp-flyout-mkt-change']/span/div")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id='icp-dropdown']/span/span")).click();
		 Thread.sleep(2000);
		
		 WebElement dropdown=driver.findElement(By.xpath("//a[@id='icp-dropdown_7']"));
		 a.moveToElement(dropdown).click().build().perform();
		 Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		 Thread.sleep(2000);
		
		 String parent =driver.getWindowHandle();//it will return the parent window names
		 Set<String > s=driver.getWindowHandles();
				 Iterator<String>I1=s.iterator();
				 while(I1.hasNext())
				 {
					 String child_window=I1.next();
					 if(!parent.equals(child_window))
					 {
						 driver.switchTo().window(child_window);
						 System.out.println(driver.switchTo().window(child_window).getTitle());
						 driver.close();
					 }
				 }
		 driver.switchTo().window(parent);//switch to parent window
		
		 WebElement signin=driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		 a.moveToElement(signin).build().perform();
		 String url="";
		 List<WebElement> allUrls=driver.findElements(By.xpath("//a[@class='nav-link nav-item']"));
		 System.out.println("Total Links in the web page:" + allUrls.size());
		 Iterator<WebElement>iterator=allUrls.iterator();//We will iterate Through the list and will check the elements in the list
		 while(iterator.hasNext()) {
			 url=iterator.next().getText();
			 System.out.println(url);
		 }
		driver.close();
       
	}
       
}