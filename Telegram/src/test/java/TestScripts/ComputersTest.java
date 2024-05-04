package TestScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import objectRepository.ComputersPage;
import objectRepository.WelcomePage;

public class ComputersTest {

	@Test(groups = "regression")
	public void ComputersPage_001() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getComputersLink().click();
		System.out.println("regression");
//		ComputersPage computer=new ComputersPage(driver);
//		computer.getDesktopLink().click();
//		computer.getProductTitle().click();
//		computer.getCart().click();
//		driver.quit();
	}
}
