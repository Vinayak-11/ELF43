package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleAlertPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 15);
		
		driver.get("https://firelawn.com/user-signin");
		driver.findElement(By.id("fl_email")).sendKeys("vnmalagavi.003@gmail.com");
		driver.findElement(By.id("fl_password")).sendKeys("Vnmalagavi@003");
		driver.findElement(By.id("fl_login")).click();
		//driver.findElement(By.id("fl_login")).click();
		driver.findElement(By.id("//div[text()='V']")).click();
		driver.findElement(By.xpath("//li[text()='My Profile']")).click();

	}

}
