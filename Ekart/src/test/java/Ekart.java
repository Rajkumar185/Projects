import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import Ekart.LandingPage;
import Ekart.Login;
import Ekart.Profile;
import Ekart.Seller;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ekart {
	
	WebDriver driver;
	
	@BeforeTest()
	public void setUp() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
		driver.get("http://localhost:3000");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}
	@Test(priority=0)
	public void customer() throws InterruptedException {
	  LandingPage lp=new LandingPage(driver);
      lp.homePageScrollDown();
      Thread.sleep(2000);
      lp.categories();
      Login in=new Login(driver);
      in.signUp();
      Thread.sleep(2000);
      in.signIn();
      Thread.sleep(2000);
      Profile p=new Profile(driver);
      p.profile();
	
	}
	@Test(priority=1)
	public void seller() throws InterruptedException {
		LandingPage lp=new LandingPage(driver);
        lp.homePageScrollDown();
        Thread.sleep(2000);
        lp.Login();
        Thread.sleep(2000);
        Seller s=new Seller(driver);
        s.sellerRegister();
        Thread.sleep(2000);
        s.sellerSignUp();
        Thread.sleep(2000);
        s.SellerSignIn();
        Thread.sleep(2000);
        s.home();
        Thread.sleep(2000);
        s.productDetails();
        Thread.sleep(2000);
        s.addProduct();
        Thread.sleep(2000);
        s.addNewProduct();
        Thread.sleep(2000);
        s.updateProduct();
		
	}
	@AfterTest()
	public void tearDown() {
		driver.close();
	}
}
