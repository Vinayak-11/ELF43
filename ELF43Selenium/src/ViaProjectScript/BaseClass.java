package ViaProjectScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import dataDriven.ReadData;



public class BaseClass {
	public WebDriver drivers;
	public Actions action;
	public WebDriverWait explicitWait;

	@Parameters("browserName")
	@BeforeClass
	public void browserSetUp(@Optional("chrome") String bname) {
		// Step1:Launching a browser
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");//popup handels
		if (bname.equalsIgnoreCase("chrome")) {
			System.setProperty(ReadData.fromPropertyFile("key"), ReadData.fromPropertyFile("path"));
			drivers = new ChromeDriver(options);
			Reporter.log("Empty Chrome Browser is launched Successfully", true);
		} else if (bname.equalsIgnoreCase("edge")) {
			drivers = new EdgeDriver();
			Reporter.log("Empty Edge Browser is launched Successfully", true);
		} else {
			throw new InvalidBrowserValueException();
		}
		drivers.manage().window().maximize();
		Reporter.log("Browser Window is maximized");
		drivers.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Step2:Navigating to the url
		drivers.navigate().to(ReadData.fromPropertyFile("url").toString());
		action = new Actions(drivers);
		action.click().perform();
		
		//String expectedTitle = drivers.getTitle();
		//Assert.assertEquals(ReadData.fromPropertyFile("actualTitle"), expectedTitle, "Home Page Is Displayed");

	}

	@AfterClass(alwaysRun = true)
	public void browserTermination() { 
		//drivers.quit();
	}

}

class InvalidBrowserValueException extends RuntimeException {
	InvalidBrowserValueException() {
		super("Invalid Browser value is passed");
	}
}
