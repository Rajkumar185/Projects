import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Venu {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:google.com");
		driver.manage().window().maximize();
		WebElement input=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		input.sendKeys("gamil.com");
		input.click();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https:www.amazon.com");
	
		
		
	}

}
