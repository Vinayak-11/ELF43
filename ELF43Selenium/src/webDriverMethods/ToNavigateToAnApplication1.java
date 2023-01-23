package webDriverMethods;

import org.openqa.selenium.opera.OperaDriver;

public class ToNavigateToAnApplication1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.opera.driver", "./drivers/operadriver.exe");
		OperaDriver driver = new OperaDriver();
		driver.get("https://www.abhibus.com");

	}

}
