package mockInterviewprograms;

import org.testng.annotations.Test;

public class InvocationDemo {

	@Test(invocationCount=5)
	public void invocate1() {
		System.out.println("executing first testcase1");
	}
	@Test(invocationCount=3)
	public void invocate2() {
		System.out.println("executing second testcase2");
	}
}
