import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BuildCarApp {

	public static void main(String[] args) throws InterruptedException {
		
		
		//System.setProperty("webdriver.edge.driver","D:\\sel\\temp\\edgedriver_win64(1)\\msedgedriver.exe");
	    WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	    driver.get("http://cookbook.seleniumacademy.com/Config.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		 System.out.println(driver.getCurrentUrl());
//		  System.out.println(driver.getTitle());
//		 System.out.println("**************************************");
	  Select dropdown =new Select(driver.findElement(By.xpath("(//select)[1]")));
	  //dropdown.selectByIndex(2);
	  //dropdown.selectByValue("audi");
	  dropdown.selectByVisibleText("Audi");
	  //radio button
	  driver.findElement(By.xpath("//input[@value='Petrol']")).click();
      //checkbox
	  driver.findElement(By.xpath("//input[@value='ABS']")).click();
	 // driver.findElement(By.xpath("//*[contains(@name,'abs')]")).click();
	  driver.findElement(By.xpath("//input[@value='Airbags']")).click();
	  Select Dropdown1=new Select(driver.findElement(By.xpath("(//select)[2]")));
	  Dropdown1.selectByIndex(1);
	  //driver.findElement(By.xpath("//input[@type='submit']")).click();
	  driver.findElement(By.id("helpbutton")).click();
	 
	  try {
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
			}catch(Exception e) {
				System.out.println("Error in WindowHandling Method" +e.getMessage());
			}
			
		
	  Thread.sleep(2000);
	  //driver.manage().window().minimize();
	  
	  String a=driver.getCurrentUrl();
	  System.out.println(a);
	  System.out.println(driver.getTitle());
	  Thread.sleep(5000);
	 // try {
	  
	  //WebElement help=driver.findElement(By.xpath("//div[@class='demo']"));
		 // WebElement help=driver.findElement(By.xpath("//div/p/text()"));
		 // WebElement help=driver.findElement(By.xpath("//p[contains(text(),'Welcome to Build my Car - Configuration Window. Us')]"));
		  //WebElement help=driver.findElement(By.xpath("/html/body/div/p/text()"));
		  //WebElement help=driver.findElement(By.xpath("//div/h3|/p/text()"));
	 // System.out.println(help.getText());
//	  }
//	  catch(Exception e) {
//		  e.printStackTrace();
//		  
//	  }
//	  ///html/body/div/p
	  driver.findElement(By.id("chatbutton")).click();
	  Thread.sleep(2000);
	  try {
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
			}catch(Exception e) {
				System.out.println("Error in WindowHandling Method" +e.getMessage());
			}
	  String a1=driver.getCurrentUrl();
	  System.out.println(a);
	  System.out.println(driver.getTitle());
	  driver.findElement(By.id("closebutton")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[contains(text(),'Your Details')]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[contains(text(),'Payment')]")).click();
	  
	  //driver.quit();
	}

}
