package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureWindowID {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://pizzaonline.dominos.co.in/");
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
	}

}
