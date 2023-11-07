package seleniumassignment2;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavarobotAssignment04 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https:www.amazon.com");
		 Actions a=new Actions(driver);
		 WebElement move=driver.findElement(By.xpath("//*[@id='icp-nav-flyout']/span"));
		 a.moveToElement(move).build().perform();
		 Thread.sleep(2000);
		  
		    //using Robot classes
		    Robot robot = new Robot();
		    robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(4000);
			System.out.println("window moved to down");
			robot.keyPress(KeyEvent.VK_UP);
			Thread.sleep(4000);
			System.out.println("window moved to up");
			Thread.sleep(4000);
			robot.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(4000);
			System.out.println("clicked on menu bar");
			robot.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(4000);
			robot.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(4000);
			robot.mouseMove(640,360);
			Thread.sleep(4000);
			System.out.println("mouse moved to specified location in window");
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			System.out.println("it press mouse button");
			Thread.sleep(4000);
			robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
			System.out.println("it righ click of the mouse");
			Thread.sleep(4000);
		    driver.close();
}
}
