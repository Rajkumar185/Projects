package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		
		TestScenario1 tc1=new TestScenario1(driver);
		tc1.setUp();
		tc1.test();
		tc1.tearDown();
		TestScenario2 tc2=new TestScenario2(driver);
		tc2.setUp();
		tc2.test();
		tc2.tearDown();
		TestScenario3 tc3=new TestScenario3(driver);
		tc3.setUp();
		tc3.test();
		tc3.tearDown();
		
		
		

	}

}
