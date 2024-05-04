package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ElectronicsTest {

	@Test(groups = "smoke")//(invocationCount = 0,threadPoolSize = 0,enabled = true)//(priority = 0)
	public void Register() {
		WebDriver driver=new FirefoxDriver();
		System.out.println("Register smoke");
		//driver.get("dgeydchhn");
		driver.quit();
	}
	
	@Test(groups = "regression")//(dependsOnMethods = "Register")//(priority = 1)
	public void Login() {
		WebDriver driver=new FirefoxDriver();
		System.out.println("Login regression");
		driver.quit();
	}
	

	@Test(groups = "smoke")//(dependsOnMethods = "Login")//(priority = 2)
	public void AddToCart() {
		WebDriver driver=new FirefoxDriver();
		System.out.println("AddToCart smoke");
		//driver.get("dgeydchhn");
		driver.quit();
	}
	

	@Test(groups = "FT")//(dependsOnMethods = "AddToCart")//(priority = 3)
	public void Payment() {
		WebDriver driver=new FirefoxDriver();
		System.out.println("Payment FT");
		driver.quit();
	}

	@Test(groups = "regression")//(dependsOnMethods = "Payment")//(priority = 4)
	public void ConfirmOrder() {
		WebDriver driver=new FirefoxDriver();
		System.out.println("ConfirmOrder regression");
		driver.quit();
	}
}
