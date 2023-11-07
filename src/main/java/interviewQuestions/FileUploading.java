package interviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("weddriver.chorme.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://ufile.io/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement AddFile=driver.findElement(By.xpath("//div[@class='dz-message needsclick']"));
		AddFile.sendKeys("D:\\Training.Readfile.txt");
		
		/*

import static org.testng.Assert.assertTrue;
4
5
import java.net.URL;
6
import java.util.concurrent.TimeUnit;
7
8
import org.openqa.selenium.By;
9
import org.openqa.selenium.WebElement;
10
import org.openqa.selenium.chrome.ChromeOptions;
11
import org.openqa.selenium.remote.LocalFileDetector;
12
import org.openqa.selenium.remote.RemoteWebDriver;
13
import org.testng.annotations.AfterClass;
14
import org.testng.annotations.BeforeClass;
15
import org.testng.annotations.Test;
16
17
public class LamdaTestUploadFileRemotely {
18
19
    private RemoteWebDriver driver;
20
21
    @BeforeClass
22
    public void setUp() throws Exception {
23
24
        ChromeOptions capabilities = new ChromeOptions();
25
        capabilities.setCapability("user","<username>");
26
        capabilities.setCapability("accessKey","<accesskey>");
27
        capabilities.setCapability("build", "Build 2");
28
        capabilities.setCapability("name", "Check Uploaded Image");
29
        capabilities.setCapability("platformName", "Windows 10");
30
        capabilities.setCapability("browserName", "Chrome");
31
        capabilities.setCapability("browserVersion","79.0");
32
        
33
        driver = new RemoteWebDriver(new URL("http://hub.lambdatest.com:80/wd/hub"), capabilities);
34
        driver.setFileDetector(new LocalFileDetector());
35
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
36
    
37
    }
38
39
    @Test
40
    public void lamdaTest() throws Exception {
41
        driver.get("https://blueimp.github.io/jQuery-File-Upload/");
42
        Thread.sleep(2000);
43
        WebElement addFile = driver.findElement(By.xpath(".//input[@type='file']"));
44
        addFile.sendKeys("/Users/neeraj.kumar/Desktop/c1.jpeg");
45
        
46
        driver.findElement(By.xpath(".//span[text()='Start upload']")).click();
47
48
        Thread.sleep(2000);
49
        if(driver.findElement(By.xpath(".//a[text()='c1.jpeg']")).isDisplayed()) {
50
            assertTrue(true, "Image Uploaded");
51
        }else {
52
            assertTrue(false, "Image not Uploaded");
53
        }
54
    }
55
    
56
57
    @AfterClass
58
    public void tearDown() throws Exception {
59
        driver.quit();
60
    }

}
 */
		

	}

}
