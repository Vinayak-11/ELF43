package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementInActitime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).click();
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("trainee");
		driver.findElement(By.name("pwd")).click();
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
		
	}

}
