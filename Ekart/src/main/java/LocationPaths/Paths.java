package LocationPaths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paths {
	
	WebDriver driver;

	public Paths(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id='basic-nav-dropdown']/span")
	public 
	WebElement Categories;
	
	@FindBy(xpath="//a[contains (text(),' Accessories ')]")
	public
	WebElement Accessories;
	
	@FindBy(xpath="//div/a[17]")
	public
	WebElement Watch;
	
	@FindBy(xpath="//button[@class='btn btn-warning']")
	public
	WebElement AddToCart;
	
	@FindBy(xpath="(//div/button[1])[2]")
	public 
	WebElement decrease;
	
	@FindBy(xpath="//div/button[2]")
	public 
	WebElement Increase;
	
	@FindBy(xpath="//input[@name='userName']")
	public 
	WebElement Username;
	
	@FindBy(xpath="//input[@name='fullName']")
	public 
	WebElement FullName;
	
	@FindBy(xpath="//input[@name='email']")
	public 
	WebElement Email;
	
	@FindBy(xpath="//input[@name='password']")
	public 
	WebElement Password;
	
	@FindBy(xpath="//input[@name='contactNumber']")
	public 
	WebElement ContactNumber;
	
	@FindBy(xpath="//button[contains(text(),'Register')]")
	public 
	WebElement Register;
	
	@FindBy(xpath="//button[contains(text(),'Back')]")
	public 
	WebElement Back;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	public
	WebElement LoginButton;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	public
	WebElement  SignUp;
	
	@FindBy(xpath="(//span)[3]")
	public
	WebElement LoggedIn;
	
	@FindBy(xpath="//a[contains (text(),'Profile')]")
	public
	WebElement Profile;
	
	@FindBy(xpath="(//a[1])[5]")
	public 
	WebElement ManageProfile;
	
	@FindBy(xpath="//button[contains(text(),'Edit Profile')]")
	public 
	WebElement EditProfile;
	
	@FindBy(xpath="//button[contains(text(),'change password')]")
	public 
	WebElement Changepassword;
	
	@FindBy(xpath="//button[contains(text(),'save')]")
	public 
	WebElement Save;
	
	@FindBy(xpath="//button[contains(text(),'cancel')]")
	public 
	WebElement Cancel;
	
	@FindBy(xpath="//input[@name='newPassword']")
	public 
	WebElement NewPassword;
	
	@FindBy(xpath="//input[@name='re-enterNewPassword']")
	public 
	WebElement ReenterNewPassword;
	
	@FindBy(xpath="//a[5]")
	public 
	WebElement CustomerLogout;
	
	@FindBy(xpath="(//a[3])[1]")
	public
	WebElement Login;
	
	@FindBy(xpath="//span[contains(text(),'register here')]")
	public
	WebElement SellerRegister;
	
	@FindBy(xpath="//a[2]")
	public
	WebElement Dashboard;
	
	@FindBy(xpath="(//a)[6]")
	public
	WebElement SellerLogOut;
	
	@FindBy(xpath="(//span)[3]")
	public
	WebElement sellerLogged;
	
	@FindBy(xpath="(//a[1])[2]")
	public 
	WebElement Home;
	
	@FindBy(xpath="(//a)[6]")
	public 
	WebElement FashionProduct;
	
	@FindBy(xpath="//button[contains(text(),' Add Product')]")
	public 
	WebElement AddProduct;
	
	@FindBy(xpath="//input[@name='productName']")
	public
	WebElement ProductName;
	
	@FindBy(xpath="//input[@name='logoImg']")
	public
	WebElement MainProductImage;
	
	@FindBy(xpath="//input[@name='productPrice']")
	public
	WebElement ProductPrice;
	
	@FindBy(xpath="//input[@name='productDescription']")
	public
	WebElement productDescription;
	
	@FindBy(xpath="//input[@name='brandName']")
	public
	WebElement brandName;
	
	@FindBy(xpath="//select[@id='type']")
	public
	WebElement ChooseFashionType;
	
	@FindBy(xpath="//select[@name='suitablefor']")
	public
	WebElement Suitablefor;
	
	@FindBy(xpath="//input[@name='manufactureDate']")
	public
	WebElement ManufactureDate;
	
	
	@FindBy(xpath="//select[@id='size']")
	public
	WebElement ChooseSize;
	
	@FindBy(xpath="//input[@name='productImg1']")
	public
	WebElement ProductImg1;
	
	@FindBy(xpath="//input[@name='productImg2']")
	public
	WebElement ProductImg2;
	
	@FindBy(xpath="//input[@name='productImg3']")
	public
	WebElement ProductImg3;
	
	@FindBy(xpath="//input[@name='productImg4']")
	public
	WebElement ProductImg4;
	
	@FindBy(xpath="//input[@name='productImg5']")
	public
	WebElement ProductImg5;
	
	@FindBy(xpath="//input[@name='color']")
	public
	WebElement Color;
	
	@FindBy(xpath="//input[@name='qty']")
	public
	WebElement Quantity;
	
	//@FindBy(xpath="//button[contains(text(),'Submit')]")
	//@FindBy(xpath="(//button)[2]")
	//@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/div/div/form/button")
	@FindBy(css="button[class='btn btn-success']")
	public
	WebElement Submit;
	
	@FindBy(xpath="//button[contains(text(),'Back')]")
	public
	WebElement BackButton;
	
	@FindBy(xpath="(//button[@class='btn btn-info mt-0'])[last()]")
	public
	WebElement update;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
