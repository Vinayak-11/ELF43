package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateRegisterElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Vinayak");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("Malagavi");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("vnmalagavi.003@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("258963");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("258963");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);

	}

}
