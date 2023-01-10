package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(name="add-to-cart-sauce-labs-bolt-t-shirt")
   private WebElement AddToCart;
	
	@FindBy(id="react-burger-menu-btn")
	private WebElement LogImage;
	
	 @FindBy(id="logout_sidebar_link")
	private WebElement logout;
	 
	 @FindBy(className="shopping_cart_link")
	 private WebElement cart;
	 
	 @FindBy(xpath="//div[@class=\"inventory_item_name\"]/../../../../..")
			 private WebElement productnamelist;
	 
	 public WebElement getProductnamelist() {
		return productnamelist;
	}

	public HomePage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }

	public WebElement getCart() {
		return cart;
	}

	public WebElement getAddToCart() {
		return AddToCart;
	}

	public WebElement getLogImage() {
		return LogImage;
	}

	public WebElement getLogout() {
		return logout;
	}
	 
	 
	
	
	
	
	
	
}
