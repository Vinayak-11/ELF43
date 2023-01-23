 package Assigmets;

import org.openqa.selenium.chrome.ChromeDriver;

public class TogetTitleURLPageSource {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		System.out.println(driver.getPageSource());
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		
	}

}
