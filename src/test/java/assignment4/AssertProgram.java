package assignment4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertProgram {
	
	@Test(priority=0)
	public void softAssert() {
		SoftAssert assertion=new SoftAssert();
		System.out.println("softAssert started");
		assertion.assertEquals(12,13);
		assertion.assertEquals(true,true);
		System.out.println("Executing the softAssert");
		assertion.assertNotEquals(true, false);
		System.out.println("Exceuting the softAssert1");
		assertion.assertTrue("RajKumar".equals("RajKumar"),"it will pass");
		assertion.assertFalse("Raj".equals("Rajkumar"),"it will pass");
		System.out.println("SoftAssert completed");
		assertion.assertAll();
	}
	@Test(priority=1)
	public void Assert() {
		System.out.println("Assert started");
		Assert.assertEquals(12, 13);
		Assert.assertEquals(true,true);
		System.out.println("Executing the test2");
		Assert.assertNotEquals(true, false);
		System.out.println("Exceuting the Assert");
		Assert.assertTrue("RajKumar".equals("Rajkumar"),"it will pass");
		Assert.assertFalse("Raj".equals("Rajkumar"),"it will pass");
		System.out.println("Assert completed");
		
		
	}

}
