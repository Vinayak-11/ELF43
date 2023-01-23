package keyBoardAndMouseStimulationActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToperformdragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver,15);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frameElement);
		
		//Photo Manager
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement trash = driver.findElement(By.id("trash"));
		WebElement galary = driver.findElement(By.id("gallery"));
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(image1, trash).perform();
		actions.dragAndDrop(image2, trash).perform();
		actions.dragAndDrop(image3, trash).perform();
		actions.dragAndDrop(image4, trash).perform();
		actions.dragAndDrop(image1, galary).perform();
		actions.dragAndDrop(image2, galary).perform();
		
		//actions.dragAndDropBy(image4, -282,85);
		actions.clickAndHold(image3).moveToElement(trash).release().perform();
		driver.switchTo().defaultContent();
		
		//Accepted Elements
		//explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='Accepted Elements']")));
		driver.findElement(By.xpath("//li[text()='Accepted Elements']")).click();
		WebElement frameElement2 = driver.findElement(By.xpath("//iframe[contains(@data-src,'accepted-elements.html')]"));
		driver.switchTo().frame(frameElement2);
		WebElement dragMeToTarget = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement acceptDraggable = driver.findElement(By.id("droppable"));
		WebElement cantDraggable = driver.findElement(By.id("draggable-nonvalid"));
		 
		actions.dragAndDrop(dragMeToTarget, acceptDraggable).perform();
		actions.clickAndHold(cantDraggable).moveToElement(acceptDraggable).release().perform();
		explicitWait.until(ExpectedConditions.visibilityOf(acceptDraggable));
		System.out.println(acceptDraggable.getText());

	}

}
