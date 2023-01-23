package keyBoardAndMouseStimulationActions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ToDoAllKindOfClickActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver,15);
		
		driver.get("https://trello.com/en/login");
		driver.findElement(By.id("user")).sendKeys("vnmalagavi.003@gmail.com",Keys.ENTER);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Log in']")));
		driver.findElement(By.id("password")).sendKeys("Vnmalagavi@003",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='ELF43']")).click();
		WebElement contentclick=driver.findElement(By.xpath("//span[text()='Mock Scheduled']"));
		Actions actions=new Actions(driver);
		actions.contextClick(contentclick).perform();
		List<WebElement> title = driver.findElements(By.xpath("//div[contains(@class,'quick-card-editor-buttons')]"));
		for(WebElement menu:title) {
			System.out.println(menu.getText());
		}
		
		
		
	}

}
