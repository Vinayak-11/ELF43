 package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSourceCodeOfThePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://online.kfc.co.in/");
		String sourceCodeOfPage = driver.getPageSource();
		System.out.println(sourceCodeOfPage);
	}

}
