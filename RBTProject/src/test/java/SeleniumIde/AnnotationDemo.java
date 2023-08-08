package SeleniumIde;

import org.testng.annotations.*;

public class AnnotationDemo {
	
	@Test(alwaysRun=true)
	public void tc1() {
		System.out.println("inside testcase1");
	}
	@Test(alwaysRun=true,priority = 0)
	public void tc2() {
		System.out.println("inside testcase2");
	}
	@Test
	public void beforeSuit() {
		System.out.println("before Suit executing");
	}
	@Test
	public void AfterSuit() {
		System.out.println("After Suit executing");

}
	@Test
	public void beforeTest() {
		System.out.println("before Test executing");

}
@Test
public void AfterTest() {
	System.out.println("After test executing");
	

}
@Test
public void beforeClass() {
	System.out.println("before class executing");
}
@Test
public void AfterClass() {
	System.out.println("After class executing");
}
@Test
public void beforeMethod() {
	System.out.println("before method executing");
}
@Test
public void AfterMethod() {
	System.out.println("after method executing");
}


}