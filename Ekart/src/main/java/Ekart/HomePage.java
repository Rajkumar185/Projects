package Ekart;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:3000");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
       
//        LandingPage lp=new LandingPage(driver);
//        lp.homePageScrollDown();
//        Thread.sleep(2000);
//        lp.categories();
//        Login in=new Login(driver);
//        in.signUp();
//        Thread.sleep(2000);
//        in.signIn();
//        Thread.sleep(2000);
//        Profile p=new Profile(driver);
//        p.profile();
        
        LandingPage lp=new LandingPage(driver);
        lp.homePageScrollDown();
        Thread.sleep(2000);
        lp.Login();
        Thread.sleep(2000);
        Seller s=new Seller(driver);
//        s.sellerRegister();
//        Thread.sleep(2000);
//        s.sellerSignUp();
//        Thread.sleep(2000);
        s.SellerSignIn();
       // s.dashBoard();
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
        
        
        
        
        
        //driver.close();
	}

}
