package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopscrollToAnElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://in.linkedin.com/");
		WebElement elementTobeScrolled = driver.findElement(By.xpath("//h3[contains(text(),'Browse LinkedIn')]"));
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("argumets[0].scrollIntoView(true)", elementTobeScrolled );
	}

}
