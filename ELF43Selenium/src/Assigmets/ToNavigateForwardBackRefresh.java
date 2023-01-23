package Assigmets;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateForwardBackRefresh {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.quit();
		

	}

}
