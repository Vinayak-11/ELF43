package Assigmets;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToMoveWindowToCo_ordinates {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://aranya.gov.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Point CoordinateOfTheBrowser=new Point(100,50);
		driver.manage().window().setPosition(CoordinateOfTheBrowser);
		Thread.sleep(3000);
		driver.quit();

	}

}
