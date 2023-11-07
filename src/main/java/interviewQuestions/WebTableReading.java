package interviewQuestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableReading {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	        driver.get("https://m.cricbuzz.com/cricket-series/3961/icc-mens-t20-world-cup-2022/points-table");
	        String Header = driver.findElement(
	        		By.xpath("//table[1]/thead/tr")).getText(); 	
	        System.out.println(Header); 
	  
	        String row1=  driver.findElement(By.xpath("//table[1]/tbody[1]/tr")).getText();
	        System.out.println(row1);	
	        String row2=  driver.findElement(By.xpath("//table[1]/tbody[2]/tr")).getText();
	        System.out.println(row2);	
	        String row3=  driver.findElement(By.xpath("//table[1]/tbody[3]/tr")).getText();
	        System.out.println(row3);	
	        String row4=  driver.findElement(By.xpath("//table[1]/tbody[4]/tr")).getText();
	        System.out.println(row4);	
	        String row5=  driver.findElement(By.xpath("//table[1]/tbody[5]/tr")).getText();
	        System.out.println(row5);	
	        String row6=  driver.findElement(By.xpath("//table[1]/tbody[6]/tr")).getText();
	        System.out.println(row6);	
	    
	      driver.quit();

	} 
}
