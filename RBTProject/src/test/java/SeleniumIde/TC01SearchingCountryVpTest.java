package SeleniumIde;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TC01SearchingCountryVpTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeSuite
  public void setUp() {
	//System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe" );
    //driver = new ChromeDriver();
	  System.setProperty("webdriver.edge.driver","D:\\sel\\temp\\edgedriver_win64\\msedgedriver.exe");
	driver=new EdgeDriver();
	
		
    driver.manage().window().maximize();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterSuite
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tC01SearchingCountryVp() {
    driver.get("https://www.google.com/");
    driver.manage().window().setSize(new Dimension(1038, 646));
    
    driver.findElement(By.cssSelector(".LLD4me")).click();
    driver.findElement(By.name("q")).click();
    driver.findElement(By.name("q")).sendKeys("india");
    driver.findElement(By.cssSelector("form > div:nth-child(1)")).click();
    driver.findElement(By.name("btnK")).click();
    driver.close();
  }
}
