package elementActionMethodas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSelectDisplayandEnableTheElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.name("username")).sendKeys("mynameisvinayak");
		driver.findElement(By.name("password")).sendKeys("Malagavi@003");
		Thread.sleep(10000);
	
		driver.findElement(By.xpath("//button[text()='Log in']")).isEnabled();
		
	
	}

}

