package RbtAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class WebTable {
	
WebDriver driver;
	
	public WebTable(WebDriver driver) {
		super();
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="item-3")
	WebElement WebTableElement;
	@FindBy(id="searchBox")
	WebElement SearchBox;
	@FindBy(id="addNewRecordButton")
	WebElement NewRecord;
	@FindBy(css="#firstName")
	WebElement FirstName;
	@FindBy(css="#lastName")
	WebElement LastName;
	@FindBy(css="#userEmail")
	WebElement Email;
	@FindBy(css="#age")
	WebElement Age;
	@FindBy(css="#salary")
	WebElement Salary;
	@FindBy(css="#department")
	WebElement Department;
	@FindBy(css="#submit")
	WebElement Submit;
	@FindBy(id="searchBox")
	WebElement ClearSerachbox;
	@FindBy(id="searchBox")
	WebElement SearchName;
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]")
	WebElement TableData;
	
	
	@Test
	public void webTableInfo() {
		try{
			if(WebTableElement.isDisplayed()) {
				WebTableElement.click();;
				System.out.println("WebTableElement button is Clicked");
			}
			else
			{
				System.out.println("WebTableElement button is not Clicked");
			}
			
			if(SearchBox.isDisplayed()) {
				SearchBox.sendKeys("Rajkumar");
				System.out.println("Entered the FirstName in SearchBox");
			}
			else
			{
				System.out.println("text is not Entered in SearchBox");
			}
			
			if(NewRecord.isDisplayed()) {
				NewRecord.click();
				System.out.println("Clicked on add button");
			}
			else
			{
				System.out.println("Not Clicked on add button");
			}
			Thread.sleep(2000);
			if(FirstName.isDisplayed()) {
				FirstName.sendKeys("Rajkumar");
				System.out.println("Entered the FirstName in TextBox");
			}
			else
			{
				System.out.println("FirstName is not Entered in TextBox");
			}
			if(LastName.isDisplayed()) {
				LastName.sendKeys("Raj");
				System.out.println("Entered the LastName in TextBox");
			}
			else
			{
				System.out.println("LastName is not Entered in TextBox");
			}
			if(Email.isDisplayed()) {
				Email.sendKeys("rajkumarraj@gmail.com");
				System.out.println("Entered the Email in TextBox");
			}
			else
			{
				System.out.println("Email is not Entered in TextBox");
			}
			if(Age.isDisplayed()) {
				Age.sendKeys("24");
				System.out.println("Entered the Age in TextBox");
			}
			else
			{
				System.out.println("Age is not Entered in TextBox");
			}
			if(Salary.isDisplayed()) {
				Salary.sendKeys("30000");
				System.out.println("Entered the Salary in TextBox");
			}
			else
			{
				System.out.println("Salary is not Entered in TextBox");
			}
			if(Department.isDisplayed()) {
				Department.sendKeys("BCM");
				System.out.println("Entered the Department in TextBox");
			}
			else
			{
				System.out.println("Department is not Entered in TextBox");
			}
			if(Submit.isDisplayed()) {
				Submit.click();
				System.out.println("Submit button is clicked");
			}
			else
			{
				System.out.println("Submit button is not clicked");
			}
			if(SearchBox.isDisplayed()) {
				SearchBox.clear();
				System.out.println("SearchBox is Cleared");
			}
			else
			{
				System.out.println("SearchBox is not Cleared");
			}
			if(SearchName.isDisplayed()) {
				SearchName.sendKeys("Rajkumar");
				System.out.println("Entered the Name in Textbox");
			}
			else
			{
				System.out.println("Name is not Entered in TextBox");
			}
			if(TableData.isDisplayed()) {
				System.out.print(TableData.getText());
				System.out.println("Table information is retreived");
			}
			else
			{
				System.out.println("data not displayed");
			}
						System.out.println("WebTable Element Executed Sucessfully");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception raised in WebTable:"+e);
		}	
	}
}

		
		



