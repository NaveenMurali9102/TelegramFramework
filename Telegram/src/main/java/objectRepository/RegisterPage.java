package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "FirstName")
	private WebElement FirstName;
	
	@FindBy(id = "LastName")
	private WebElement lastName;
	
	@FindBy(id = "Email")
	private WebElement Email;

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return Email;
	}
	
	@FindBy(xpath = "//div[@class='page-title']//h1")
	private WebElement RegisterTitle;

	public WebElement getRegisterTitle() {
		return RegisterTitle;
	}
}
