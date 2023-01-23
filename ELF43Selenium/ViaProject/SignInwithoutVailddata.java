package ViaProject;
// enter only email-id and click on sign-in:

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SignInwithoutVailddata extends BaseClass {

	@Test
	public void test() throws InterruptedException {

		BasePage bp = new BasePage(driver);

		bp.getSignIn().click();
		bp.getLoginText().clear();
		bp.getLoginText().sendKeys("apoorvamangalore40@gmail.com");

		bp.getLoginvalidate().click();
		WebElement errorMsg = driver.findElement(By.xpath("//div[contains(text(),'Password must')]"));
		Reporter.log(errorMsg.getText(),true);
	}
}
