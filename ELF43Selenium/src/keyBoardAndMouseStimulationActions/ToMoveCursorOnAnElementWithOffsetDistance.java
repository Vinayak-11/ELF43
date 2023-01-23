package keyBoardAndMouseStimulationActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveCursorOnAnElementWithOffsetDistance {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.sendKeys("Vinayak@123");
		Actions actions = new Actions(driver);
		//actions.moveToElement(passwordTextField, 0, 250).click().perform();//y axis location
		actions.moveToElement(passwordTextField, 300, 0).click().perform();//x axis location

	}

}
