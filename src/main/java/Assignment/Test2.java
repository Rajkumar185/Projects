package Assignment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class Test2 {
	 String username = "pittala_rajkumar";
	    String accesskey = "C82Bt5TnKmKi28hInSpaVTTtC2z2S0bGnN8MjRbdEE0sOHNvSa";
	    static RemoteWebDriver driver = null;
	    String gridURL = "@hub.lambdatest.com/wd/hub";
	    boolean status = false;
	    public static void main(String[] args) {
	        new Test2().test();
	    }
	    public void test() {
	        // To Setup driver
	        setUp();
	        try {
	        	 driver.get("https://www.lambdatest.com/selenium-playground/"); 
	  	       driver.manage().window().maximize();
	  	   //click “Drag & Drop Sliders” 
	  			driver.findElement(By.xpath("//a[contains(text(),'Drag & Drop Sliders')]")).click();
	  			Thread.sleep(2000);
	  			//Progress Bars & Sliders
	  		WebElement progressbar=driver.findElement(By.xpath("//input[@value='15']"));
	  		JavascriptExecutor js=(JavascriptExecutor)driver;
	  		Actions act = new Actions(driver);  
	  		act.dragAndDropBy(progressbar,215,15).build().perform();
	  		Thread.sleep(2000);
	  		//Select the slider “Default value 15” and drag the bar to make it 95 by validating whether the range value shows 95.
	  		String val=driver.findElement(By.id("rangeSuccess")).getText();
	  		Assert.assertEquals(val,"95");
	  	
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        } finally {
	            tearDown();
	        }
	    }
	    private void setUp() {
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("browserName", "chrome");
	        capabilities.setCapability("version", "114.0");
	        capabilities.setCapability("platform", "win10"); // If this cap isn't specified, it will just get any available one.
	        capabilities.setCapability("build", "LambdaTestSampleApp");
	        capabilities.setCapability("name", "LambdaTestJavaSample");
	        capabilities.setCapability("network", "true");
	        capabilities.setCapability("visual", "true");
	        capabilities.setCapability("video", "true");
	        capabilities.setCapability("console", "true");
	        try {
	            driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
	        } catch (MalformedURLException e) {
	            System.out.println("Invalid grid URL");
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
	    private void tearDown() {
	        if (driver != null) {
	            ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
	            driver.quit(); //really important statement for preventing your test execution from a timeout.
	        }
	    }

}
