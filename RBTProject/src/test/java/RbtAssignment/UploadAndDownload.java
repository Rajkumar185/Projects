package RbtAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadAndDownload {
	
	
	WebDriver driver;

		
		public UploadAndDownload(WebDriver driver) {
			super();
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(id="item-7")
		WebElement UploadAndDownloadElement;
		@FindBy(id="downloadButton")
		WebElement Download;
		@FindBy(css="#uploadFile")
		WebElement Upload;
		public void uploadAndDownloadInfo() {
			Actions a=new Actions(driver);
			try{
				
				if(UploadAndDownloadElement.isDisplayed()) {
					UploadAndDownloadElement.click();
					System.out.println("UploadAndDownload button is Clicked");
				}
				else
				{
					System.out.println("UploadAndDownload button is not Clicked");
				}
					
					
					if(Download.isDisplayed()) {
						Download.click();
						System.out.println("Download button is Clicked");
					}
					else
					{
						System.out.println("Download button is not Clicked");
					}
					if(Upload.isDisplayed()) {
						a.click(Upload).build().perform();
						//Thread.sleep(2000);
						Upload.sendKeys("D:\\sel\\newhtml.html");

						System.out.println("Upload button is Clicked");
					}
					else
					{
						System.out.println("Upload button is not Clicked");
					}
					
					
					System.out.println("UploadAndDownloadElement Executed Sucessfully");

						}
				catch(Exception e) {
					e.printStackTrace();
					System.out.println("Exception raised in UploadAndDownload:"+e);
				}

		}
}

//String url="";
//private static boolean isDisplayed() {
//			// TODO Auto-generated method stub
//			return false;
//		}
//Actions a=new Actions(driver);
////WebElement upload=driver.findElement(By.tagName("input"));
//WebElement upload=driver.findElement(By.cssSelector("#uploadFile"));
//a.click(upload).build().perform();
//Thread.sleep(2000);
//upload.sendKeys("D:\\sel\\newhtml.html");

	
// driver.close();
