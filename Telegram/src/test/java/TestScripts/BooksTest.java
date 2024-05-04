package TestScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import objectRepository.BooksPage;
import objectRepository.WelcomePage;

public class BooksTest {


	@Test//(groups = "smoke")
	public void Bookspage_001(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage welcome=new WelcomePage(driver);
		BooksPage books=new BooksPage(driver);
		welcome.getBooksLink().click();
//	if(books.getBooksTitle().getText().equals("Books")) {
//		System.out.println("Test case pass");
//	}
//	else 
//		System.out.println("Test case fail");
//
		System.out.println("smoke");
}
	
}
