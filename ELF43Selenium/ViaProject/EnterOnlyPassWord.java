package ViaProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
//enter only valid password and click on sign-in:
import org.testng.annotations.Test;

public class EnterOnlyPassWord extends BaseClass {
// enter only password and click on sign-in:

	@Test
	public void enterOnlyPassWord() {
		BasePage bp=new BasePage(driver);
		bp.getSignIn().click();
		
		bp.getPasswordText().sendKeys("appu3700");
		bp.getLoginvalidate().click();;
		WebElement errormsg = driver.findElement(By.xpath("//div[contains(text(),'Enter Valid')]"));
		Reporter.log(errormsg.getText(),true);
	}
}
