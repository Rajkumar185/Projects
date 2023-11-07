package javaAssignment3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/");  
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    int size = driver.findElements(By.tagName("iframe")).size();
	    for(int i=0; i<=size; i++){
		driver.switchTo().frame(i);
		driver.switchTo().frame(0); 
		int total=driver.findElements(By.xpath("html/body/a/img")).size();
		System.out.println(total);
	    driver.switchTo().defaultContent();
	    driver.close();


}
}
}
