package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Books")
	 private WebElement BooksLink;
	
	
	
	public WebElement getBooksLink() {
		return BooksLink;
	}
	@FindBy(linkText = "Computers")
	private WebElement ComputersLink;
	public WebElement getComputersLink() {
		return ComputersLink;
	}
	
	@FindBy(linkText = "Register")
	private WebElement RegisterLink;
	public WebElement getRegisterLink() {
		return RegisterLink;
	}
	@FindBy(linkText = "Log in")
	private WebElement LoginLink;
	@FindBy(linkText = "Log out")
	private WebElement LogoutLink;



	public WebElement getLoginLink() {
		return LoginLink;
	}
	public WebElement getLogoutLink() {
		return LogoutLink;
	}
	@FindBy(id = "Email")
	private WebElement EmailLogin;
	
	@FindBy(id = "Password")
	private WebElement PasswordLogin;
	
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	private WebElement LoginButton;



	public WebElement getEmailLogin() {
		return EmailLogin;
	}
	public WebElement getPasswordLogin() {
		return PasswordLogin;
	}
	public WebElement getLoginButton() {
		return LoginButton;
	}
}
