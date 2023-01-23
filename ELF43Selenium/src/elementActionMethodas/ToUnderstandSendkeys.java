package elementActionMethodas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandSendkeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("source")).sendKeys("Haveri",Keys.CONTROL+"A");
		driver.findElement(By.id("source")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.id("destination")).sendKeys(Keys.CONTROL+"v");
		Thread.sleep(3000);
		driver.findElement(By.id("destination")).sendKeys(Keys.BACK_SPACE);//backspace will erase only one letter so we've to use multiple time for multiple letters or delete
		Thread.sleep(2000);
		driver.findElement(By.id("destination")).sendKeys(Keys.CONTROL+"A");
		Thread.sleep(1000);
		driver.findElement(By.id("destination")).sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		driver.findElement(By.id("destination")).sendKeys("Bengalore");
		Thread.sleep(2000);
		driver.quit();

	}

}
