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
import org.openqa.selenium.support.ui.Select;



public class Test3 {
	 String username = "pittala_rajkumar";
	    String accesskey = "C82Bt5TnKmKi28hInSpaVTTtC2z2S0bGnN8MjRbdEE0sOHNvSa";
	    static RemoteWebDriver driver = null;
	    String gridURL = "@hub.lambdatest.com/wd/hub";
	    boolean status = false;
	    public static void main(String[] args) {
	        new Test3().test();
	    }
	    public void test() {
	        // To Setup driver
	        setUp();
	        try {
	        	 driver.get("https://www.lambdatest.com/selenium-playground/");
	  	       driver.manage().window().maximize();
	  	   //click “Input Form Submit” under “Input Forms”
	  			driver.findElement(By.xpath("//a[contains(text(),'Input Form Submit')]")).click();
	  			Thread.sleep(2000);
	  			//Click “Submit” without filling in any information in the form
	  			driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	  			Thread.sleep(2000);
	  			//Assert “Please fill in the fields” error message
	  			String msg=driver.findElement(By.id("name")).getAttribute("validationMessage");
	  			Assert.assertEquals(msg,"Please fill out this field.");
	  			Thread.sleep(2000);
	  			//Fill in Name, Email, and other fields.
	  			driver.findElement(By.id("name")).sendKeys("Rajkumar");
	  			Thread.sleep(2000);
	  			driver.findElement(By.id("inputEmail4")).sendKeys("Rajkumar@gmail.com");
	  			Thread.sleep(2000);
	  			driver.findElement(By.id("inputPassword4")).sendKeys("Rajkumar");
	  			Thread.sleep(2000);
	  			driver.findElement(By.id("company")).sendKeys("persistent");
	  			Thread.sleep(2000);
	  			driver.findElement(By.id("websitename")).sendKeys("Lambdatest");
	  			Thread.sleep(2000);
	  			//From the Country drop-down, select “United States” using the text property
	  			Select dropdown=new Select(driver.findElement(By.xpath("//select[@name='country']")));
	  			dropdown.selectByVisibleText("United States");
	  			Thread.sleep(2000);
	  			driver.findElement(By.id("inputCity")).sendKeys("Hyderabad");
	  			Thread.sleep(2000);
	  			driver.findElement(By.id("inputAddress1")).sendKeys("Hi-tech city");
	  			Thread.sleep(2000);
	  			driver.findElement(By.id("inputAddress2")).sendKeys("madhapur");
	  			Thread.sleep(2000);
	  			driver.findElement(By.id("inputState")).sendKeys("Telangana");
	  			Thread.sleep(2000);
	  			driver.findElement(By.id("inputZip")).sendKeys("50018");
	  			Thread.sleep(2000);
	  			//Fill all fields and click “Submit”.
	  			driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	  			//Once submitted, validate the success message “Thanks for contacting us, we will get back to you shortly.” on the screen.
	  			String SuccessfullMsg="Thanks for contacting us, we will get back to you shortly.";
	  			Assert.assertEquals(SuccessfullMsg, "Thanks for contacting us, we will get back to you shortly.");
	  			

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
