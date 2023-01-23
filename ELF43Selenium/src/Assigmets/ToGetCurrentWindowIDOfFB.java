package Assigmets;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetCurrentWindowIDOfFB {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getWindowHandle());

	}

}
