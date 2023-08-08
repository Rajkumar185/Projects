package Ekart;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import LocationPaths.Paths;

public class Seller extends Paths {
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	
	public Seller(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void sellerRegister() {
		try {
			Thread.sleep(2000);
			if (SellerRegister.isEnabled())
				SellerRegister.click();
//			JavascriptExecutor js= (JavascriptExecutor)driver;
//			js.executeScript("arguments[0].click();", SellerRegister);
		} catch (Exception e) {
			System.out.println("Error in SellerRegister Method" + e.getMessage());
		}
	}

	public void sellerSignUp() {
		try {
			if (Username.isDisplayed())
				Username.sendKeys("GaneshEnterprises");
			else {
				System.out.println("Error in Username");
			}
			Thread.sleep(2000);
			if (FullName.isDisplayed())
				FullName.sendKeys("Ganesh Enterprises");
			else {
				System.out.println("Error in FullName");
			}
			Thread.sleep(2000);

			if (Email.isDisplayed())
				Email.sendKeys("GaneshEnterprises@yahoo.com");
			else {
				System.out.println("Error in Email");
			}
			Thread.sleep(2000);
			if (Password.isDisplayed())
				Password.sendKeys("Ganesh123");
			else {
				System.out.println("Error in Password");
			}
			Thread.sleep(2000);
			if (ContactNumber.isDisplayed())
				ContactNumber.sendKeys("9876556789");
			else {
				System.out.println("Error in ContactNumber");
			}
			Thread.sleep(2000);
			if (Register.isEnabled())
				Register.click();
			else {
				System.out.println("Error in Register");
			}

		} catch (Exception e) {
			System.out.println("Error in SellerSignUp Method" + e.getMessage());
		}
	}

	public void SellerSignIn() {
		try {
			if (Username.isDisplayed())
				Username.sendKeys("GaneshEnterprises");
			else {
				System.out.println("Error in Username");
			}
			Thread.sleep(2000);

			if (Password.isDisplayed())
				Password.sendKeys("Ganesh123");
			else {
				System.out.println("Error in Password");
			}
			Thread.sleep(2000);
			if (LoginButton.isEnabled())
				LoginButton.click();
			else {
				System.out.println("Error in Login");
			}
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println("Error in SellerSignIn" + e.getMessage());
		}
	}

	public void productDetails() {
		try {
			if (FashionProduct.isEnabled())
				FashionProduct.click();
			else {
				System.out.println("Error in FashionProduct");

			}

		} catch (Exception e) {
			System.out.println("Error in productDetails" + e.getMessage());
		}
	}

	public void dashBoard() {
		try {
			if (Dashboard.isEnabled())
				Dashboard.click();
			else {
				System.out.println("Error in Dashboard");
			}

		} catch (Exception e) {
			System.out.println("Error in Dashboard" + e.getMessage());
		}

	}

	public void home() {
		try {
			if (Home.isEnabled())
				Home.click();
			else {
				System.out.println("Error in Home");
			}

		} catch (Exception e) {
			System.out.println("Error in Home Method" + e.getMessage());
		}
	}

	public void logout() {
		try {
			if (sellerLogged.isEnabled())
				sellerLogged.click();
			else {
				System.out.println("Error in sellerLogged");
			}
			Thread.sleep(2000);
			if (SellerLogOut.isEnabled())
				SellerLogOut.click();
			else {
				System.out.println("Error in SellerLogOut");
			}
		} catch (Exception e) {
			System.out.println("Error in Logout Method" + e.getMessage());
		}
	}

	public void addProduct() {
		try {
			if (AddProduct.isEnabled())
				AddProduct.click();
			else {
				System.out.println("Error in addProduct");
			}
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Error in addProduct Method" + e.getMessage());
		}
	}

	public void addNewProduct() {
		try {
			
			if (ProductName.isDisplayed())
				ProductName.sendKeys("DEYANN Straight Kurta");
			else {
				System.out.println("Error in ProductName");
			}
			// Thread.sleep(2000);
			if (MainProductImage.isDisplayed())
				MainProductImage.sendKeys(
						"https://res.cloudinary.com/dx7zsxo2g/image/upload/v1684399146/ethnic_wear-2.1_lf4c0t.png");
			else {
				System.out.println("Error in MainProductImage");
			}
			// Thread.sleep(2000);
			if (ProductPrice.isDisplayed())
				ProductPrice.sendKeys("1999");
			else {
				System.out.println("Error in ProductPrice");
			}
			// Thread.sleep(2000);
			if (productDescription.isDisplayed())
				productDescription.sendKeys("Men Maroon Printed Straight Kurta");
			else {
				System.out.println("Error in productDescription");
			}
			// Thread.sleep(2000);
			if (brandName.isDisplayed())
				brandName.sendKeys("DEYANN");
			else {
				System.out.println("Error in brandName");
			}
			Thread.sleep(2000);
			Select FashionType = new Select(ChooseFashionType);
			FashionType.selectByIndex(1);
			Thread.sleep(2000);
			Select Suitable = new Select(Suitablefor);
			Suitable.selectByValue("Male");
			Thread.sleep(2000);
			if (ManufactureDate.isDisplayed())
				ManufactureDate.sendKeys("23-06-2023");
			else {
				System.out.println("Error in ManufactureDate");
			}
			Thread.sleep(2000);
			Select Size = new Select(ChooseSize);
			Size.selectByVisibleText("L");
			Thread.sleep(2000);
			if (ProductImg1.isDisplayed())
				ProductImg1.sendKeys(
						"https://res.cloudinary.com/dx7zsxo2g/image/upload/v1684399146/ethnic_wear-2.1_lf4c0t.png");
			else {
				System.out.println("Error in ProductImg1");
			}
			// Thread.sleep(2000);
			if (ProductImg2.isDisplayed())
				ProductImg2.sendKeys(
						"https://res.cloudinary.com/dx7zsxo2g/image/upload/v1684399146/ethnic_wear-2.1_lf4c0t.png");
			else {
				System.out.println("Error in ProductImg2");
			}
			// Thread.sleep(2000);
			if (ProductImg3.isDisplayed())
				ProductImg3.sendKeys(
						"https://res.cloudinary.com/dx7zsxo2g/image/upload/v1684399146/ethnic_wear-2.1_lf4c0t.png");
			else {
				System.out.println("Error in ProductImg3");
			}
			// Thread.sleep(2000);
			if (ProductImg4.isDisplayed())
				ProductImg4.sendKeys(
						"https://res.cloudinary.com/dx7zsxo2g/image/upload/v1684399146/ethnic_wear-2.1_lf4c0t.png");
			else {
				System.out.println("Error in ProductImg4");
			}
			// Thread.sleep(2000);
			if (ProductImg5.isDisplayed())
				ProductImg5.sendKeys(
						"https://res.cloudinary.com/dx7zsxo2g/image/upload/v1684399146/ethnic_wear-2.1_lf4c0t.png");
			else {
				System.out.println("Error in ProductImg5");
			}
			// Thread.sleep(2000);

			if (Color.isDisplayed())
				Color.sendKeys("White");
			else {
				System.out.println("Error in Color");
			}
			// Thread.sleep(2000);
			if (Quantity.isDisplayed())
				Quantity.sendKeys("99");
			else {
				System.out.println("Error in Quantity");
			}
			Thread.sleep(2000);
			if(Submit.isEnabled()) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", Submit);
			//Thread.sleep(2000);
			}
			else {
				System.out.println("Error in Submit");
			}

		} catch (Exception e) {
			System.out.println("Error in ProductDetails" + e.getMessage());
		}
	}
	public void updateProduct() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			if(update.isEnabled())
			js.executeScript("arguments[0].click();", update);
			
