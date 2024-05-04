package TestScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import objectRepository.RegisterPage;
import objectRepository.WelcomePage;

public class RegisterTest {
    @Test(groups = "smoke")
	public void Registertest_001() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getRegisterLink().click();
//		RegisterPage registerpage=new RegisterPage(driver);
//		if(registerpage.getRegisterTitle().getText().equals("Register")) {
//			System.out.println("pass");
//		}
//		else
			System.out.println("smoke");
//		driver.quit();
		
	}
    
    @Test(groups = "FT")
    public void Registertest_002() {
    	WebDriver driver=new FirefoxDriver();
    	driver.manage().window().maximize();
    	driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("FT");
//		WelcomePage welcome=new WelcomePage(driver);
//		welcome.getRegisterLink().click();
//		RegisterPage registerpage=new RegisterPage(driver);
//		registerpage.getFirstName().sendKeys("Naveen");
//		registerpage.getLastName().sendKeys("Murali");
//		registerpage.getEmail().sendKeys("Naveen@gmail.com");
//    	driver.quit();
    	
    	
    	
    }
}
