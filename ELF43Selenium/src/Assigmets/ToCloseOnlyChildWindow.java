package Assigmets;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseOnlyChildWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Vinayak/Downloads/MultipleWindow.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(1000);
		String expectedPageTitle="Multiple Pages";
		Set<String> allWindowIDs = driver.getWindowHandles();
		for(String windowID : allWindowIDs) {
			driver.switchTo().window(windowID);
			String actualPageTitle = driver.getTitle();
			if(!expectedPageTitle.equals(actualPageTitle)) {
				driver.close();
				
				
				
			}
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
