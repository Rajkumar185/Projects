package demoQA.Elements;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		
		
		String url="";
		System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      	
	     List<WebElement>allUrls= driver.findElements(By.tagName("a"));
		 System.out.println("Total Links in the web page:" + allUrls.size());
		 Iterator<WebElement>iterator=allUrls.iterator();//We will iterate Through the list and will check the elements in the list
		 while(iterator.hasNext()) {
			 url=iterator.next().getText();
			 System.out.println(url);
			 
		 }
		 WebElement home= driver.findElement(By.id("simpleLink"));
		 home.click();
		
		 System.out.println();
		 driver.close();

		}

}
