package mockInterviewprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(mockInterviewprograms.ListenerTest.class)
public class TestCases {
	
	@Test  
	public void sum()  
	{  
	int sum=0;  
	int a=5;  
	int b=7;  
	sum=a+b;  
	System.out.println("sum is:" +sum);  
	}  

       
	
		//Forcefully failed this test as verify listener	
		@Test		
		public void TestToFail()				
		{		
		    System.out.println("This method to test fail");					
		    Assert.assertTrue(false);			
		}

}
