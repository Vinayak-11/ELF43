package ViaProject;
//click on mob num text box and get options:

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GetDropDownOption extends BaseClass {

	@Test
	public void dropDown() throws InterruptedException {
		BasePage bp = new BasePage(driver);
		bp.getSignIn().click();
		Reporter.log("Use is able to click on sign_in button", true);
		bp.getSignUp().click();
		Reporter.log("User is able to click on sing-up", true);

		WebElement mobnum = bp.getMobiledropdown();
		mobnum.click();
		Reporter.log("User is able to click on mobile driop down", true);

		Select mobnumtb = new Select(mobnum);
		List<WebElement> mobnumoptions = mobnumtb.getOptions();

		for (WebElement ele : mobnumoptions) {
			Reporter.log(ele.getText(), true);
		}
	}
}
