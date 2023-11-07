package assignment4;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotExample {

	
	@Test
    public void testGuru99TakeScreenShot() throws Exception{

		//System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 driver.manage().window().maximize();
        //goto url

        driver.get("https:www.amazon.com");

        //Call take screenshot function

        this.takeSnapShot(driver, "C:\\Users\\pittala_rajkumar\\Pictures\\Screenshots\\test.jpg") ;     

        driver.close();
    }

   
    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);
               

    }

}
