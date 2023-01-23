package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandframeinDream11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dream11.com/");
		driver.manage().window().maximize();
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		Thread.sleep(5000);
		driver.switchTo().frame(frameElement);
		driver.findElement(By.id("regEmail")).sendKeys("7349434753");
		Thread.sleep(2000);
		driver.quit();

	}

}
