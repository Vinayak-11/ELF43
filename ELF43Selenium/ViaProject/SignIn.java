package ViaProject;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SignIn extends BaseClass {

	@Test
	public void testCase() {
		BasePage bp=new BasePage(driver);
		bp.getSignIn().click();
		Reporter.log("clicked on sign in",true);
		
		bp.getSignUp().click();
		Reporter.log("clicked on sign up",true);
		bp.getNameTB().sendKeys("apoorva");
		
		String nameTbvalue = bp.getNameTB().getAttribute("value");
		Reporter.log(nameTbvalue,true);
		bp.getEmailId().sendKeys("apoorvamangalore40@gmail.com");
		
		String emailId = bp.getEmailId().getAttribute("value");
		Reporter.log(emailId,true);
		bp.getPasswordTb().sendKeys("appu3700");
		bp.getSingUpDetails().click();
	}
}
