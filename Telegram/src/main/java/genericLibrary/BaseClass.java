package genericLibrary;

import java.lang.reflect.Method;
import java.time.Duration;

import org.checkerframework.common.util.report.qual.ReportCall;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import net.bytebuddy.implementation.bind.MethodNameEqualityResolver;
import objectRepository.WelcomePage;

public class BaseClass {
	public WebDriver driver;
    public ExtentReports report;
    public ExtentTest test;
	@BeforeSuite
	public void bs() {
	    report=new ExtentReports("./Reports/report.html");
		System.out.println("before suite");
	}
	@BeforeTest
	public void bt() {
		System.out.println("before test");
	}
	@BeforeClass
	public void launchbrowser() {
	 driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@BeforeMethod
	public void loginApp(Method method) {
		//Method method;
		String MethodName=method.getName();
		test=report.startTest(MethodName);
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getLoginLink().click();
		welcome.getEmailLogin().sendKeys("wafes2023@gmail.com");
		welcome.getPasswordLogin().sendKeys("Naruto@12345");
		welcome.getLoginButton().click();
	}
	@AfterSuite
	public void as(){
report.flush();
		System.out.println("after suite");
	}
	@AfterTest
	public void at() {
		System.out.println("after test");
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	@AfterMethod
	public void logout() {
		report.endTest(test);
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getLogoutLink().click();
	}
}
