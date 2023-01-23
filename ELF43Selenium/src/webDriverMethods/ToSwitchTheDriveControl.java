package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchTheDriveControl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("/C:/Users/Vinayak/Downloads/MultipleWindow_20221207_153133525%20(2).html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		String expectedPageTitle="Original Italian Recipes - giallozafferano Recipes";
		Set<String> allWindowID = driver.getWindowHandles();
		for(String windowID : allWindowID) {
			driver.switchTo().window(windowID);
			String actualPageTitle = driver.getTitle();
			if(expectedPageTitle.equals(actualPageTitle)) {
				driver.manage().window().maximize();
				break;
			}
			
		}

	}

}
