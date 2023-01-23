package ViaProject;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
//click on agentlogin-in
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ClickOnAgent extends BaseClass {

	@Test
	public void agentLogin() throws InterruptedException {
		BasePage bp=new BasePage(driver);
		bp.getSignIn().click();
		SoftAssert sf=new SoftAssert();
		WebElement agentTb = bp.getAgentLogin();
		Reporter.log(agentTb.getCssValue("color"),true);
		sf.assertEquals(agentTb.getCssValue("border-color"),"rgba(18, 181, 138, 1)","invaild");
		Reporter.log(agentTb.getCssValue("background"),true);
		
		sf.assertEquals(agentTb.getCssValue("background"),"rgba(255, 255, 255, 1)","invaild");
		agentTb.click();
		Thread.sleep(2000);
	}
}
