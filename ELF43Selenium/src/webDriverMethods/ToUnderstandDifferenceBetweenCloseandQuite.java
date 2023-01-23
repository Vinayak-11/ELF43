package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandDifferenceBetweenCloseandQuite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Vinayak/Downloads/MultipleWindow_20221207_153133525%20(2).html");
		//driver.findElement(By.xpath("//input[@value='Open Foods Sites")).click();
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		Set<String> allWindows=driver.getWindowHandles();
		//System.out.println("Size of set : "+ allWiondows());
		for(String windowID : allWindows) {
			System.out.println(windowID);
		}
		driver.quit();
			
	}

}
