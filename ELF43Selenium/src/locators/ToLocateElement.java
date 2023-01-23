package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement loginLink= driver.findElement(By.linkText("login"));
		loginLink.click();
		driver.findElement(By.id("Email")).sendKeys("Vinayak");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Testing@123");
		Thread.sleep(2000);
		

	}

}
