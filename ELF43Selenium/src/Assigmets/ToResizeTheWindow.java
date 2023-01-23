package Assigmets;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToResizeTheWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://aranya.gov.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		/*Point positionOfTheBrowser = new Point(0,0);
		driver.manage().window().setPosition(positionOfTheBrowser);
		Thread.sleep(2000);*/
		Dimension sizeOfTheBrowser = new Dimension(1000, 1000);
		driver.manage().window().setSize(sizeOfTheBrowser);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
