package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersIParellelExcecution {
	@DataProvider(parallel = true) // @DataProvider it is only execute single
	public String[] data() {
		String[] arr = { "https://aranya.gov.in/", "https://demowebshop.tricentis.com/",
				"https://trello.com/w/userworkspace22036752/home", "https://firelawn.com/",
				"https://www.kalkifashion.com/" };
		return arr;
	}

	@Test(dataProvider = "data")
	public void test(String url) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);
	}
}
