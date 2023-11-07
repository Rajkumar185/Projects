package Groups;

import org.testng.annotations.Test;

public class Home_loan {
	
	@Test(timeOut=200) 
	public void WebLoginHomeLoan()  
	{  
	  System.out.println("Web Login Home Loan");  
	}  
	@Test(groups= {"SmokeTest"})  
	public void MobileLoginHomeLoan()  
	{  
	  System.out.println("Mobile Login Home Loan");  
	}  
	@Test(dependsOnMethods="MobileLoginHomeLoan")
	public void APILoginHomeLoan()  
	{  
	  System.out.println("API Login Home Loan");  
	}  
	@Test(invocationCount=5)
	public void invocation() {
		System.out.println("invocation count is counting ");
	}

}
