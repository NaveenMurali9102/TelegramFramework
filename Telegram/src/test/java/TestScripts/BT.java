package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import genericLibrary.BaseClass;
import objectRepository.BooksPage;
import objectRepository.WelcomePage;

public class BT extends BaseClass {

	@Test
	public void Bttest() {
WelcomePage welcome=new WelcomePage(driver);
	welcome.getBooksLink().click();
	test.log(LogStatus.INFO, "clicked on books link");
	BooksPage book=new BooksPage(driver);
    Assert.assertEquals(book.getBooksTitle().getText(), "Books");
    test.log(LogStatus.PASS, "Books page is displayed");
	
	
	}
}
