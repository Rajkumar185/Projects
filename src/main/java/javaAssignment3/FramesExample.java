package javaAssignment3;

import java.util.concurrent.TimeUnit;
import java.util.*;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {
	   public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	     	      driver.get("http://demo.guru99.com/test/guru99home/"); 
	      java.util.List<WebElement> iframeElements = driver.findElements(By.tagName("iframeResult"));
	      System.out.println("Total number of iframes are " + iframeElements.size());
	    
	      //By executing a java script
	      JavascriptExecutor exe = (JavascriptExecutor) driver;
	      Integer noOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
	      System.out.println("No. of iframes on the page are " + noOfFrames); 
	      driver.switchTo().frame(0);
	      driver.close();
	      }
}