			else {
				System.out.println("Error in update");
			}
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-1000)","");
			
			if (ProductName.isDisplayed()) {
				ProductName.clear();
				ProductName.sendKeys("DEYANN Straight Kurta");
			}
			else {
				System.out.println("Error in ProductName");
			}
			// Thread.sleep(2000);
			if (MainProductImage.isDisplayed()) {
				MainProductImage.clear();
				MainProductImage.sendKeys(
						"https://res.cloudinary.com/dx7zsxo2g/image/upload/v1684399146/ethnic_wear-2.1_lf4c0t.png");
			}
			else {
				System.out.println("Error in MainProductImage");
			}
			// Thread.sleep(2000);
			if (ProductPrice.isDisplayed()) {
				ProductPrice.clear();
				ProductPrice.sendKeys("1999");
			}
			else {
				System.out.println("Error in ProductPrice");
			}
			// Thread.sleep(2000);
			if (productDescription.isDisplayed()) {
				productDescription.clear();
				productDescription.sendKeys("Men Maroon Printed Straight Kurta");
			}
			else {
				System.out.println("Error in productDescription");
			}
			 Thread.sleep(2000);
			if (brandName.isDisplayed()) {
				brandName.clear();
				brandName.sendKeys("DEYANN");
			}
			else {
				System.out.println("Error in brandName");
			}
			Thread.sleep(2000);
			Select FashionType = new Select(ChooseFashionType);
			//FashionType.deselectAll();
			FashionType.selectByIndex(2);
			Thread.sleep(2000);
			Select Suitable = new Select(Suitablefor);
			//Suitable.deselectAll();
			Suitable.selectByValue("Male");
			Thread.sleep(2000);
			if (ManufactureDate.isDisplayed()) {
				ManufactureDate.clear();
				ManufactureDate.sendKeys("23-06-2023");
			}
			else {
				System.out.println("Error in ManufactureDate");
			}
			Thread.sleep(2000);
			Select Size = new Select(ChooseSize);
			//Size.deselectAll();
			Size.selectByVisibleText("M");
			Thread.sleep(2000);
			if (ProductImg1.isDisplayed()) {
				ProductImg1.clear();
				ProductImg1.sendKeys("https://res.cloudinary.com/dx7zsxo2g/image/upload/v1684399146/ethnic_wear-2.1_lf4c0t.png");
			}
			else {
				System.out.println("Error in ProductImg1");
			}
			// Thread.sleep(2000);
			if (ProductImg2.isDisplayed()) {
				ProductImg2.clear();
				ProductImg2.sendKeys("https://res.cloudinary.com/dx7zsxo2g/image/upload/v1684399146/ethnic_wear-2.1_lf4c0t.png");
			}
				else {
				System.out.println("Error in ProductImg2");
			}
			// Thread.sleep(2000);
			if (ProductImg3.isDisplayed()) {
				ProductImg3.clear();
				ProductImg3.sendKeys(
						"https://res.cloudinary.com/dx7zsxo2g/image/upload/v1684399146/ethnic_wear-2.1_lf4c0t.png");
			}
			else {
				System.out.println("Error in ProductImg3");
			}
			// Thread.sleep(2000);
			if (ProductImg4.isDisplayed()) {
				ProductImg4.clear();
				ProductImg4.sendKeys(
						"https://res.cloudinary.com/dx7zsxo2g/image/upload/v1684399146/ethnic_wear-2.1_lf4c0t.png");
			}
			else {
				System.out.println("Error in ProductImg4");
			}
			// Thread.sleep(2000);
			if (ProductImg5.isDisplayed()) {
				ProductImg5.clear();
				ProductImg5.sendKeys(
						"https://res.cloudinary.com/dx7zsxo2g/image/upload/v1684399146/ethnic_wear-2.1_lf4c0t.png");
			}
			else {
				System.out.println("Error in ProductImg5");
			}
			// Thread.sleep(2000);

			if (Color.isDisplayed()) {
				Color.clear();
				Color.sendKeys("White");
			}
			else {
				System.out.println("Error in Color");
			}
			// Thread.sleep(2000);
			if (Quantity.isDisplayed()) {
				Quantity.clear();
				Quantity.sendKeys("100");
			}
			else {
				System.out.println("Error in Quantity");
			}
			Thread.sleep(2000);
			if(Submit.isEnabled()) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;

			executor.executeScript("arguments[0].click();", Submit);
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			}
			else {
				System.out.println("Error in Submit");
			}

		} catch (Exception e) {
			System.out.println("Error in ProductDetails" + e.getMessage());
		}
	}

	
}
