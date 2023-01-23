package ViaProject;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginWithGoogle extends BaseClass{

	@Test
	public void loginWithGoogle() throws InterruptedException {
		BasePage bp=new BasePage(driver) ;
		bp.getSignIn().click();
		
		WebElement gTb = bp.getLoginwithGoogle();
		
		SoftAssert sf=new SoftAssert();
		System.out.println(gTb.getCssValue("background"));
		sf.assertEquals(gTb.getCssValue("background"), "rgba(217, 77, 50, 1)","border colour is invaild");
		Thread.sleep(5000);
		gTb.click();
		
	}
}
