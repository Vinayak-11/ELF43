package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandFrameInGoogle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='gb_d']")).click();
		Thread.sleep(1000);
		WebElement maps = driver.findElement(By.xpath("//iframe[@name='app']"));
		driver.switchTo().frame(maps);
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Maps")).click();
		Thread.sleep(1000);
		driver.quit();

	}

}
