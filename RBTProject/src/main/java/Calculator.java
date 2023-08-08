import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calculator {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.calculator.net");
		
		 driver.findElement(By.xpath(".//*[@id = 'menu']/div[3]/a")).click();

	      // Click on Percent Calculators
	      driver.findElement(By.xpath(".//*[@id = 'menu']/div[4]/div[3]/a")).click();

	      // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");

	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("50");

	      // Click Calculate Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr/td[2]/input")).click();

	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/span/font/b")).getText();		 

	      // Print a Log In message to the screen
	      System.out.println(" The Result is " + result);

	      if(result.equals("5")) {
	         System.out.println(" The Result is Pass");
	      } else {
	         System.out.println(" The Result is Fail");
	      }
	      driver.close();
	   }
	


	}


