package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegisterUser {

	@Parameters("browserName")
	@Test
	public void createuser(String browserNameinfo) {
		WebDriver driver = null;
		if (browserNameinfo.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserNameinfo.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver", "./drivers/operadriver.exe");
			driver = new OperaDriver();
		} else if (browserNameinfo.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			throw new InvalidBrowserNameException();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Vinayak");
		driver.findElement(By.id("LastName")).sendKeys("Malagavi");
		driver.findElement(By.id("Email")).sendKeys("vnmalagavi.003@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Vnmalagavi@003");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Vnmalagavi@003");
		driver.findElement(By.id("register-button")).click();

	}
}

class InvalidBrowserNameException extends RuntimeException {
	InvalidBrowserNameException() {
		super("Please enter valid browser");
	}

}
