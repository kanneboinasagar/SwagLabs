package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.javafaker.Faker;

public class CartPage
{
	@FindBy(id="checkout")
	private WebElement checkout;
	
	@FindBy(id="continue")
	private WebElement contin;
	
	
	@FindBy(id="first-name")
	private WebElement FirstName;
	
	@FindBy(id="last-name")
	private WebElement Lastname;
	
	@FindBy(name="postalCode")
   private WebElement Code;
	
	@FindBy(name="finish")
	private WebElement finish;
	
	@FindBy(className="title")
			private WebElement result;
	
	public WebElement getResult() {
		return result;
	}


	public WebElement getFinish() {
		return finish;
	}


	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getCode() {
		return Code;
	}

	

	public WebElement getContin() {
		return contin;
	}


	public WebElement getCheckout() {
		return checkout;
	}
	
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
