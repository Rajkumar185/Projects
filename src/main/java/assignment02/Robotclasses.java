/**Explain about Robot class */
package assignment02;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class Robotclasses {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		 System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https:www.amazon.com");
		  
		    //using Robot classes
		// Actions a=new Actions();
		 //a.moveToElement(null)
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
		    
		    /*
		     	
		   System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		
           driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/"); // sample url	
           driver.findElement(By.xpath(".//a[@href=contains(text(),'yearly-calendar.xls')]")).click();	
           Robot robot = new Robot();  // Robot class throws AWT Exception	
           Thread.sleep(2000); // Thread.sleep throws InterruptedException	
           robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button	
           
           Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
           robot.keyPress(KeyEvent.VK_TAB);	
           Thread.sleep(2000);	
           robot.keyPress(KeyEvent.VK_TAB);	
           Thread.sleep(2000);	
           robot.keyPress(KeyEvent.VK_TAB);	
           Thread.sleep(2000);	
           robot.keyPress(KeyEvent.VK_ENTER);	
       // press enter key of keyboard to perform above selected action
		     
     */

	}

}
