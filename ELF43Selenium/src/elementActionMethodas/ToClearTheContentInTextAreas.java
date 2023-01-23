package elementActionMethodas;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClearTheContentInTextAreas {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php?module=Users&parent=Settings&view=Login&error=login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Gayathrakka");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vnmalagavi@003");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		driver.quit();
	}

}
