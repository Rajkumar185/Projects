package assignment01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Syam {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","D:\\sel\\temp\\edgedriver_win64\\msedgedriver.exe");
	    WebDriver driver=new EdgeDriver();
	    driver.get("https://netbanking.hdfcbank.com/netbanking/");
	    //driver.get("https://www.javatpoint.com/java-tutorial");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    //driver.findElement(By.linkText("Register Now")).click();
//	    List<WebElement>allUrls= driver.findElements(By.tagName("a"));
//	  System.out.println("Total Links in the web page:" + allUrls.size());
//        Actions a=new Actions(driver);
//	    WebElement link=driver.findElement(By.xpath("//a[contains(text(),'Register Now')]"));
//	    a.moveToElement(link).click().build().perform();
	    //driver.findElement(By.xpath("//a[contains(text(),'Forgot Customer ID')]")).click();
	    //driver.findElement(By.linkText("Forgot Customer ID")).click();
	   // driver.findElement(By.linkText("Keywords")).click();
//	    int size = driver.findElements(By.tagName("frame")).size(); 
//	    System.out.println(size);
//	    driver.close();
	   
// driver.findElement(By.xpath("//a[normalize-space()='CONTINUE']")).click();
try {
	driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("1234567");
}catch(Exception e) {
	e.printStackTrace();
}
driver.close();
	}


}
