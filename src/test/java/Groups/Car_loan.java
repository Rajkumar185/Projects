package Groups;

import org.testng.annotations.Test;

public class Car_loan {
	
	@Test(enabled=false)
	public void just() {
		System.out.println("Just for enabled method or not");
	}

	@Test() 
	public void WebLoginCarLoan()  
	{  
	System.out.println("Web Login Home Loan"); 
	}  
	@Test(dependsOnMethods="WebLoginCarLoan") 
	public void MobileLoginCarLoan()  
	{  
	System.out.println("Mobile Login Home Loan");  
	}  
	@Test(groups= {"SmokeTest"})  
	public void APILoginCarLoan()  
	{  
	System.out.println("API Login Home Loan");  
	}  

}
