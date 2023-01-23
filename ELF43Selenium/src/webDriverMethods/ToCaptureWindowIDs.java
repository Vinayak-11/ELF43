package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureWindowIDs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://pizzaonline.dominos.co.in/");
		System.out.println(driver.getWindowHandles());

	}

}
