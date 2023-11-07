package javaAssignment3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
    
    private static WebDriver driver = null;

    public static void main(String[] args) {
       
        
        String homePage="https://www.Amazon.com/";
        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;
        System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        driver.manage().window().maximize();
        driver.get(homePage);
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        System.out.println( links.size());
           
        Iterator<WebElement> it = links.iterator();
        
        while(it.hasNext()){
            
            url = it.next().getAttribute("href");
            
            
            try {
                huc = (HttpURLConnection)(new URL(url).openConnection());
                
                huc.setRequestMethod("GET");
                
                huc.connect();
                
                respCode = huc.getResponseCode();
                
                if(respCode>= 400){
                    System.out.println(url+" is a broken link");
                }
                else{
                    System.out.println(url+" is a valid link");
                }
                    
            } catch (MalformedURLException e) {
                
                e.printStackTrace();
            } catch (IOException e) {
                
                e.printStackTrace();
            }
        }
        
        driver.quit();

    }
}
