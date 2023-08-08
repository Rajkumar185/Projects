package Assignment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class Test1 {
	 String username = "pittala_rajkumar";
	    String accesskey = "C82Bt5TnKmKi28hInSpaVTTtC2z2S0bGnN8MjRbdEE0sOHNvSa";
	    static RemoteWebDriver driver = null;
	    String gridURL = "@hub.lambdatest.com/wd/hub";
	    boolean status = false;
	    public static void main(String[] args) {
	        new Test1().test();
	    }
	    public void test() {
	        // To Setup driver
	        setUp();
	        try {
	        	 driver.get("https://www.lambdatest.com/selenium-playground/"); 
	  	       driver.manage().window().maximize();
	        	//Click “Simple Form Demo” under Input Forms
	    		driver.findElement(By.xpath("//a[contains(text(),'Simple Form Demo')]")).click();
	    		Thread.sleep(2000);
	    		//Validate that the URL contains “simple-form-demo”
	    		String Expected=driver.getCurrentUrl();
	    		String Actual="https://www.lambdatest.com/selenium-playground/simple-form-demo";
	    		Assert.assertEquals(Expected, Actual);
	    		//Create a variable for a string value E.g: “Welcome to LambdaTest”
	    		String name="Welcome to LambdaTest";
	    		//Use this variable to enter values in the “Enter Message” text box.
	    		driver.findElement(By.id("user-message")).sendKeys(name);
	    		Thread.sleep(2000);
	    		//Click “Get Checked Value”.
	    		driver.findElement(By.id("showInput")).click();
	    		Thread.sleep(2000);
	    		//Validate whether the same text message is displayed in the right-hand panel under the “Your Message:” section
	    		String Message=driver.findElement(By.id("message")).getText();
	    		Assert.assertEquals(Message, "Welcome to LambdaTest");
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
