package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ComputersPage {

	public WebElement getDesktopLink() {
		return DesktopLink;
	}
	public ComputersPage(WebDriver driver) {
	PageFactory.initElements(driver,this );	
	}
	@FindBy(linkText = "Desktops")
	private WebElement DesktopLink;
	
	public WebElement getProductTitle() {
		return ProductTitle;
	}
	public WebElement getCart() {
		return Cart;
	}
	@FindBy(linkText = "Build your own cheap computer")
	private WebElement ProductTitle;
	
	@FindBy(id = "add-to-cart-button-72")
	private WebElement Cart;
}
