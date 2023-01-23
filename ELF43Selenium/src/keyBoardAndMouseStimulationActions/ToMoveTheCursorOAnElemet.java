package keyBoardAndMouseStimulationActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ToMoveTheCursorOAnElemet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.reliancedigital.in/");
		driver.findElement(By.xpath("//button[text()='No, don’t.']")).click();
		WebElement cameraNavBarElement = driver.findElement(By.xpath("//div[text()='Cameras']"));
		
		Actions actions= new Actions(driver);
		actions.moveToElement(cameraNavBarElement).perform();
		driver.findElement(By.linkText("DSLR Cameras")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
