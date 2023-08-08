import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//*[contains(text(),'Frames')])[2]")).click();
		//driver.switchTo().frame("frame-middle");
		//int size = driver.findElements(By.tagName("iframe")).size();
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
						//driver.switchTo().frame("frame-middle");
				 driver.switchTo().window(parent);//switch to parent window
				}catch(Exception e) {
					System.out.println("Error in WindowHandling Method" +e.getMessage());
					driver.switchTo().frame("frame-middle");
					Thread.sleep(2000);
		//System.out.println(driver.findElement(By.id("content")).getText());
		driver.close();
		

	}

}
}
