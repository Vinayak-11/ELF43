package ViaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.annotations.Test;

public class NotAbleToClickOnText extends BaseClass {

	@Test
	public void msg() {
		BasePage bp = new BasePage(driver);
		WebElement textmsg = driver.findElement(By.xpath("//span[contains(text(), 'social network')]"));
		System.out.println("user should not able to click on this text");
		textmsg.getText();
	}
}
