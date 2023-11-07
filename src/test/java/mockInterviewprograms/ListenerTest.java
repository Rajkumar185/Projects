package mockInterviewprograms;

import org.testng.ITestListener;
import org.testng.ITestResult ;
import org.testng.ITestContext ;

public class ListenerTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		 System.out.println(" test case started :"+ result.getName());
		
			}

	@Override
	public void onTestSuccess(ITestResult result) {
		 System.out.println("The name of the testcase passed is :"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		 System.out.println("The name of the testcase failed is :"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		  System.out.println("The name of the testcase Skipped is :"+result.getName());	
			}

	@Override
	public void onStart(ITestContext context) {
		
		
		}

	@Override
	public void onFinish(ITestContext context) {
			}
}
	
	