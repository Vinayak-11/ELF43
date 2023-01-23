package ViaProject;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CorporateLogin extends BaseClass {

	@Test
	public void CorporateLogin()  {
		BasePage bp= new BasePage(driver);
		bp.getSignIn().click();
		Reporter.log("Able to click on sign-in",true);
		bp.getCorporateLogin().click();
		Reporter.log("Able to click on Corporrate",true);
	}
}
