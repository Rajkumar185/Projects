import org.testng.annotations.*;

public class Testcase1 {
	
	@Test
	public void test1() {
		System.out.println("Testcase1 is executing");
	}
	@BeforeTest
	public void test2() {
		System.out.println("Testcase2 is executing");
	}
	public void test3() {
		System.out.println("Testcase3 is executing");
	}@AfterTest()
	public void test4() {
		System.out.println("Testcase4 is executing");
	}
	@BeforeTest()
	public void test5() {
		System.out.println("Testcase5 is executing");
	}


}
