package Assigmets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToDragandDropInTrello {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver,15);
		
		driver.get("https://trello.com/en/login");
		driver.findElement(By.id("user")).sendKeys("vnmalagavi.003@gmail.com",Keys.ENTER);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Log in']")));
		driver.findElement(By.id("password")).sendKeys("Vnmalagavi@003",Keys.ENTER);
		
		driver.findElement(By.xpath("//div[text()='Asgnmnt']")).click();
		//explicitWait.until(ExpectedConditions.elementToBeClickable(Manual));
		WebElement MockCompleted = driver.findElement(By.xpath("//span[text()='Mock Completed']"));
		WebElement MockScheduled = driver.findElement(By.xpath("//span[text()='Mock Scheduled']"));
		WebElement MockPending = driver.findElement(By.xpath("//span[text()='Mock Pending']"));
		WebElement Manual = driver.findElement(By.xpath("(//span[text()='Add a card'])[2]"));
		WebElement Java = driver.findElement(By.xpath("(//span[text()='Add a card'])[3]"));
		WebElement Selenium = driver.findElement(By.xpath("(//span[text()='Add a card'])[4]"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(MockCompleted, Manual).perform();
		actions.dragAndDrop(MockScheduled, Java).perform();
		actions.dragAndDrop(MockPending, Selenium).perform();
		
		
		//Create a Board
		//driver.findElement(By.xpath("//span[text()='Create new board']")).click();
		//driver.findElement(By.xpath("//input[contains(@data-testid,'create-board-title-input')]")).sendKeys("Assignment");
		//driver.findElement(By.xpath("//button[text()='Create']")).click();
		
		//Status Creation
		//driver.findElement(By.xpath("//input[@placeholder='Enter list title…']")).sendKeys("Status",Keys.ENTER);
		//driver.findElement(By.xpath("//input[@placeholder='Enter list title…']")).sendKeys("Manual",Keys.ENTER);
		//driver.findElement(By.xpath("//input[@placeholder='Enter list title…']")).sendKeys("Java",Keys.ENTER);
		//driver.findElement(By.xpath("//input[@placeholder='Enter list title…']")).sendKeys("Seleium",Keys.ENTER);
		//driver.findElement(By.xpath("//a[@aria-label='Cancel list editing']")).click();
		
		//driver.findElement(By.xpath("(//span[text()='Add a card'])[1]")).sendKeys("Mock Completed",Keys.ENTER);
		//driver.findElement(By.xpath("(//span[text()='Add a card'])[1]")).sendKeys("Mock Scheduled",Keys.ENTER);
		//driver.findElement(By.xpath("(//span[text()='Add a card'])[1]")).sendKeys("Mock Pending");
		
		
		

	}

}
