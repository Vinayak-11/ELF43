package ViaProject;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginWithFB extends BaseClass{

	@Test
	public void loginWithFb() throws InterruptedException {
	BasePage bp=new BasePage(driver);
	
	bp.getSignIn().click();
	WebElement faceBookTb = bp.getLoginWithFaceBook();
	
	SoftAssert sf=new SoftAssert();
	System.out.println(faceBookTb.getCssValue("background"));
	sf.assertEquals(faceBookTb.getCssValue("background"),"rgba(82, 104, 158, 1)","border colour is invaild");
	faceBookTb.click();
	Thread.sleep(5000);
	}
}
