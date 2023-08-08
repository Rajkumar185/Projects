package RbtAssignment;

import org.testng.annotations.Test;

public class InvocationCount {
	
	
	@Test(invocationCount=10)
	public void invocation()
	{
		System.out.println("testcase1");
	}

}
