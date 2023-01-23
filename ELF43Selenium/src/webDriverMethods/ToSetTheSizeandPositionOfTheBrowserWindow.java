package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetTheSizeandPositionOfTheBrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://unacademy.com/");
		Thread.sleep(3000);
		Dimension sizeOfTheBrowser = driver.manage().window().getSize();
		int width = sizeOfTheBrowser.getWidth();
		int Height = sizeOfTheBrowser.getHeight();
		System.out.println(width);
		System.out.println(Height);
		Point positionOfTheBrowser = driver.manage().window().getPosition();
		System.out.println(positionOfTheBrowser.getX());
		System.out.println(positionOfTheBrowser.getY());
	}

}
