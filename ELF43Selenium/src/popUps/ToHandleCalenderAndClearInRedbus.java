package popUps;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleCalenderAndClearInRedbus {

	public static void main(String[] args) {
		LocalDateTime systemDatetime = LocalDateTime.now().plusYears(1);
		String monthName = systemDatetime.getMonth().name();
		int year = systemDatetime.getYear();
		int date = systemDatetime.getDayOfMonth();
		String month = " "+monthName.charAt(0)+monthName.substring(1, 3).toLowerCase();
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebDriverWait explicitWait=new WebDriverWait(driver,15);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Actions actions=new Actions(driver);
		
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//label[text()='Date']/..")).click();
		//driver.findElement(By.xpath("/td[text()='"+month+" "+year+"']/../..//td[text()='"+date+"']")).click();
		//driver.findElement(By.xpath("//td[text()='"+date+"']")).click();
		for(;;) {
			try {
			driver.findElement(By.xpath("//td[text()='"+month+" "+year+"']/../..//td[text()='"+date+"']")).click();
			break;
			}
			catch(NoSuchElementException e) {
				driver.findElement(By.xpath("//button[text()='>']"));
			}
		}
		
	}

}
