package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateRegisterInDempoWorkshop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[href=\'/register']")).click();
		driver.findElement(By.cssSelector("input[id='gender-male']")).click();
		driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("Vinayak");
		driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("Malagavi");
		driver.findElement(By.cssSelector("[id='Email']")).sendKeys("abc.003@gmail.com");
		driver.findElement(By.cssSelector("[id='Password']")).sendKeys("Vnmalagavi@003");
		driver.findElement(By.cssSelector("[id='ConfirmPassword']")).sendKeys("Vnmalagavi@003");
		driver.findElement(By.cssSelector("[id='register-button']")).click();
		Thread.sleep(1000);
		driver.close(); 
		//driver.findElement(By.cssSelector("a[href='Log out']")).click();
		
	}

}
