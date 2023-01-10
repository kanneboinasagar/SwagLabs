package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	
 @FindBy(id="user-name")
 private WebElement un;
 
 
 @FindBy(id="password")
 private WebElement pwd;
 
 @FindBy(name="login-button")
 private WebElement submitButton;
 
 
 public LoginPage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }


public WebElement getUn() {
	return un;
}


public WebElement getPwd() {
	return pwd;
}


public WebElement getSubmitButton() {
	return submitButton;
}
 


}
 
