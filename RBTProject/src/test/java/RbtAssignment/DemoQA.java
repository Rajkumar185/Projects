package RbtAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DemoQA {
	
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/elements");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Test
	public void testing() throws InterruptedException {
		Textbox text=new Textbox(driver);
        text.textinfo();
        Thread.sleep(2000);
        CheckboxDemo box=new CheckboxDemo(driver);
        box.checkBoxInfo();
        Thread.sleep(2000);
        RadioBox rbox=new RadioBox(driver);
        rbox.radioBoxInfo();
        Thread.sleep(2000);
        WebTable table=new WebTable(driver);
        table.webTableInfo();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(2000);
        Buttons button=new Buttons(driver);
        button.buttonInfo();
        Thread.sleep(2000);
	    JavascriptExecutor js1=(JavascriptExecutor)driver;
        js1.executeScript("window.scrollBy(0,300)");
        Thread.sleep(2000);
        Links link=new Links(driver);
        link.linkInfo();
        Thread.sleep(2000);
        JavascriptExecutor js2=(JavascriptExecutor)driver;
        js2.executeScript("window.scrollBy(0,400)");
        Thread.sleep(2000);
        BrokenLinks broken=new BrokenLinks(driver);
        broken.brokenLinkInfo();
        Thread.sleep(2000);
        UploadAndDownload uad=new UploadAndDownload(driver);
        uad.uploadAndDownloadInfo();
        Thread.sleep(2000);
        DynamicProperty dp=new DynamicProperty(driver);
        dp.dynamicPropertyInfo();
	}
        @AfterTest
        public void teardown() {
        	driver.close();
        }
	


}
