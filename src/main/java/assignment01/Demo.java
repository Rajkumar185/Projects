package assignment01;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	public static void main(String args[]) throws IOException {
		
		WebElement alert;
		//System.setProperty("webdriver.chrome.driver","D:\\sel\\temp\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		List<String> windows=new ArrayList<String>(driver.getWindowHandles());
		System.out.println("Total windows are:"+windows.size());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.close();
	    driver.switchTo().newWindow(WindowType.TAB);
	   driver.navigate().to("https://www.google.co.in/");
	   File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(src,new File("d:\\selenium\\temp"));
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   //js.executeScript("arguments[0].click(); ",webelement );
	   Actions a=new Actions(driver);
	   //a.moveToElement(alert).build().perform();
	 
	   String parent =driver.getWindowHandle();//it will return the parent window names
		 Set<String > s=driver.getWindowHandles();
				 Iterator<String>I1=s.iterator();
				 while(I1.hasNext())
				 {
					 String child_window=I1.next();
					 if(!parent.equals(child_window))
					 {
						 driver.switchTo().window(child_window);
						 System.out.println(driver.switchTo().window(child_window).getTitle());
						 driver.close();
					 }
				 }
		 driver.switchTo().window(parent);//switch to parent window
		 
		 
		/* List<WebElement>allUrls= Listallurl;
		 System.out.println("Total Links in the web page:" + allUrls.size());
		 Iterator<WebElement>iterator=allUrls.iterator();//We will iterate Through the list and will check the elements in the list
		 while(iterator.hasNext()) {
			 url=iterator.next().getText();
			 System.out.println(url);*/
		
		 
		 /*Alert alert = driver.switchTo().alert();		
        String alertMessage= driver.switchTo().alert().getText();			
        System.out.println(alertMessage);	
        Thread.sleep(5000);		
        alert.accept();		
         */
		//How to refresh a webpage
			driver.navigate().refresh();
			driver.get(driver.getCurrentUrl());
			driver.navigate().to(driver.getCurrentUrl());
			driver.findElement(By.id("")).sendKeys(Keys.F5);
			driver.findElement(By.id("")).sendKeys("\uE035");  

		
		 ArrayList<String> list=new ArrayList<String>();
		//list.add(10);
		//list.add(20);  
		//list.add(30);  
		//list.add(40);  
		list.add("Rajkumar");
		list.add("Mohin");  
		list.add("Rajkumar");  
		list.add("Ajay");  

		Iterator it = list.iterator();
				while(it.hasNext())
					System.out.println(it.next());
				
				///Screenshot syntax
				
		    //Convert web driver object to TakeScreenshot
			TakesScreenshot scr=((TakesScreenshot)driver);
			
			//Call getScreenshotAs method to create image file
			File soc=scr.getScreenshotAs(OutputType.FILE);
			
			//Move image file to new destination
			File dest=new File("filepath");
			
			//Copy file at destination
			FileUtils.copyFile(soc, dest);
			
			//or
			
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			
			FileUtils.copyFile(src,new File("filepath"));
			
			/**Scenario #1: To Type Text in a Text Box
To type Text in Selenium WebDriver without using sendKeys() method
js.executeScript("document.getElementById('some id').value='someValue';");
js.executeScript("document.getElementById('Email').value='SoftwareTestingMaterial.com';");
Scenario #2: To Click on a Button
To click a Button in Selenium WebDriver using JavaScript
js.executeScript("document.getElementById('enter your element id').click();");
//or
js.executeScript("arguments&#91;0].click();", loginButton);
Scenario #3: To Handle Checkbox
We pass true or false to handle the checkbox
js.executeScript("document.getElementById('enter element id').checked=false;");
Scenario #4: To generate Alert Pop window in selenium

js.executeScript("alert('Welcome To SoftwareTestingMaterial');");

Scenario #5: To refresh browser window using Javascript
js.executeScript("history.go(0)");

Scenario #6: To get innertext of the entire webpage in Selenium
String sText =  js.executeScript("return document.documentElement.innerText;").toString();
System.out.println(sText);

Scenario #7: To get the Title of our webpage
String sText =  js.executeScript("return document.title;").toString();
System.out.println(sText);

Scenario #8: To get the domain
String sText =  js.executeScript("return document.domain;").toString();
System.out.println(sText);
Scenario #9: To get the URL of a webpage
String sText =  js.executeScript("return document.URL;").toString();
System.out.println(sText);

Scenario #10: To perform Scroll on an application using  Selenium
//Vertical scroll - down by 500  pixels
js.executeScript("window.scrollBy(0,500)");
// for scrolling till the bottom of the page we can use the code like
//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

Scenario #11: To click on a SubMenu which is only visible on mouse hover on Menu
js.executeScript("$('ul.menus.menu-secondary.sf-js-enabled.sub-menu li').hover()");

Scenario #12: To navigate to a different page using Javascript
js.executeScript("window.location = 'https://www.softwaretestingmaterial.com");

Scenario #13: To find a hidden element in selenium using JavaScriptExecutor
js.executeScript("arguments&#91;0].click();", element);
********************************************************************************************
 Example Syntax to work with Image
    xpath=//img[@alt='image alt text goes here']
Example syntax to work with table
    xpath=//table[@id='table1']//tr[4]/td[2]
    xpath=(//table[@class='nice'])//th[text()='headertext']/
Example syntax to work with anchor tag
    xpath=//a[contains(@href,'href goes here')]
    xpath=//a[contains(@href,'#id1')]/@class
Example syntax to work with input tags
    xpath=//input[@name='name2' and @value='yes']
We will take and sample XML document and we will explain different methods available to locate an element using Xpath

************************************************************************************************
Data Driven Framework in Selenium is a method of separating data sets from the test case. Once the data sets are separated from the test case, it can be easily modified for a specific functionality without changing the code. It is used to fetch test cases and suites from external files like Excel, .csv, .xml or some database tables.

To read or write an Excel, Apache provides a very famous library POI. This library is capable enough to read and write both XLS and XLSX file format of Excel.
To read XLS files, an HSSF implementation is provided by POI library.

To read XLSX, XSSF implementation of POI library will be the choice. Let’s study these implementations in detail.
*****
Keyword Driven Framework in Selenium is a method used for speeding up automated testing by separating keywords for common set of functions and instructions. All the operations and instructions to be performed are written in some external file like an Excel sheet. Users can easily control and specify the functionalities they want to test.

**************
Hybrid Framework in Selenium is a concept where we are using the advantage of both Keyword driven framework as well as Data driven framework. It is an easy to use framework which allows manual testers to create test cases by just looking at the keywords, test data and object repository without coding in the framework.
***************
Cucumber is a testing tool that supports Behavior Driven Development (BDD). It offers a way to write tests that anybody can understand, regardless of their technical knowledge. In BDD, users (business analysts, product owners) first write scenarios or acceptance tests that describe the behavior of the system from the customer’s perspective, for review and sign-off by the product owners before developers write their codes. Cucumber framework uses Ruby programming language.
***************
TestNG is an automation testing framework in which NG stands for “Next Generation”. TestNG is inspired by JUnit which uses the annotations (@). TestNG overcomes the disadvantages of JUnit and is designed to make end-to-end testing easy.
Using TestNG, you can generate a proper report, and you can easily come to know how many test cases are passed, failed, and skipped. You can execute the failed test cases separately.

•	Generate the report in a proper format including a number of test cases runs, the number of test cases passed, the number of test cases failed, and the number of test cases skipped.
•	Multiple test cases can be grouped more easily by converting them into testng.xml file. In which you can make priorities which test case should be executed first.
•	The same test case can be executed multiple times without loops just by using keyword called ‘invocation count.’
•	Using testng, you can execute multiple test cases on multiple browsers, i.e., cross browser testing.
•	The TestNG framework can be easily integrated with tools like TestNG Maven, Jenkins, etc.
•	Annotations used in the testing are very easy to understand ex: @BeforeMethod, @AfterMethod, @BeforeTest, @AfterTest
•	WebDriver has no native mechanism for generating reports. TestNG can generate the report in a readable format like the one shown below.
******************
@BeforeSuite: The annotated method will be run before all tests in this suite have run.

@AfterSuite: The annotated method will be run after all tests in this suite have run.

@BeforeTest: The annotated method will be run before any test method belonging to the classes inside the tag is run.

@AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the tag have run.

@BeforeGroups: The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked.

@AfterGroups: The list of groups that this configuration method will run after. This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked.

@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.

@AfterClass: The annotated method will be run after all the test methods in the current class have been run.

@BeforeMethod: The annotated method will be run before each test method.

@AfterMethod: The annotated method will be run after each test method.

@Test: The annotated method is a part of a test case



Below is the list of annotations that TestNG support in Selenium

BeforeSuite
BeforeTest
BeforeClass
BeforeMethod
Test Case
AfterMethod
AfterClass
AfterTest
AfterSuite
Let’s explore how these methods work.

@BeforeMethod: This will be executed before every @test annotated method.
@AfterMethod: This will be executed after every @test annotated method.
@BeforeClass: This will be executed before first @Test method execution. It will be executed one only time throughout the test case.
@AfterClass: This will be executed after all test methods in the current class have been run
@BeforeTest: This will be executed before the first @Test annotated method. It can be executed multiple times before the test case.
@AfterTest: A method with this annotation will be executed when all @Test annotated methods complete the execution of those classes inside the <test> tag in the TestNG.xml file.
@BeforeSuite: It will run only once, before all tests in the suite are executed.
@AfterSuite: A method with this annotation will run once after the execution of all tests in the suite is complete.
@BeforeGroups: This method will run before the first test run of that specific group.
@AfterGroups: This method will run after all test methods of that group complete their execution.
***************************************
There are thirteen different axes that are listed below. However, we’re not going to use all of them during Selenium testing.
1.	ancestor: These axes indicate all the ancestors relative to the context node, also reaching up to the root node.
2.	ancestor-or-self: This one indicates the context node and all the ancestors relative to the context node, and includes the root node.
3.	attribute: This indicates the attributes of the context node. It can be represented with the “@” symbol.
4.	child: This indicates the children of the context node.
5.	descendent: This indicates the children, grandchildren, and their children (if any) of the context node. This does NOT indicate the Attribute and Namespace.
6.	descendent-or-self: This indicates the context node and the children, and grandchildren and their children (if any) of the context node. This does NOT indicate the attribute and namespace.
7.	following: This indicates all the nodes that appear after the context node in the HTML DOM structure. This does NOT indicate descendent, attribute, and namespace.
8.	following-sibling: This one indicates all the sibling nodes (same parent as the context node) that appear after the context node in the HTML DOM structure. This does NOT indicate descendent, attribute, and namespace.
9.	namespace: This indicates all the namespace nodes of the context node.
10.	parent: This indicates the parent of the context node.
11.	preceding: This indicates all the nodes that appear before the context node in the HTML DOM structure. This does NOT indicate descendent, attribute, and namespace.
12.	preceding-sibling: This one indicates all the sibling nodes (same parent as context node) that appear before the context node in the HTML DOM structure. This does NOT indicate descendent, attribute, and namespace.
13.	self: This one indicates the context node.
Structure Of XPath Axes

*/
			
	   
	}

}
