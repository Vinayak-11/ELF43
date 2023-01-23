 package javaScriptExecutor;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDoodleScrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/doodles");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		for(;;) {
			try {
				driver.findElement(By.linkText("Cambodia Independence Day 2022")).click();
				break;
			}
			catch(org.openqa.selenium.NoSuchElementException e) {
				js.executeScript("window.scrollBy(0,200);");
			}
		}
		Thread.sleep(2000);
		driver.quit();

	}

}
