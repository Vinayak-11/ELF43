package pOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import elementRepository.BUsHomePage;
import elementRepository.BasePage;

public class POMActionsOnBusinViaApplication {
	@Test
	public void searchBusforThreeDifferentFromAndTo() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://in.via.com/");
		
		BasePage basePage = new BasePage(driver);
		basePage.getBusNavBarIcon().click();
		BUsHomePage busHomePage = new BUsHomePage(driver);
		busHomePage.getFromTextField().sendKeys("Banaglore");
		busHomePage.getBangaloreSearchSuggestion().click();
		busHomePage.getFromTotextField().sendKeys("Goa");
		busHomePage.getGoaSearchSuggestion().click();
		busHomePage.getDeptDateTextField().click();
		driver.findElement(By.xpath("//span[.='Jan 2023']/../..//div[text()='15']")).click();
		busHomePage.getSearchBusbutton().click();
		
		Thread.sleep(2000);
		driver.navigate().back();
		busHomePage.getFromTextField().clear();
		busHomePage.getFromTextField().sendKeys("Chennai");
		busHomePage.getBangaloreSearchSuggestion().click();
		busHomePage.getFromTotextField().clear();
		busHomePage.getFromTotextField().sendKeys("Hyderabad");
		busHomePage.getGoaSearchSuggestion().click();
		busHomePage.getDeptDateTextField().click();
		driver.findElement(By.xpath("//span[.='Jan 2023']/../..//div[text()='18']")).click();
		busHomePage.getSearchBusbutton().click();
	}
}
