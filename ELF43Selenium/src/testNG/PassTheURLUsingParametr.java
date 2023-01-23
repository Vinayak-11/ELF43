package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassTheURLUsingParametr {
		@Parameters("URL")
		@Test
		public void create(@Optional("https://aranya.gov.in")String parameter) {
			System.out.println("Parameter is Passed");
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(parameter);
		}

	}


