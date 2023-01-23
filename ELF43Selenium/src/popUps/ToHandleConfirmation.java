package popUps;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleConfirmation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 15);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		driver.get("https://licindia.in/");
		try {
			driver.findElement(By.linkText("Agents Portal")).click();
		}
		catch(ElementClickInterceptedException e) {
			js.executeScript("window.scrollBy(0,200);");
			driver.findElement(By.linkText("Agents Portal")).click();
		}
		
		Alert confirmationAlert=driver.switchTo().alert();
		System.out.println(confirmationAlert.getText());
		confirmationAlert.accept();
		
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		allWindows.remove(parentWindowId);
		for(String element:allWindows) {
			driver.switchTo().window(element);
			driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		}
		
		WebElement errormsg = driver.findElement(By.id("da_textfield-1105-errorEl"));
		System.out.println(errormsg.getText());
	}

}
